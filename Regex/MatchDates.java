package Regex;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(?<day>\\d{2})([-./])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
//Day: 13, Month: Jul, Year: 1928
//Day: 10, Month: Nov, Year: 1934
//Day: 25, Month: Dec, Year: 1937

        while (matcher.find()) {
            System.out.printf("Day: %s, ",matcher.group("day"));
            System.out.printf("Month: %s, ",matcher.group("month"));
            System.out.printf("Year: %s%n",matcher.group("year"));
        }

    }
}
