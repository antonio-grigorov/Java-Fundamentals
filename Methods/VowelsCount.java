package com.company;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        System.out.println(countvowels(input));
    }

    private static int countvowels(String input) {
        int count=0;

        for (int i = 0; i <input.length() ; i++) {

            if(input.charAt(i)=='a' ||
                    input.charAt(i)=='e' ||
                    input.charAt(i)=='o' ||
                    input.charAt(i)=='i' ||
                    input.charAt(i)=='y'||
                    input.charAt(i)=='u' ||
                    input.charAt(i)=='A'||
                    input.charAt(i)=='E'||
                    input.charAt(i)=='O'||
                    input.charAt(i)=='I'||
                    input.charAt(i)=='U'||
                    input.charAt(i)=='Y' ) {

                count++;
            }

        }
        return count;
    }
}
