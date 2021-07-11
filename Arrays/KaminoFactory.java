package com.company;

import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dnaLength = Integer.parseInt(scanner.nextLine());
        String input = "";
        int currentIndex = dnaLength - 1;
        int bestIndex = dnaLength;
        int currentSum = 1;
        int bestSum = 0;
        int tmpsumOfAll = 0;
        int tmpbestSumOfAll = 0;
        int count=0;
        int bestcount=0;


        int[] finalDna = new int[dnaLength];

            while (true) {
            input = scanner.nextLine();
            count+=1;
            if (input.equals("Clone them!")) {
                break;
            }
            String[] inputArr = input.split("!+");
            int[] numbers = new int[inputArr.length];
            for (int i = 0; i < inputArr.length; i++) {
                numbers[i] = Integer.parseInt(inputArr[i]);
            }

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    tmpsumOfAll += numbers[j];
                }

                if (numbers[i] == numbers[i + 1] && numbers[i] == 1) {
                    currentSum += 1;
                    currentIndex = i; }
                 else {
                    currentSum = 1;
                }
                if (currentIndex < bestIndex) {
                    bestIndex = currentIndex;
                    finalDna = numbers;
                    tmpbestSumOfAll=tmpsumOfAll;
                    bestcount=count;
                }
                if (currentSum > bestSum) {
                    bestSum = currentSum;
                    finalDna = numbers;
                    tmpbestSumOfAll=tmpsumOfAll;
                    bestcount=count;
                }
                if (currentIndex == bestIndex) {
                    if(tmpsumOfAll>tmpbestSumOfAll){
                        finalDna=numbers;
                        bestSum=tmpsumOfAll;
                    }
                    else {
                        bestSum=tmpbestSumOfAll;
                    }
                }
                tmpsumOfAll = 0;
            }


        }

        if (input.equals("Clone them!")) {
            System.out.printf("Best DNA sample %d with sum: %d.%n",bestcount, bestSum);
            for (int i = 0; i < finalDna.length; i++) {
                System.out.print(finalDna[i] + " ");

            }
        }


    }

}

