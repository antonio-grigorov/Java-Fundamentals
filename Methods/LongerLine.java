package com.company;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1=Double.parseDouble(scanner.nextLine());
        double y1=Double.parseDouble(scanner.nextLine());
        double x2=Double.parseDouble(scanner.nextLine());
        double y2=Double.parseDouble(scanner.nextLine());
        double x3=Double.parseDouble(scanner.nextLine());
        double y3=Double.parseDouble(scanner.nextLine());
        double x4=Double.parseDouble(scanner.nextLine());
        double y4=Double.parseDouble(scanner.nextLine());

        if(firstLine(x1,y1,x2,y2)>=secondLine(x3,y3,x4,y4)){
            if(Math.sqrt(x1*x1+y1*y1)<Math.sqrt(x2*x2+y2*y2)) {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x1,y1,x2,y2);

        }
        else { System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x2,y2,x1,y1); }}

        else { if(Math.sqrt(x3*x3+y3*y3)<Math.sqrt(x4*x4+y4*y4)){
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x3,y3,x4,y4);}
            else { System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x4,y4,x3,y3);}

        }
    }

    private static double secondLine(double x3, double y3, double x4, double y4) {
        double lengthofSecondLine=Math.sqrt(Math.pow(Math.abs(x3-x4),2)+Math.pow(Math.abs(y3-y4),2));
        return lengthofSecondLine;
    }

    private static double firstLine(double x1, double y1, double x2, double y2) {
        double lengthofFirstLine=Math.sqrt(Math.pow(Math.abs(x1-x2),2)+Math.pow(Math.abs(y1-y2),2));
        return lengthofFirstLine;

    }
}
