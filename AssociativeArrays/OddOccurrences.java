package AssociativeArrays;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words=scanner.nextLine().split("\\s+");
        Map<String, Integer> elements=new LinkedHashMap<>();

        for(String word:words){
            String wordInLowerCase=word.toLowerCase();
        elements.putIfAbsent(wordInLowerCase,1);
        elements.put(wordInLowerCase, elements.get(wordInLowerCase)+1);

    }
        List<String> odd=new ArrayList<>();

        for(var entry:elements.entrySet()){
            if(entry.getValue()%2==0){
                odd.add(entry.getKey());
            }

        }
        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i));
            if(i!=odd.size()-1){
                System.out.print(", ");
            }

        }

}}
