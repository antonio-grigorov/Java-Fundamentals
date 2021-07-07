package TextProcessing;

import java.util.Scanner;

public class ReverseString2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String input=scanner.nextLine();

            while(!"end".equals(input)){

                String reverse=new StringBuilder(input).reverse().toString();

                System.out.printf("%s = %s%n",input,reverse);
                input=scanner.nextLine();

            }



    }
}
