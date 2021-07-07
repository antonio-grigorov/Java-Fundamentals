package TextProcessing;

import java.util.Scanner;

public class StringExplosion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        int power = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol == '>') {
                result.append(currentSymbol);
                power += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
            } else if (power == 0) {
                result.append(currentSymbol);
            } else {
                power -= 1;


            }
        }
        System.out.println(result);


    }
}
