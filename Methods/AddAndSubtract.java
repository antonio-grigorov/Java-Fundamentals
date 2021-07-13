package com.company;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());


       int result=add(a, b)+subtract(c);
        System.out.println(result);
    }

    private static int subtract(int c) {
        int result = -c;
        return result;
    }

    private static int add(int a, int b) {
        int result = a + b;
        return result;
    }
}
