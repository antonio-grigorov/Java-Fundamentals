package com.company;

import java.util.Scanner;

public class PrintPartOfASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndex=Integer.parseInt(scanner.nextLine());
        int endIndex=Integer.parseInt(scanner.nextLine());

        for (int i = startIndex; i <=endIndex ; i++) {
            char a=(char) i;
            System.out.print(a+" ");


        }

    }
}
