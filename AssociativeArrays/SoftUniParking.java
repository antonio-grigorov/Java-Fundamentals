package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingValidation = new LinkedHashMap<>();

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String name = tokens[1];


            if (command.equals("register")) {
                if (parkingValidation.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s%n",
                            parkingValidation.get(name));
                } else {
                    String licensePlate = tokens[2];
                    parkingValidation.put(name, licensePlate);
                    System.out.printf("%s registered %s successfully%n", name, licensePlate);
                }

            }
            if (command.equals("unregister")) {
                if (!parkingValidation.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    System.out.printf("%s unregistered successfully%n", name);
                    parkingValidation.remove(name);

                }


            }


        }
        parkingValidation.entrySet().stream()
                .forEach(e-> System.out.printf(String.format("%s => %s%n",e.getKey(),e.getValue())));
    }
}
