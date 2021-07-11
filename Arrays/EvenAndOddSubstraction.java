package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] elements = inputLine.split(" ");
        int[] arr = Arrays.stream(elements).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < elements.length; i++) {

            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];

            }

        }

        System.out.println(sumEven-sumOdd);
    }
}
