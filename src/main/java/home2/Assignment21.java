package home2;

import java.util.Scanner;

/**
Нужно сделать так, чтобы рамка подстраивалась под 
самую большую строку. В данном решение же есть конастантная ширина 100
Вот пример большого ФИО :

Print FIO
dfgdfgdfgdfglker;gk;dlfkg;dlfkg;dflkgdfgdfgjh dfkjghdfkjghdfkjhgkdjfhgkdjfhgdfkjg kjdhfgkjdhfgkjhdfkjghdfkjghdfkjghdkfjghdfkjgh
****************************************************************************************************
*                                        РљСѓСЂСЃ: Java core                                       *
*                                          РЎС‚СѓРґРµРЅС‚                                          *
* dfgdfgdfgdfglker;gk;dlfkg;dlfkg;dflkgdfgdfgjh dfkjghdfkjghdfkjhgkdjfhgkdjfhgdfkjg kjdhfgkjdhfgkjhdfkjghdfkjghdfkjghdkfjghdfkjgh*
****************************************************************************************************
**/
public class Assignment21 {

    //проверка длинны фио
    // буква W
    // if? нечетным может быть также общая длинна

    final static  Scanner scanner = new Scanner(System.in);
    final static int STRING_LENGTH = 100;
    final static String FIRST_TITLE = "Курс: Java core";
    final static String SECOND_TITLE = "Студент";


    public static String buildLine(int count, String unit){
        String str = "";
        for(int i = 0;i < count;i++){
            str = str + unit;
        }
        return  str;
    }

    public static String formatTitle(String title){
        int titleLength = title.trim().length();
        int spaceConunt = STRING_LENGTH - 2 - titleLength ;
        String spases = buildLine(spaceConunt/2, " ");
        if (titleLength % 2 == 0){
            return String.format("*%s%s%s*",spases,title, spases);
        } else {
            return String.format("* %s%s%s*",spases,title, spases);
        }

    }

    public static void main(String[] args) {
        System.out.println("Print FIO");
        String fio = scanner.nextLine();
        System.out.println(buildLine(STRING_LENGTH, "*"));
        System.out.println(formatTitle(FIRST_TITLE));
        System.out.println(formatTitle(SECOND_TITLE));
        System.out.println(formatTitle(fio));
        System.out.println(buildLine(STRING_LENGTH, "*"));
    }
}
