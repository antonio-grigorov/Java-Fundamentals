package com.company;

import java.util.Scanner;

public class FromLeftToRight2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();     // "1234 5678"
        String[] parts = input.split(" ");
        String part1 = parts[0];               // "1234"
        String part2 = parts[1];               // "5678"
        long number1 = Long.parseLong(part1);  // 1234
        long number2 = Long.parseLong(part2);  // 5678
        long biggest = Math.max(number1, number2);  // 5678
    }

}
