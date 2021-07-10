package com.company;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());

        for (char first = 'a'; first < 97+number ; first++) {

            for (char second='a'; second<'a'+number ;second++) {
                ;
                for (char third='a'; third<'a'+number ; third++) {
                    System.out.printf("%c%c%c",first,second,third);
                    System.out.println();

                }


            }

        }
    }
}
