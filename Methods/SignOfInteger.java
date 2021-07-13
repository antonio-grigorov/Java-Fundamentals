package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());

        checkNumber(number);
    }

    private static void checkNumber(int a) {
        String result="negative";
        if(a==0){
            result="zero";
        }
        if(a>0){
            result="positive";
        }
        System.out.printf("The number %d is %s.",a,result);
    }


}
