package home3.task3;

import java.util.regex.Pattern;

public enum DataType {

    FULL_NAME(Pattern.compile("^[a-zA-Z\\s-]{1,}$")),
    PHONE_NUMBER(Pattern.compile("^(\\+380)\\d{9}$")),
    EMAIL(Pattern.compile("^[0-9a-zA-Z\\s_-]{1,}[@][0-9a-zA-Z\\s_-]{1,}[.][0-9a-zA-Z\\s_-]{1,}$"));

    Pattern pattern;

    DataType(Pattern pattern){
        this.pattern = pattern;
    }

    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public String toString(){
        return this.name();
    }
}
