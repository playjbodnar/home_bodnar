package practice2;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Writer;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FilePhraseSearcher extends SimpleFileVisitor<Path>{

    private final String phrase;
    private final Writer writer;

    public FilePhraseSearcher(String phrase, Writer writer) {
        this.phrase = phrase;
        this.writer = writer;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(file));
        String line;
        boolean fileNotPrinted = true;
        while ((line = reader.readLine()) != null){
            if (line.contains(phrase)){
                if(fileNotPrinted) {
                    writer.write(String.valueOf(file.toAbsolutePath()));
                    fileNotPrinted = false;
                }
                writer.write(String.format("\t%d: %s",reader.getLineNumber(), line));
            }
        }
        return FileVisitResult.CONTINUE;
    }


}
