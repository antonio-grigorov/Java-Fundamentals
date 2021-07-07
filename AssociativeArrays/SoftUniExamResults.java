package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> userAndPoints = new LinkedHashMap<>();  // Kiro | 94
        Map<String, Integer> langAndsubm = new LinkedHashMap<>(); // C# - 3

        while (!"exam finished".equals(input)) {
            String[] tokens = input.split("-");
            String username = tokens[0];
            String lang = tokens[1];



            if (!lang.equals("banned")) {
                int points=Integer.parseInt(tokens[2]);
                userAndPoints.putIfAbsent(username,0);
                if(userAndPoints.get(username)<points){
                    userAndPoints.put(username, points);}

                langAndsubm.putIfAbsent(lang, 0);
                int totalSubmissions = langAndsubm.get(lang) + 1;
                langAndsubm.put(lang, totalSubmissions);
            }
            if(lang.equals("banned")){
                userAndPoints.remove(username);

            }
            input=scanner.nextLine();
        }
        System.out.println("Results:");
        userAndPoints.entrySet().stream()
                .sorted((p1,p2)->{
                    int result=p2.getValue().compareTo(p1.getValue());
                    if(result==0){
                        result=p1.getKey().compareTo(p2.getKey());
                    }
                    return result;
                })
                .forEach(s-> System.out.println(String.format("%s | %d",s.getKey(),s.getValue())));
        System.out.println("Submissions:");
        langAndsubm.entrySet().stream().sorted((s1,s2)->{
            int result=s2.getValue().compareTo(s1.getValue());
            if(result==0){
                result=s1.getKey().compareTo(s2.getKey());
            }
            return result;
        })
                .forEach(s-> System.out.println(String.format("%s - %d",s.getKey(),s.getValue())));


    }
}
