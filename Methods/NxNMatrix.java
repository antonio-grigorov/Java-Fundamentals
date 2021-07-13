package com.company;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=Integer.parseInt(scanner.nextLine());

        printRow(a);
    }

    private static void printRow(int a) {
        for (int i = 0; i <a ; i++) {
            printLine(a);
            System.out.println();
        }
    }

    private static void printLine(int a) {
        for (int i = 0; i < a; i++) {

        System.out.print(a+ " ");
    }}
}
