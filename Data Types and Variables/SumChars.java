package com.company;

import java.util.Scanner;

public class SumChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int totalSum=0;


        for (int i = 0; i <n ; i++) {
            String a=scanner.nextLine();
            char z=a.charAt(0);
            totalSum+=z;

        }
        System.out.printf("The sum equals: %d", totalSum);


    }
}
