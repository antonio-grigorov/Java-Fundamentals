package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<Songs> songs= new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String[] tokens=scanner.nextLine().split("_");
            String type=tokens[0];
            String name=tokens[1];
            String time=tokens[2];
            Songs song=new Songs(type, name, time);

            songs.add(song);
        }

        String type=scanner.nextLine();

        for(Songs song:songs){
            if(type.equals(song.getType())){
                System.out.printf("%s%n",song.getName());
            }
            if(type.equals("all")) { System.out.printf("%s%n",song.getName());}
        }



    }
}
