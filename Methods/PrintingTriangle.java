package com.company;
import java.util.Scanner;
public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printTriangle(n);
    }

    private static void printTriangle(int n) {
        printTopHalf(n);
        printBottomHalf(n - 1);
    }

    private static void printTopHalf(int rows) {
        for (int i = 1; i <= rows; i++) {
            printRow(1, i);

        }
    }

    private static void printBottomHalf(int n) {
        for (int i = n; i >= 1; i--) {
            printRow(1, i);

        }
    }

    private static void printRow(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

}
