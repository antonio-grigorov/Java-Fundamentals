package Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());



        List<Exer> authors=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String title = tokens[0];
            String content = tokens[1];
            String author = tokens[2];
            Exer ex = new Exer(title, content, author);
            authors.add(ex);
        }
            String sortBy=scanner.nextLine();
            if(sortBy.equals("title")){
            authors.stream().sorted(Comparator.comparing(Exer::getTitle)).
                    forEach(p-> System.out.println(p.getTitle()+" - "+ p.getContent()+": "+ p.getAuthor()));

        }
        if(sortBy.equals("content")){
            authors.stream().sorted((p1,p2)->p1.getContent().compareTo(p2.getContent())).
                    forEach(p-> System.out.println(p.getTitle()+" - "+ p.getContent()+": "+ p.getAuthor()));
        }
        if(sortBy.equals("author")){
            authors.stream().sorted((p1,p2)->p1.getAuthor().compareTo(p2.getAuthor())).
                    forEach(p-> System.out.println(p.getTitle()+" - "+ p.getContent()+": "+ p.getAuthor()));
        }


    }
    }

