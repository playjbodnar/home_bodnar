package home8;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Writer;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class FileWordsCounter extends SimpleFileVisitor<Path> {

    private final Writer writer;
    private static final String SEPARATORS_REGEX = "(,|\\.|!|\\?|:|;|@|\\s)";
    private static final String[] SEPARATORS = {",",".",":",";","?","@","\r","\n","\t","\f","\\v"," "};
    public FileWordsCounter(Writer writer) {
        this.writer = writer;
    }

    private boolean containsSeparators(String line){
        for(int i = 0; i< SEPARATORS.length; i++) {
            if(line.contains(SEPARATORS[i])){
                return true;
            }
        }
        return false;
    }

    private List<String> parseLine(String line) {
        List<String> words = new ArrayList<>();
        if((line.length() == 0) || (line == null)){
            return words;
        }
        if(!containsSeparators(line)){
            words.add(line);
            return words;
        } else {
             for(String word: Arrays.asList(line.split(SEPARATORS_REGEX))) {
                 words.addAll(parseLine(word));
             }
             return words;
        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        try (LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(file))) {
            String line;
            Map<String, Integer> wordsCounter = new HashMap<>();
            while ((line = reader.readLine()) != null) {
                for (String word: parseLine(line)) {
                    if (wordsCounter.containsKey(word)) {
                        wordsCounter.put(word, wordsCounter.get(word) + 1);
                    } else {
                        wordsCounter.put(word, 1);
                    }
                }
            }
            for (String word : wordsCounter.keySet()) {
                writer.write(String.format("%s   -   %d%n", word, wordsCounter.get(word)));
            }
            writer.flush();
        }
        return FileVisitResult.CONTINUE;
    }

}
