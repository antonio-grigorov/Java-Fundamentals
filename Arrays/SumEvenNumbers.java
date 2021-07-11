package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine=scanner.nextLine();
        String[] items=inputLine.split(" ");
        int[] arr= Arrays.stream(items).mapToInt(i->Integer.parseInt(i)).toArray();

        int sum=0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]%2==0){
                sum+=arr[i];
            }

        }
        System.out.println(sum);





    }
}
