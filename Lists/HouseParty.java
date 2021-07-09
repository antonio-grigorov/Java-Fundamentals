package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCommands = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i <= numberCommands-1; i++) {
           String[] inputInArray = scanner.nextLine().split("\\s+");
            if (inputInArray[2].equals("going!")) {

                if (guests.contains(inputInArray[0])) {
                    System.out.printf("%s is already in the list!%n", inputInArray[0]);
                } else {
                    guests.add(inputInArray[0]);
                }
            }

            if (inputInArray[2].equals("not")) {
                if (guests.contains(inputInArray[0])) {
                    guests.remove(String.valueOf(inputInArray[0]));
                } else {
                    System.out.printf("%s is not in the list!%n", inputInArray[0]);
                }

            }

            if(i==numberCommands-1){break;}


        }
        for(String guest:guests){
            System.out.println(guest);
        }

    }
}
