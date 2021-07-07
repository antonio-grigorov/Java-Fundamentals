package TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        StringBuilder result=new StringBuilder();

        for (int i = 0; i <input.length() ; i++) {

            char symbol=(char) (input.charAt(i)+3);

            result.append(symbol);

        }
        System.out.println(result);
    }
}
