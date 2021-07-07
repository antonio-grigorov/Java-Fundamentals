package AssociativeArrays;

import java.sql.Array;
import java.util.*;

public class WordsSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> synonyms=new LinkedHashMap<>();


        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String key=scanner.nextLine();
            String synonym=scanner.nextLine();
            if(synonyms.containsKey(key)){
                List<String> stringList=synonyms.get(key);
                stringList.add(synonym);
                synonyms.put(key,stringList);
            }
            else {
                List<String> synonymsList=new ArrayList<>();
                synonymsList.add(synonym);
                synonyms.put(key,synonymsList);

            }
        }
        for (Map.Entry<String,  List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),
                    entry.getValue().toString().replaceAll("[\\]\\[]",""));

        }

    }
}
