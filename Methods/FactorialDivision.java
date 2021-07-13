package com.company;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",factorial1(a)/factorial2(b));

    }

    private static double factorial1(int a) {
        double result=1;
        for (int i = 1; i <=a ; i++) {
            result*=i;
        }
        return result;
    } private static double factorial2(int b) {
        double result=1;
        for (int i = 1; i <=b ; i++) {
            result*=i;
        }
        return result;
    }
}
