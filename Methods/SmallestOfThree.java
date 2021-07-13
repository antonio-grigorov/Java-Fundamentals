package com.company;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());

        System.out.println(findTheSmallestNumber(a,b,c));
    }

    private static int findTheSmallestNumber(int a, int b, int c) {
        int smallest=a;
        if(b<a && b<c){
            smallest=b;
        }
        if(c<b && c<a){
            smallest=c;
        }
        return smallest;




    }
}
