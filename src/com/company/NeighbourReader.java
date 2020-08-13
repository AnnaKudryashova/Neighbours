package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class NeighbourReader {
    public List<Neighbour> getNeighbours(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner sc = new Scanner(file);
    List<String> list = new ArrayList<>();
        while(sc.hasNextLine()) {
        sc.nextLine();
        list.add(sc.nextLine());
    }
    List<Neighbour> neighbours = new ArrayList<>();
        for(String str : list) {
        String[] person = str.split(";");
        neighbours.add(new Neighbour(person[0], person[1], person[2], Integer.parseInt(person[3]), person[4], person[5]));
    }
       for(Neighbour n : neighbours) {
        System.out.println(n);
    }
       return neighbours;
    }
}