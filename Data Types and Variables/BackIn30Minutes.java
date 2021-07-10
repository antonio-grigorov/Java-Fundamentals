package com.company;

import java.util.Scanner;

public class BackIn30Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());
        int totalMinutes=hour*60+minutes+30;
        int newHour=totalMinutes/60;
        int newMinutes=totalMinutes%60;

        if(newHour>23)
        {
            newHour-=24;

        }
        System.out.printf("%d:%02d", newHour,newMinutes);




    }
}
