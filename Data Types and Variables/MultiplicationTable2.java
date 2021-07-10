package com.company;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multi1=Integer.parseInt(scanner.nextLine());
        int multi2=Integer.parseInt(scanner.nextLine());

        for (int i = multi2; i <=10 ; i++) {


            System.out.println(multi1 +" X "+i+" = " + multi1*i);


        }
        if(multi2>10){
            System.out.println(multi1 +" X "+multi2+" = " + multi1*multi2);
        }
    }
}
