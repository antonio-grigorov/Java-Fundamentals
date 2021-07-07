package AssociativeArrays;

import javax.net.ssl.SSLEngineResult;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> counts = new TreeMap<>();


        for (double num : nums) {
            if (!counts.containsKey(num)){
                counts.put(num, 0);}
            counts.put(num, counts.get(num) + 1);
        }
        DecimalFormat df = new DecimalFormat("#.#######");

        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {

            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }



    }


}

