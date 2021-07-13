package com.company;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        if(characterValidity(password).equals("") &&
                (consistsOnlyDigitsAndLetters(password)).equals("") &&
                (consists2Digits(password)).equals("")){
            System.out.println("Password is valid");
        }

        if(!characterValidity(password).equals("")){System.out.println(characterValidity(password));}
        if(!(consistsOnlyDigitsAndLetters(password)).equals("")) {System.out.println(consistsOnlyDigitsAndLetters(password));}
        if(!(consists2Digits(password)).equals("")) {System.out.println(consists2Digits(password));;}




    }

    private static String consists2Digits(String password) {
        int count=0;

        String result="";
        for (int i = 0; i <password.length() ; i++) {
            if(password.charAt(i)>=48 && password.charAt(i)<=58){
                count++;
            }
        }
        if(count<2){
            result="Password must have at least 2 digits";

        }
        return result;
    }

    private static String consistsOnlyDigitsAndLetters(String password) {
        String result = "";


        for (int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) < 48 || (password.charAt(i)>=58 && password.charAt(i)<=64) || (password.charAt(i) > 90 && password.charAt(i) < 97) || password.charAt(i) > 122)) {
                result = "Password must consist only of letters and digits";

                break;
            }
        }
        return result;
    }

    private static String characterValidity(String password) {
        String valid="";

        if (password.length() < 6 || password.length() > 10) {
            valid ="Password must be between 6 and 10 characters";

        }
        return valid;
    }

}
