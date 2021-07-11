package com.company;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine=scanner.nextLine();
        String[] toBeReversed=inputLine.split(" ");

        for (int i = 0; i <toBeReversed.length/2 ; i++) {

            String tmp=toBeReversed[i];
            toBeReversed[i]=toBeReversed[toBeReversed.length-i-1];
            toBeReversed[toBeReversed.length-1-i]=tmp;
        }
        for (int i = 0; i <toBeReversed.length ; i++) {
            System.out.print(toBeReversed[i]+" ");

        }


    }
}
