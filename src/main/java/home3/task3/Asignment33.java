package home3.task3;

import java.util.Scanner;
import static home3.task3.DataType.*;

public class Asignment33 {

    static Scanner scanner = new Scanner(System.in);
    static StringBuilder dataErrorString = new StringBuilder();
    static DataValidator validator = new DataValidator();

    static String getDataValue(String dataTitle) {
        //не надо создавать строку, лучше null присвоить
        String validatedString = new String();
        System.out.printf("enter %s %n", dataTitle);
        if(scanner.hasNextLine()) {            
            validatedString = scanner.nextLine();
        }
        return validatedString;
    }

    static void validateData(String dataValue, DataType dataType){
        if(!(validator.isDataValid(dataType, dataValue))){
            dataErrorString.append(String.format("Incorrect value: %s - %s %n", dataType, dataValue));
        }
    }

    public static void main(String[] args) {
        String line;
        line = getDataValue("Full name");
        validateData(line, FULL_NAME);
        line = getDataValue("Phone number");
        validateData(line, PHONE_NUMBER);
        line = getDataValue("Email");
        validateData(line, EMAIL);
        System.out.println(dataErrorString);
    }

}
