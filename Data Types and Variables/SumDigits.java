package com.company;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a=scanner.nextLine();
        int b=Integer.parseInt(a);
        int sum=0;


        while(b!=0){
            sum+=b%10;
            b=b/10;
        }
        System.out.println(sum);
    }
}
