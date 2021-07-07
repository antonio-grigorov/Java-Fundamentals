package TextProcessing;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first=scanner.nextLine();
        String second=scanner.nextLine();
        String var="";

        if( first.charAt(0)> second.charAt(0)){
            var=first;
            first=second;
            second=var;
        }
        String input=scanner.nextLine();
        int result=0;

        for (int i = 0; i <input.length(); i++) {
            char currentSymbol=input.charAt(i);
            if(currentSymbol>first.charAt(0) && currentSymbol<second.charAt(0)){

                result+=currentSymbol;
            }
        }
        System.out.println(result);





    }
}
