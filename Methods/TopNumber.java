package com.company;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int[] divisibleBy8= sum(number);
        oneOddDigit(divisibleBy8);

    }
    private static void oneOddDigit(int[] divisibleBy8) {

        for (int i = 0; i <divisibleBy8.length; i++) {
            boolean hasOddNumber=false;
            int tmp=divisibleBy8[i];
            while(tmp>0){
                if((tmp%10)%2==1){
                    hasOddNumber=true;
                    System.out.println(divisibleBy8[i]);
                    break;
                }
                tmp=tmp/10;
            }


        }
    }
    private static int[] sum(int number) {
        int[] divisibleBy8=new int[1000];
        int sum=0;
        int i=0;
        int tmp=0;
        for (int j = 1; j <=number ; j++) {
            tmp=j;
            while(tmp>0) {
                sum+=tmp%10;
                tmp=tmp/10;

            }
            if(sum%8==0) {

                divisibleBy8[i]=j;
                i++;

            }
            sum=0;

        }

        return divisibleBy8;
    }




}
