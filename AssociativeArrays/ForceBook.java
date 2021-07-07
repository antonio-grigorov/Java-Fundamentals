package AssociativeArrays;
import java.util.*;
public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> sides = new LinkedHashMap<>();
        boolean splitbyPipe = false;
        boolean splitByArrow = false;
        boolean changedSide=false;
        String[] tokensByPipe = null;
        String[] tokensByArrow = null;
        List<String> members = new ArrayList<>();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                tokensByPipe = input.split("\\s+\\|\\s+");
                splitbyPipe = true;
            }
            if (input.contains("->")) {
                tokensByArrow = input.split("\\s+->\\s+");
                splitByArrow = true;
            }

            if (splitbyPipe) {
                sides.putIfAbsent(tokensByPipe[0], new ArrayList<>());
                members = sides.get(tokensByPipe[0]);
                if (!members.contains(tokensByPipe[1])) {
                    members.add(tokensByPipe[1]);
                }
            }
            if (splitByArrow) {
                for (List<String> string : sides.values()) {

                    if (string.contains(tokensByArrow[0])) {
                        string.remove(tokensByArrow[0]);
                        members = sides.get(tokensByArrow[1]);
                        members.add(tokensByArrow[0]);
                        System.out.printf("%s joins the %s side!%n", tokensByArrow[0], tokensByArrow[1]);
                        changedSide=true;
                        break;
                    }}
                    if(changedSide==false){
                        members = sides.get(tokensByArrow[1]);
                        members.add(tokensByArrow[0]);
                        System.out.printf("%s joins the %s side!%n", tokensByArrow[0], tokensByArrow[1]);
                    }

                }

            splitbyPipe = false;
            splitByArrow = false;
            tokensByPipe = null;
            tokensByArrow = null;
            changedSide=false;
            input = scanner.nextLine();
        }

        sides.entrySet().stream()
                .sorted((s1,s2)->{
                    int result=s2.getValue().size()-s1.getValue().size();
                    if(result==0){
                        result=s1.getKey().compareTo(s2.getKey());
                    }
                    return result;
                }
                ).
                filter(c -> c.getValue().size()>0)
                .forEach(c-> {
                    System.out.printf("Side: %s, Members: %d%n",c.getKey(),c.getValue().size());
                    c.getValue().stream().sorted((s1,s2)->s1.compareTo(s2))
                            .forEach(s-> System.out.println(String.format("! %s",s)));
                });

    }

}
