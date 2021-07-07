package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Gold -> 155
//Silver -> 10
//Copper -> 17
        Map<String, Integer> resources = new LinkedHashMap<>();
        String input=scanner.nextLine();
        while(!input.equals("stop")){
            int quantity=Integer.parseInt(scanner.nextLine());
            if(!resources.containsKey(input)){
                resources.put(input,quantity);
            }
            else {
                int newQuantity=resources.get(input)+quantity;
                resources.put(input, newQuantity);
            }


            input=scanner.nextLine();
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : resources.entrySet()) {
            System.out.printf("%s -> %d%n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue());

        }
    }
}
