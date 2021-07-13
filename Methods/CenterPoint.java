package com.company;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1=Double.parseDouble(scanner.nextLine());
        double y1=Double.parseDouble(scanner.nextLine());
        double x2=Double.parseDouble(scanner.nextLine());
        double y2=Double.parseDouble(scanner.nextLine());
        if(firstPointDistance(x1,y1)<=secondPointDistance(x2,y2)){
            System.out.printf("(%.0f, %.0f)",x1,y1);
        }
        else{
            System.out.printf("(%.0f, %.0f)",x2,y2);
        }


    }

    private static double secondPointDistance(double x2, double y2) {
        double distance=Math.sqrt(x2*x2+y2*y2);
                return distance;
    }

    private static double firstPointDistance(double x1, double y1) {
        double distance=Math.sqrt(x1*x1+y1*y1);
        return distance;

    }
}
