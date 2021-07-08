package CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        List<Department> persons=new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String [] tokens=input.split("\\s+");
            String name=tokens[0];
            Double salary=Double.parseDouble(tokens[1]);
            String position=tokens[2];
            String department=tokens[3];
            String email="n/a";
            int age=-1;
            boolean ageTaken=false;
            if(tokens.length>=5){

                if(tokens[4].contains("@")){
                    email=tokens[4];
                }
                else { age=Integer.parseInt(tokens[4]);
                ageTaken=true;}
            }
            if(tokens.length>=6 && ageTaken==false){
                 age=Integer.parseInt(tokens[5]);
            }
            Department dep=new Department(name,salary,position,department,email,age);
            persons.add(dep);

            input=scanner.nextLine();

        }



    }
}
