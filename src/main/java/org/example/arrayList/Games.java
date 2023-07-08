package org.example.arrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Games {
    private String name;
    private int year;
    private String[] platforms;

    @Override
    public String toString() {
        return "Games{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", platforms=" + Arrays.toString(platforms) +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Games> games = new ArrayList<>();
        games.add(new Games("Harry Potter Legacy",
                2022,
                new String[]{"PC", "PS4", "PS5", "Xbox One", "Xbox Series X"}));

        games.add(new Games("Forza Horizon 5",
                2022,
                new String[]{"PC", "Xbox One", "Xbox Series X"}));

        for(Games game : games) {
            System.out.println(game.toString());
        }
    }
}
