package home3.task2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Assignment32 {

    static Scanner  scanner = new Scanner(System.in);
    public static final String LETTERS = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwzxy";
//  public static final String LETTERS_WITH_SPACE = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwzxy ";

    public static int[] countCharacters(String string) {
        int[] characterIdsArray = new int[256];
        for (int i = 0; i < string.length(); i++) {
            characterIdsArray[(int) string.charAt(i)]++;
        }
        return characterIdsArray;
    }


    public static void printCharactersCount(int[] characterCount){
        for(int i = 0;i < characterCount.length; i++){
            if(characterCount[i] > 0){
                System.out.printf("%s  :   %d%n",(char)i, characterCount[i]);
            }
        }
    }

    public static void main(String[] args) {
        String string = null;
        System.out.println("Enter string");
        if(scanner.hasNextLine()){
            string = scanner.nextLine();
            for (int i = 0; i < string.length(); i++) {
                if(LETTERS.indexOf(string.charAt(i)) == -1){
                    System.out.println("Invalid string. Enter latin letters only");
                    System.exit(0);
                }
            }
            printCharactersCount(countCharacters(string));
        }
    }

}

