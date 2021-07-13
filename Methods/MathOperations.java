package com.company;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        String operator=scanner.nextLine();

        int b=Integer.parseInt(scanner.nextLine());



        System.out.println(calculate(a,operator,b));
    }
    public static int calculate(int a, String operator, int b){
        int result=0;
        switch (operator){
            case "+":
                result=a+b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                result=a/b;
                break;
            case "-":
                result=a-b;
                break;

        }
        return result;
    }
}
