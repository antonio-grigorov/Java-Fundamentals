package TextProcessing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        String[] tokens=input.split("\\s+");
        String finalOutput="";
        String result2= Arrays.stream(tokens)
                .map(w->repeatString(w,w.length())).collect(Collectors.joining());
        System.out.println(result2);

        for (int i = 0; i <tokens.length; i++) {
            finalOutput+=repeatString(tokens[i],tokens[i].length());


        }
        System.out.println(finalOutput);

    }

    private static String repeatString(String word, int length) {
        String result="";
        for (int i = 0; i <length ; i++) {
            result+=word;


        }
        return result;
    }
}
