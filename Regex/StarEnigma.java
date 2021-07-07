package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = "";
        int countsSTAR = 0;
        int countAttacked = 0;
        int countDestroyed = 0;
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        String planet = "a";
        String attackType = "b";

        String regex =
                "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attacktype>A|D)![^@\\-!:>]*->(?<soldiercount>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        StringBuilder sb = new StringBuilder();
        boolean isValid=false;
        for (int j = 0; j < n; j++) {
            input = scanner.nextLine();

            for (int i = 0; i < input.length(); i++) {

                if (input.charAt(i) == 's' || input.charAt(i) == 't' || input.charAt(i) == 'a' || input.charAt(i) == 'r'
                        || input.charAt(i) == 'S' || input.charAt(i) == 'T' || input.charAt(i) == 'A' || input.charAt(i) == 'R') {
                    countsSTAR += 1;
                }
            }

            for (int k = 0; k < input.length(); k++) {
                char newChar = (char) (input.charAt(k) - countsSTAR);
                sb.append(newChar);

            }
            Matcher matcher = pattern.matcher(sb);

            while (matcher.find()) {
                planet = matcher.group("planet");
                attackType = matcher.group("attacktype");
                  isValid=true;
            }


            if (attackType.equals("A") && isValid) {
                countAttacked += 1;
                attackedPlanets.add(planet);
            } else if(attackType.equals("D")&& isValid) {
                countDestroyed += 1;
                destroyedPlanets.add(planet);
            }
            sb.setLength(0);
            countsSTAR=0;
            isValid=false;

        }

            System.out.printf("Attacked planets: %d%n", countAttacked);
        if (countAttacked > 0) {
            attackedPlanets.stream()
                    .sorted((e1, e2) -> e1.compareTo(e2))
                    .forEach(e -> System.out.println(String.format("-> %s", e)));

        }

            System.out.printf("Destroyed planets: %d%n", countDestroyed);
        if (countDestroyed > 0) {
            destroyedPlanets.stream()
                    .sorted((e1, e2) -> e1.compareTo(e2))
                    .forEach(e -> System.out.println(String.format("-> %s", e)));

        }


//        for (String token : tokens) {
//            System.out.print(token);
//        }


    }
}
