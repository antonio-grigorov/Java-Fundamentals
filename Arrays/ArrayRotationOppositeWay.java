package com.company;

import java.util.Scanner;

public class ArrayRotationOppositeWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine=scanner.nextLine().split(" ");
        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String tmp=inputLine[inputLine.length-1];
            for (int j = 0; j <inputLine.length-1 ; j++) {
                inputLine[inputLine.length-1-j]=inputLine[inputLine.length-2-j];
            }
            inputLine[0]=tmp;
        }
        System.out.println(String.join(" ",inputLine));
    }
}
