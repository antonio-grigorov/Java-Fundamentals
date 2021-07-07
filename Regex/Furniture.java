package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String regex=">>(?<item>\\w+)<<(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)";




        String input=scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);

        double sum=0;
        System.out.println("Bought furniture:");
        while(!"Purchase".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()) {
                System.out.println(matcher.group("item"));
                double price = Double.parseDouble(matcher.group("price"));
                double quantity = Double.parseDouble(matcher.group("quantity"));
                sum += price * quantity;
            }
            input=scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f",sum);

    }
}
