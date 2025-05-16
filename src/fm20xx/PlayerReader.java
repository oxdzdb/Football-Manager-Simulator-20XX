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

public class PlayerReader {

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }
    private String filePath;
    private List<Player> players;

    public PlayerReader(String filePath) {
        this.filePath = filePath;
        this.players = new ArrayList<>();
    }
    private String name;
    private String nationality;
    private String team;
    private int age;
    private int skillRating;
    private String position;
    private int number;
    private int goals;
    private int yellowCards;
    private int redCards;
    private int value;
    private double energy;

    public static List<Player> readCSV(String filePath) {
         List<Player> players = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Read and discard the header row if your CSV has one.
            if ((line = br.readLine()) != null) {
                // Optionally, you can process or verify the header here.
            }
                // Splitting the line on commas.
                // Assuming CSV columns order: name, nationality, team, age, skill_rating, position, number, goals, yellow_cards, red_cards, value, energy
                while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                
                Player player = new Player(
                tokens[0],
                tokens[1],
                tokens[2],
                Integer.parseInt(tokens[3]),
                Integer.parseInt(tokens[4]),
                tokens[5],
                Integer.parseInt(tokens[6]),
                tokens[7].isEmpty() ? 0 : Integer.parseInt(tokens[7]),
                tokens[8].isEmpty() ? 0 : Integer.parseInt(tokens[8]),
                tokens[9].isEmpty() ? 0 : Integer.parseInt(tokens[9]),
                Integer.parseInt(tokens[10]),
                Double.parseDouble(tokens[11])
                );
                players.add(player);
                }
                
        } catch (IOException e) {
            e.printStackTrace();
        }
        return players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @return the team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the skillRating
     */
    public int getSkillRating() {
        return skillRating;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return the goals
     */
    public int getGoals() {
        return goals;
    }

    /**
     * @return the yellowCards
     */
    public int getYellowCards() {
        return yellowCards;
    }

    /**
     * @return the redCards
     */
    public int getRedCards() {
        return redCards;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @return the energy
     */
    public double getEnergy() {
        return energy;
    }
}

