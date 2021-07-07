package AssociativeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


         Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(n-> Integer.parseInt(n))
                .sorted((l,r)->r.compareTo(l))
                        .limit(3)
                .forEach(n-> System.out.print(n+" "));



    }}
