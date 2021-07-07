package TextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements=scanner.nextLine().split("\\s+");
        double sum=0.0;
        for (String element : elements) {
            char first=element.charAt(0);
            char last=element.charAt(element.length()-1);
            String stringNumber=element.substring(1,element.length()-1);
            long number=Integer.parseInt(stringNumber);
            if(Character.isUpperCase(first)){
                sum+=divideFunction(first,number);
            }
            else if(Character.isLowerCase(first)){
                sum+=multiply(first,number);
            }
            if(Character.isLowerCase(last)){
                sum+=addFunction(last,number);
            }
            else if(Character.isUpperCase(last)){
                sum-= substract(last,number);
            }
        }
        System.out.println(String.format("%.2f",sum));

    }
    private static int addFunction(char last, long number) {
        return last-96;
    }

    private static int substract(char last, long number) {

        return last-64;
    }

    private static Double divideFunction(char first, long number) {

        return 1.0*number/(first-64);
    }

    private static long multiply(char first, long number) {
        return number*(first-96);
    }
}
