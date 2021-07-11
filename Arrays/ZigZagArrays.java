package com.company;
import java.util.Scanner;
public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];


        for (int i = 0; i <n ; i++) {
            String[] input=scanner.nextLine().split(" ");
            String firstElement=input[0];
            String secondElement=input[1];
            if(i%2==0){
                arr1[i]=firstElement;
                arr2[i]=secondElement;
            } else {
                arr1[i]=secondElement;
                arr2[i]=firstElement;

            } }
            System.out.print(String.join(" ",arr1));
        System.out.println();

            System.out.print(String.join(" ",arr2));
        }
    }

