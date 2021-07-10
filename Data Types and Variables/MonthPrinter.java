package com.company;

import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        String month=null;

        switch (number){
            case 1: month="January";
            break;
            case 2: month="February"; break;

            default: month="Error"; break;


        }
        System.out.println(month);

    }
}
