package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfIntegers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();


        while(arrayOfIntegers.length>1){
            int[] condensed=new int[arrayOfIntegers.length-1];
            for (int i = 0; i <arrayOfIntegers.length-1 ; i++) {
                condensed[i]=arrayOfIntegers[i]+arrayOfIntegers[i+1];




            }
            arrayOfIntegers=condensed ;

        }

        System.out.println(arrayOfIntegers[0]);




    }
}
