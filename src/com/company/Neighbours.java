package com.company;
import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Neighbours {
    public static void main(String[] args) throws IOException {
        NeighbourReader nr = new NeighbourReader();
        List<Neighbour> list = nr.getNeighbours("persons.csv");
        Collections.sort(list);
        List<Neighbour> streamOfNeighbours = list.stream()
                .filter(neighbour -> neighbour.getMarried().equals("женат"))
                .filter(neighbour -> neighbour.getAge() > 40)
                .collect(Collectors.toList());
        File file = new File("result.csv");
        PrintWriter pw = new PrintWriter(file);
        for(Neighbour n : streamOfNeighbours) {
            pw.write(n + "\n");
        }
        pw.close();
    }
}