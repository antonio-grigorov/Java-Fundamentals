package TextProcessing;

import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String[] finalInput = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("|")) {
                finalInput[i] = input[i];
            }
        }
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", // a b c d e f g h i
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", // j k l m n o p q r
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." }; // s t u v w x y z
        StringBuilder result=new StringBuilder();
        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <morse.length ; j++) {
                if(finalInput[i]==null){
                    result.append(" ");
                     break;
                }
                else if(finalInput[i].equals(morse[j])){
                    result.append((char) (j + 65));
                    break;

                }

            }

        }
        System.out.println(result);


    }
}

//String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
//        "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
//        "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
//        ",", ".", "?" };