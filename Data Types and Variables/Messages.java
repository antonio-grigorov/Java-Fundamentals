package com.company;
import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < totalNumbers; i++) {

            String input = scanner.nextLine();
            int length = (int) (input.length());

            if (input.equals("0")) {
                System.out.print(" ");
                continue;
            }
            int mainDigit = (int) (input.charAt(0));
            mainDigit -= 48;

            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }
            int letterIndex = (offset + length - 1);
            char letter = (char) (97 + letterIndex);

            System.out.print(letter);

        }
    }
}
