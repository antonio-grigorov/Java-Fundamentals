package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        String toPrint2="";
        int count=0;
        toPrint2+=arr[arr.length-1];
        int maxInt=arr[arr.length-1];

        for (int i = arr.length-2; i >=0 ; i--) {

            if(arr[arr.length-1-count]>arr[arr.length-1]) {
                maxInt=arr[arr.length-1-count];
            }
            if(arr[arr.length-2-count]>maxInt) {

                toPrint2=arr[arr.length-2-count]+" "+toPrint2;
            }
            count++;
        }
        System.out.println(toPrint2);


    }
}
