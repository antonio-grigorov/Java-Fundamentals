package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int leftSum = 0;
        int rightSum = 0;
        boolean notEqualSum=true;
        for (int i = 0; i <= arr.length - 1; i++) {
            notEqualSum=false;
            leftSum=0;
            rightSum=0;
            if (i == 0) {
                leftSum = 0;
            }
            if (i == arr.length - 1) {
                rightSum = 0;
            }
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int k = arr.length -1; k > i; k--) {
                rightSum += arr[k];
            }
            if(rightSum==leftSum) {
                System.out.println(i);
                break;
            }
            else { notEqualSum=true;}

        }
        if(notEqualSum){
            System.out.println("no");
        }


        }

    }

