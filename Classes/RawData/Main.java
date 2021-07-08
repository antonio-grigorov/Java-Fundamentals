package RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        List<Model> fragile = new ArrayList<>();
        List<Model> flamable = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = input.split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Double tire1Pressure = Double.parseDouble(tokens[5]);
            int tire1Age = Integer.parseInt(tokens[6]);
            Double tire2Pressure = Double.parseDouble(tokens[7]);
            int tire2Age = Integer.parseInt(tokens[8]);
            Double tire3Pressure = Double.parseDouble(tokens[9]);
            int tire3Age = Integer.parseInt(tokens[10]);
            Double tire4Pressure = Double.parseDouble(tokens[11]);
            int tire4Age = Integer.parseInt(tokens[12]);

//            Model data=new Model(model,engineSpeed,enginePower,cargoWeight,
//                    cargoType,tire1Pressure,tire1Age,tire2Pressure,tire2Age,
//                    tire3Pressure,tire3Age,tire4Pressure,tire4Age);
            Model models = new Model(model);
            if ("fragile".equals(cargoType) && (tire1Pressure < 1 || tire2Pressure <= 1 || tire3Pressure <=1 || tire4Pressure <=1)) {
                fragile.add(models);

            } else if ("flamable".equals(cargoType) && enginePower > 250) {
                flamable.add(models);
            }
            input = scanner.nextLine();
        }

        if("fragile".equals(input)){
            for(Model models:fragile)
                System.out.println(models);
        }
        if("flamable".equals(input)){
            for(Model models:flamable)
                System.out.println(models);
        }

    }
}
