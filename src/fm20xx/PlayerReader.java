/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

/**
 *
 * @author Dell
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayerReader {
    private String filePath;
    private List<Player> players;

    public PlayerReader(String filePath) {
        this.filePath = filePath;
        this.players = new ArrayList<>();
    }

    public void readCSV() {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                // Skip header row
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                // Splitting the line on commas.
                // Assuming CSV columns order: name, nationality, team, age, skill_rating, position, number, goals, yellow_cards, red_cards, value
                String[] tokens = line.split(",");
                String name = tokens[0];
                String nationality = tokens[1];
                String team = tokens[2];
                int age = Integer.parseInt(tokens[3]);
                int skillRating = Integer.parseInt(tokens[4]);
                String position = tokens[5];
                int number = Integer.parseInt(tokens[6]);
                int goals = tokens[7].isEmpty() ? 0 : Integer.parseInt(tokens[7]);
                int yellowCards = tokens[8].isEmpty() ? 0 : Integer.parseInt(tokens[8]);
                int redCards = tokens[9].isEmpty() ? 0 : Integer.parseInt(tokens[9]);
                int value = Integer.parseInt(tokens[10]);

                Player player = new Player(name, nationality, team, age, skillRating,
                                           position, number, goals, yellowCards, redCards, value);
                players.add(player);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Player> getPlayers() {
        return players;
    }
}

