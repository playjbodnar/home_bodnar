package home7;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FilePhraseSearcher extends SimpleFileVisitor<Path> {

    private final String phrase;
    private final Writer writer;

    public FilePhraseSearcher(String phrase, Writer writer) {
        this.phrase = phrase;
        this.writer = writer;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        try (LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(file))) {
            String line;
            boolean notPrinted = true;
            while ((line = reader.readLine()) != null) {
                if (line.contains(phrase)) {
                    if (notPrinted) {
                        writer.write(String.valueOf(file.toAbsolutePath()));
                        notPrinted = false;
                    }
                    writer.write(String.format("%n%d:   %s", reader.getLineNumber(), line));
                    writer.flush();
                }
            }
        }
        return FileVisitResult.CONTINUE;
    }
}