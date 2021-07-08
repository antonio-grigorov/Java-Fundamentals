package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<OpinionPoll> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            OpinionPoll person = new OpinionPoll(name, age);
            if (person.getAge() > 30) {
                people.add(person);
            }


        }

         people.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).
                 forEach(p-> System.out.println(p.getName()+" - "+ p.getAge()));


    }

}
