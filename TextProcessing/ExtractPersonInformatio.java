package TextProcessing;

import java.util.Scanner;

public class ExtractPersonInformatio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String input=scanner.nextLine();

            int symbolBeforeName=input.indexOf('@');
            int symbolAfterName=input.indexOf('|');
            int symbolBeforeAge=input.indexOf('#');
            int symbolAfterAge=input.indexOf('*');

            String name=input.substring(symbolBeforeName+1,symbolAfterName);
            String age=input.substring(symbolBeforeAge+1,symbolAfterAge);

            System.out.println(String.format("%s is %s years old.",name,age));

        }



    }
}
