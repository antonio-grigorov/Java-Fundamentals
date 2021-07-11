package com.company;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers=Integer.parseInt(scanner.nextLine());

        int[] sequenceOfNumbers=new int[numbers];

        for (int i = 0; i <numbers ; i++) {
            sequenceOfNumbers[i]=Integer.parseInt(scanner.nextLine());

        }
        for (int i = numbers-1; i >=0 ; i--) {
            System.out.print(sequenceOfNumbers[i]+" ");

        }





    }
}
