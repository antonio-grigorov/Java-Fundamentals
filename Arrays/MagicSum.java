package com.company;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input=scanner.nextLine().split(" ");
        int[] numbers=new int[input.length];
        int number=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <input.length ; i++) {
            numbers[i]=Integer.parseInt(input[i]);
        }

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {

                    if(numbers[i]+numbers[j]==number){
                    System.out.println(numbers[i] +" "+ numbers[j]);
                }


            }
            
        }
        


    }
}
