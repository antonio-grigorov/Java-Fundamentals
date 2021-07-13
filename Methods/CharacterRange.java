package com.company;

import java.util.Scanner;

public class CharacterRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1=scanner.nextLine();
        String input2=scanner.nextLine();
        char a=input1.charAt(0);
        char b=input2.charAt(0);

        System.out.println(characterRange(a,b));
    }

    private static String characterRange(char a, char b) {
        String output="";
        if(a<b){
        for (char i = ++a; i <  b; i++) {
            output+=i;
            output+=" ";

        }
        return output;}
        else { for (char i = ++b; i <  a; i++) {
            output+=i;
            output+=" ";

        }
            return output;}




    }
}
