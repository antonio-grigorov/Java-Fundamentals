package TextProcessing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word=scanner.nextLine();
        while(!("end").equals(word)){
            String reverse=reverse(word);

            System.out.printf("%s = %s%n",word, reverse);
            word=scanner.nextLine();
        }
    }

    private static String reverse(String word) {
        List<String> result=new ArrayList<>();

        for (int i = 0; i <word.length() ; i++) {
            result.add(""+ word.charAt(i));
            
        }
        Collections.reverse(result);

        return String.join("",result);



    }
}
