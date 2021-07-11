package com.company;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first=scanner.nextLine();
        String second=scanner.nextLine();

        String[] firstLine=first.split(" ");
        String[] secondLine=second.split(" ");

        for (int i = 0; i < secondLine.length; i++) {

            for (int j = 0; j <firstLine.length ; j++) {

                if(secondLine[i].equals(firstLine[j])) {
                    System.out.print(secondLine[i]+" ");
                }

            }

        }



    }
}
