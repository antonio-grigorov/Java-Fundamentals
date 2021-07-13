package com.company;

import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        int[] tribonacciSequence=new int[num];
        if(num>=1) tribonacciSequence[0]=1;
        if(num>=2)tribonacciSequence[1]=1;
        if(num>=3)tribonacciSequence[2]=2;

        tribonacciSequenceMethod(num,tribonacciSequence);
        printArray(tribonacciSequence);


    }

    private static void printArray(int[] tribonacciSequence) {
        for (int i = 0; i <tribonacciSequence.length ; i++) {
            System.out.print(tribonacciSequence[i]+" ");

        }
    }

    private static void tribonacciSequenceMethod(int num, int[] initialtribonacciSequence) {

        for (int i = 3; i <num ; i++) {
            initialtribonacciSequence[i]=initialtribonacciSequence[i-1]+initialtribonacciSequence[i-2]+initialtribonacciSequence[i-3];

        }

    }
}
