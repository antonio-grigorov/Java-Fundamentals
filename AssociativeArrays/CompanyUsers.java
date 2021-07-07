package AssociativeArrays;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        SoftUni -> AA12345
        Map<String, List<String>> companyUsers = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split(" -> ");
            String company = tokens[0];
            String user = tokens[1];

            companyUsers.putIfAbsent(company, new ArrayList<>());
            List<String> users = companyUsers.get(company);

            if (!users.contains(user)) {
                users.add(user);
            }
            input = scanner.nextLine();
        }
        companyUsers
                .entrySet()
                .stream()
                .sorted((c1,c2)->c1.getKey().compareTo(c2.getKey()))
                .forEach(c-> {
                    System.out.printf("%s%n", c.getKey());
                    c.getValue()
                            .forEach(u-> System.out.printf("-- %s%n",u));

                });
    }
}
