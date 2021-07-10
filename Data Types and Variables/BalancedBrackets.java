package com.company;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfLines = Integer.parseInt(scanner.nextLine());
        boolean isBalanced = true;
        char openingBracket = '(';
        char closingBracket = ')';
        int count = 0;

        for (int i = 0; i < numberOfLines; i++) {
            String input = scanner.nextLine();



//            if(input.length()>1){
//
//            }
            if(input.length()==1){
              char  charInput = input.charAt(0);
            int compareWithOpening = Character.compare(charInput, openingBracket);
            int compareWithClosing = Character.compare(charInput, closingBracket);


            if (charInput == openingBracket) {
                count += 1;
            }
            if (charInput == closingBracket)
                count -= 1;

            if (count < 0) {
                isBalanced = false;
            }}


        }
        if (isBalanced && count==0) {


            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }



}
