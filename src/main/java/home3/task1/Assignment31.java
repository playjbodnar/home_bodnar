package home3.task1;

import java.util.Scanner;

public class Assignment31 {

    static Scanner scanner = new Scanner(System.in);
    static StringTransformer transformer = new StringTransformer();
    static final String HELP =
            "A. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ\n" +
            "B. строка в нижнем регистре\n" +
            "C. С Заглавной Буквы (Первый Символ Каждого Слова В Строке )\n" +
            "D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ\n" +
            "E. Как в предложении(с заглавной буквы).\n" +
            "F. выход из программы\n";


    static String readString(){
        String str = null;
        if(scanner.hasNextLine()){
            str = scanner.nextLine();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Enter string:");
        String sourceString = readString();
        System.out.println("Select mode");
        System.out.println(HELP);
        String mode;
        do {
            mode = readString();
        } while (mode == null);
        System.out.println(transformer.transform(sourceString, mode));

    }
}
