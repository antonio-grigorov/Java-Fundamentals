package com.company;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberA=Double.parseDouble(scanner.nextLine());
        double numberB=Double.parseDouble(scanner.nextLine());
        if (numberB > numberA) {
            if (Math.abs(numberB - numberA) < 0.000001) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        else if (numberA > numberB) {
            if (Math.abs(numberA - numberB) < 0.000001) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
