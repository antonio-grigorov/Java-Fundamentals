package com.company;
import java.util.Scanner;
public class Palindrome2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        int number=Integer.parseInt(input);
        while(true) {


            int[] numberInArray=turnIntegerInArray(number);
            System.out.println(isPal(number, numberInArray));
            input=scanner.nextLine();
            if(input.equals("END")) {
                break;
            }
            number=Integer.parseInt(input);
        }
        }

    private static boolean isPal(int number, int[] numberInArray) {
        boolean isPal=true;
        for (int i = numberInArray.length-1; i >=0; i--) {
            if(number%10!=numberInArray[i]){
                isPal=false;
                break;
            }
            number=number/10;

        }
return isPal;
    }
    private static int[] turnIntegerInArray(int number) {
        int length = String.valueOf(number).length();
        int[] aInArray=new int[length];
        int i=0;
        while(number>0) {

            aInArray[i]=number%10;
            number=number/10;
            i++;
        }
        return aInArray;
    }


}
