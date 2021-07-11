package com.company;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayAsNumber=Integer.parseInt(scanner.nextLine());
        String[] DaysOfWeek={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if(dayAsNumber>=1 && dayAsNumber<=7) {
            System.out.println(DaysOfWeek[dayAsNumber-1]);
        }
        else {
            System.out.println("Invalid day!");






    }
}}
