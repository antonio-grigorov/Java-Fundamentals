package com.company;

import java.util.Scanner;

public class EncryptSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStrings=Integer.parseInt(scanner.nextLine());
        int sum=0;
        int[] finalSums=new int[numberStrings];

        for (int i = 0; i <numberStrings ; i++) {
            String input = scanner.nextLine();

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'a' || input.charAt(j) == 'e' || input.charAt(j) == 'i' || input.charAt(j) == 'o' || input.charAt(j) == 'u' || input.charAt(j) == 'A' || input.charAt(j) == 'E' || input.charAt(j) == 'I' || input.charAt(j) == 'O' || input.charAt(j) == 'U') {
                    sum += input.charAt(j) * input.length();
                } else {
                    sum += input.charAt(j) / input.length();
                }

            }
            finalSums[i] = sum;
            sum = 0;
        }

        for (int i = 0; i <finalSums.length ; i++) {
            for (int j = 0; j <finalSums.length-1 ; j++) {
                int tmp=finalSums[j];
                if(finalSums[j]>finalSums[j+1]){
                    finalSums[j]=finalSums[j+1];
                    finalSums[j+1]=tmp;
                }

            }

        }

            for (int j = 0; j <numberStrings ; j++) {
                System.out.println(finalSums[j]);

    }}}

