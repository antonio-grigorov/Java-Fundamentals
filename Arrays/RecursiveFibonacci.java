package com.company;
import java.util.Scanner;
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input=Integer.parseInt(scanner.nextLine());;
        if(input<=0){
            return;
        }
        float[] array=new float[50];
        array[0]= 1;
        array[1]= 1;


        for (int i = 2; i <input ; i++) {
            array[i]=array[i-1]+(array[i-2]);

        }
        System.out.printf("%.0f",array[input-1]);

    }
}
