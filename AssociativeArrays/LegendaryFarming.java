package AssociativeArrays;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> legendaryItems = new LinkedHashMap<>();
        legendaryItems.put("shards", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();

        boolean isObtained = false;
        while (!isObtained) {
            String[] input = scanner.nextLine().split("\\s");
            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String item = input[i + 1].toLowerCase();

                if (legendaryItems.containsKey(item)) {
                    addToMap(legendaryItems, item, quantity);
                    isObtained=isObtained(legendaryItems,item);
                    if(isObtained){
                        break;
                    }
                } else {
                    addToMap(junkItems, item, quantity);
                }

            }


        }


        legendaryItems.entrySet().stream().sorted((l, r) -> {
            int result = r.getValue() - l.getValue();
            if (result == 0) {
                result = l.getKey().compareTo(r.getKey());
            }
            return result;
        })
                .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));

        junkItems.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));
    }

    private static boolean isObtained(Map<String, Integer> map, String item) {
        if(map.get(item)>=250) {
            int newQuantity = map.get(item) - 250;
            map.put(item, newQuantity);

            switch (item) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    break;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    break;

                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    break;

            }
            return true;
        }
        return false;
    }

    private static void addToMap(Map<String, Integer> map, String item, int quantity) {
        map.putIfAbsent(item, 0);
        int newQuantity = map.get(item) + quantity;
        map.put(item, newQuantity);


    }
}
