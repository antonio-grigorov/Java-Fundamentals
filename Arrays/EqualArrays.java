package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String firstLine=scanner.nextLine();
//        String secondLine=scanner.nextLine();
        int sum=0;
        int length=0;

        int[] first= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int[] second= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();



        if(first.length>second.length){
            length=first.length;

        }
        else { length=second.length;}

        for (int i = 0; i <length ; i++) {

            if(first[i]!=second[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                return;

            }
            sum+=first[i];
        }

        System.out.printf("Arrays are identical. Sum: %d",sum);
            
        }

    }

