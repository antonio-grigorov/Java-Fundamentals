package com.company;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coins = "";
        double totalCoins = 0;

        while (!coins.equals("Start")) {
            coins = scanner.nextLine();
            if(coins.equals("Start")) { continue;}
            double coin = Double.parseDouble(coins);
            if (coin == 2 || coin == 1 || coin == 0.5 || coin == 0.2 || coin == 0.1) {
                totalCoins += coin;
            } else {
                System.out.printf("Cannot accept %.2f", coin);
            }
        }


            String nuts = "2.0";
            String water = "0.7";
            String crisps = "1.5";
            String soda = "0.8";
            String coke = "1.0";
            String product="";

            while (!product.equals("End")) {
                product=scanner.nextLine();
                if(product.equals("End")) { continue;}

                if(product.equals("Nuts")) {
                    if(totalCoins>=Double.parseDouble(nuts)){
                    System.out.println("Purchased Nuts");
                    totalCoins-=Double.parseDouble(nuts);
                    }
                    else {
                        System.out.println("Sorry, not enough money");}
            }
                if(product.equals("Water")) {
                    if(totalCoins>=Double.parseDouble(water)){
                        System.out.println("Purchased Water");
                    totalCoins-=Double.parseDouble(water);
                    }
                    else {
                        System.out.println("Sorry, not enough money");}
                }
                if(product.equals("Crisps")) {
                    if(totalCoins>=Double.parseDouble(crisps)) {
                        System.out.println("Purchased Crisps");
                        totalCoins -= Double.parseDouble(crisps);
                    }
                    else {
                        System.out.println("Sorry, not enough money");}
                }
                if(product.equals("Soda")) {
                    if(totalCoins>=Double.parseDouble(soda)){
                        System.out.println("Purchased Soda");
                    totalCoins-=Double.parseDouble(soda);}
                    else {
                        System.out.println("Sorry, not enough money");}
                }
                if(product.equals("Coke")) {
                    if(totalCoins>=Double.parseDouble(coke)){
                        System.out.println("Purchased Coke");
                    totalCoins-=Double.parseDouble(coke);}
                    else {
                        System.out.println("Sorry, not enough money");}
                }
                else if(!product.equals("Nuts") && !product.equals("Water") && !product.equals("Crisps") && !product.equals("Soda") && !product.equals("Coke"))
                {System.out.println("Invalid product");}




        }
            System.out.printf("Change: %.2f", totalCoins);




    }
}
