package AssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students=new LinkedHashMap<>();

        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String name=scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name,new ArrayList<>());
            List<Double> grades=students.get(name);
            grades.add(grade);

        }
        students.entrySet().stream()
                .filter(s->s.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0)>=4.50)
                .sorted((s1,s2)->{
                    double first=s1.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                    double second=s2.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                    return Double.compare(second,first);
                })
        .forEach(s-> System.out.printf("%s -> %.2f%n",s.getKey(),
                s.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0)));




    }
    }

