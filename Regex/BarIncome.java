package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex="%(?<customer>[A-Z][a-z]+)%[^\\|$%.]*<(?<product>\\w+)>[^\\|$%.]*\\|(?<count>\\d+)\\|[^\\|$%.]*?(?<price>\\d+\\.?\\d+)\\$";
        Pattern pattern=Pattern.compile(regex);

        String input=scanner.nextLine();
        double sum=0.0;
        double finalSum=0.0;
        while(!"end of shift".equals(input)){
            Matcher matcher=pattern.matcher(input);
            while(matcher.find()){
                String customer=matcher.group("customer");
                String product=matcher.group("product");
                double count=Double.parseDouble(matcher.group("count"));
                double price=Double.parseDouble(matcher.group("price"));
                double priceForCustomer=count*price;
                System.out.println(String.format("%s: %s - %.2f",customer,product,priceForCustomer));
            sum+=priceForCustomer;
            finalSum+=sum;


            }
            sum=0;
            input=scanner.nextLine();
        }
        System.out.println(String.format("Total income: %.2f",finalSum));



    }
}
