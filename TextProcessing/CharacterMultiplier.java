package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String firstWord = input[0];
        String secondWord = input[1];
        int result = 0;
        int max = Math.max(firstWord.length(), secondWord.length());
        int min = Math.min(firstWord.length(), secondWord.length());

        for (int i = 0; i < max; i++) {
            if (i < min) {
                result += firstWord.charAt(i) * secondWord.charAt(i);
            } else {
                if (firstWord.length() == max) {
                    result += firstWord.charAt(i);
                } else {
                    result += secondWord.charAt(i);
                }
            }

        }
        System.out.println(result);
    }
}