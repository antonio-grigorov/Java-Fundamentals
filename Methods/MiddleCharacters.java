package com.company;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        System.out.println(middleCharacters(input));
    }

    private static String middleCharacters(String input) {
        String output="";
        int middle=input.length()/2;
        if(input.length()%2==1){
            output+=input.charAt(middle);
        }
        else {
            output+=input.charAt(middle-1)+ "" +input.charAt(middle) ;


    }
        return output;
}}
