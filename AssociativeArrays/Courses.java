package AssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses=new LinkedHashMap<>();

        String input=scanner.nextLine();

        while(!"end".equals(input)){
            String[] tokens=input.split(" : ");
            String course=tokens[0];
            String student=tokens[1];
            courses.putIfAbsent(course,new ArrayList<>());


            List<String> students=courses.get(course);
            students.add(student);
//            courses.get(course).add(student);

            input=scanner.nextLine();
        }






        courses.entrySet().stream()
                .sorted((l,r)->Integer.compare(r.getValue().size(),l.getValue().size()))
                .forEach(i-> {
                    System.out.printf(String.format("%s: %d%n",i.getKey(),i.getValue().size()));
                    i.getValue().stream().sorted((s1,s2)-> s1.compareTo(s2))
                    .forEach(s-> System.out.println(String.format("-- %s",s)));
                });


    }
}




















