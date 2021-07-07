package TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        StringBuilder result=new StringBuilder();
        result.append(input.charAt(0));
        char currentSymbol=input.charAt(0);

        for (int i = 0; i <input.length() ; i++) {


            if(input.charAt(i)!=currentSymbol){
                currentSymbol=input.charAt(i);
                result.append(currentSymbol);
            }


        }
        System.out.println(result);





    }
}
