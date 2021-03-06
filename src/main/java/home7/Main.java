package home7;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {


    public static void main(String[] args) throws IOException {


        Path file = null;
        String searchedString = null;

        try {
            file = Paths.get(args[0]);
            searchedString = args[1];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Missed parameters");
            System.exit(1);
        }

        FilePhraseSearcher filePhraseSearcher = new FilePhraseSearcher(searchedString, new PrintWriter(System.out));
        try {
            filePhraseSearcher.visitFile(file, Files.readAttributes(file, BasicFileAttributes.class));
        } catch (AccessDeniedException ade) {
            System.err.println(ade.toString());
        } catch (NoSuchFileException nsf) {
            System.err.println(nsf.toString());
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}


