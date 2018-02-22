package home3.task3;

public class DataValidator {


    public boolean isDataValid(DataType type, String data) {
        return type.getPattern().matcher(data).matches();
    }
}
