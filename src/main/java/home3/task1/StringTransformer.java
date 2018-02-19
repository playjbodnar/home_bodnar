package home3.task1;

public class StringTransformer {
//
//    private final StringBuilder stringBuilder;
//
//    public StringTransformer(){
//        stringBuilder = new StringBuilder();
//    }

    private String transformToA(String sourceString) {
        return sourceString.toUpperCase();
    }

    private String transformToB(String sourceString) {
        return sourceString.toLowerCase();
    }

    private String transformToC(String sourceString) {
        StringBuilder result = new StringBuilder();
        String[] separateWords = sourceString.split(" ");
        for (int i = 0; i < separateWords.length; i++) {
            result.append(separateWords[i].substring(0, 1).toUpperCase())
                    .append(separateWords[i].substring(1).toLowerCase())
                    .append(" ");
        }
        return result.toString();
    }

    private String transformToD(String sourceString) {
        StringBuilder result = new StringBuilder();
        String[] separateWords = sourceString.split(" ");
        for (int i = 0; i < separateWords.length; i++) {
            result.append(separateWords[i].substring(0, 1).toLowerCase())
                    .append(separateWords[i].substring(1).toUpperCase())
                    .append(" ");
        }
        return result.toString();
    }

    private String transformToE(String sourceString) {
        StringBuilder result = new StringBuilder();
        result.append(sourceString.substring(0, 1).toUpperCase())
                .append(sourceString.substring(1).toLowerCase());
        return result.toString();
    }

    public String transform(String sourceString, String modeId) {
        switch (modeId.toLowerCase()) {
            case "a":
                return transformToA(sourceString);
            case "b":
                return transformToB(sourceString);
            case "c":
                return transformToC(sourceString);
            case "d":
                return transformToD(sourceString);
            case "e":
                return transformToE(sourceString);
            case "f":
                System.exit(0);
            default:
                System.out.printf("%s is an invalid mode Id. %nSelect from: A,B,C,D,E,F", modeId);
                return null;
        }
    }


}
