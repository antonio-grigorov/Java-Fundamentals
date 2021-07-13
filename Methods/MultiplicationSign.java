package com.company;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());


        int result=(isPositive1(num1)+isPositive2(num2)+isPositive3(num3));
        if(result==3 || result==-1){
            System.out.println("positive");
        }
        if(result==-3 || result == 1){
            System.out.println("negative");
        }
        if(result==2 || result ==-2 || result==0)
        {
            System.out.println("zero");}


    }

    private static int isPositive3(int num3) {
        int count=0;
        if(num3>0) {
            count=1;
        }
        if(num3<0){
            count=-1;
        }
        return count;
    }

    private static int isPositive2(int num2) {
        int count=0;
        if(num2>0) {
            count=1;
        }
        if(num2<0){
            count=-1;
        }
        return count;
    }

    private static int isPositive1(int num1) {
        int count=0;
        if(num1>0) {
            count=1;
        }
        if(num1<0){
            count=-1;
        }
        return count;
    }



}
