package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input=scanner.nextLine().split("\\s+");

        Map<Character, Integer> charCount=new LinkedHashMap<>();

        for (String s : input) {
            for (int i = 0; i < s.length(); i++) {

                if (!charCount.containsKey(s.charAt(i))) {
                    charCount.put(s.charAt(i), 1);
                } else {
                    charCount.put(s.charAt(i), charCount.get(s.charAt(i))+1 );
                }
            }


        }
        for (Map.Entry<Character, Integer>  entry : charCount.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(),entry.getValue());

        }
    }
}
