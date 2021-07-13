package com.company;
import java.util.Scanner;
public class MultiplyEvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvensAndOdds(input));

    }

    private static int getMultipleOfEvensAndOdds(int a) {
        int sumEven=getSumOfEvenDigits(a);
        int sumOdd=getSumOfOddDigits(a);
        return sumEven*sumOdd ;
    }

    private static int getSumOfOddDigits(int a) {

        int sumOdd = 0;
        a=Math.abs(a);
        while (a > 0) {
            int digit =(a % 10);
            if (digit % 2 == 1) {
                sumOdd += digit;
            }
            a = a / 10;
        }
        return sumOdd;
    }

    private static int getSumOfEvenDigits(int a) {
        int sumEven = 0;
        a=Math.abs(a);
        while (a > 0) {
            int digit = (a % 10);
            if (digit % 2 == 0) {
                sumEven += digit;
            }
            a = a / 10;
        }
        return sumEven;
    }
}
