package home8;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {


    public static void main(String[] args) throws IOException {

        Path file = null;
        try {
            file = Paths.get(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missed parameters");
            System.exit(1);
        }

        FileWordsCounter fileWordsCounter = new FileWordsCounter(new PrintWriter(System.out));
        try {
            fileWordsCounter.visitFile(file, Files.readAttributes(file, BasicFileAttributes.class));
        } catch (AccessDeniedException ade) {
            System.err.println(ade.toString());
        } catch (NoSuchFileException nsf) {
            System.err.println(nsf.toString());
        } catch (IOException e) {
            System.err.println(e.toString());
        }

    }

}
