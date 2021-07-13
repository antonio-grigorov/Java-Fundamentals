package com.company;

import java.util.Scanner;

public class GreaterOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        switch (input){
            case "int":
                int a=Integer.parseInt(scanner.nextLine());
                int b=Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(a,b));
                break;
            case "char":
                char c=scanner.nextLine().charAt(0);
                char d=scanner.nextLine().charAt(0);

                System.out.println(getMax(c,d));
                break;
            case "string":
                String e=scanner.nextLine();
                String f=scanner.nextLine();
                System.out.println(getMax(e,f));
                break;


        }

    }

    public static int getMax(int first, int second) {
            if(first>second){
                return first;
            }
            return second;
    }
    public static char getMax(char first, char second) {
        if(first>second){
            return first;
        }
        return second;
    }
    public static String getMax(String first, String second){
        if(first.compareTo(second)>=0){
            return  first;
        }
        return second;
    }




}

