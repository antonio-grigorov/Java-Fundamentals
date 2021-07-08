package CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> enginesList = new ArrayList<>();
        List<Car> carsList = new ArrayList<>();
        String displacement = "";
        String efficiency = "";
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String model = tokens[0];
            String power = tokens[1];
            displacement = "n/a";
            efficiency = "n/a";

            if (tokens.length >= 3) {
                displacement = tokens[2];
            }
            if (tokens.length == 4) {
                efficiency = tokens[3];
            }
            Engine engine = new Engine(model, power, displacement, efficiency);
            enginesList.add(engine);


        }

        int m = Integer.parseInt(scanner.nextLine());
        String weight = "";
        String color = "";
        for (int i = 0; i < m; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String model = tokens[0];
            String engineName = tokens[1];
            weight = "n/a";
            color = "n/a";

            if (tokens.length == 4) {
                weight = tokens[2];
                color = tokens[3];
            } else if (tokens.length == 3) {
                try {
                    int test = Integer.parseInt(tokens[2]);
                    weight = tokens[2];
                } catch (Exception e) {
                    color = tokens[2];
                }}
                Engine a = enginesList.stream().filter(p -> p.getModel().equals(engineName))
                        .findFirst().get();
                Car car = new Car(model, a, weight, color);
                carsList.add(car);

            }
            for (Car car : carsList) {
                System.out.println(car);

            }


        }

    }
