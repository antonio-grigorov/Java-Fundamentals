package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualEleents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int n = arr.length;
        int count = 1;
        int currentMax = 0;
        int finalMax = 0;
        int repInteger = arr[0];
        int finalInteger = arr[0];
        int finalCount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count+=1;
                repInteger = arr[i];
                currentMax = count;
            }
            else  {
                currentMax = 0;
                count = 1;
            }
            if (currentMax > finalMax) {
                finalMax = currentMax;
                finalCount = count;
                finalInteger = repInteger;
            }

        }



        for(int i = 0; i <finalCount;i++)

        {
            System.out.print(finalInteger + " ");
        }

    }}

