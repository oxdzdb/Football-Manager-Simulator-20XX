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
    public static List<Player> readPlayers(String filePath) {
        List<Player> players = new ArrayList<>();
        String delimiter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Read and discard the header row (if present).
            if ((line = br.readLine()) != null) {
                // Optionally process or verify header here.
            }
            
            // Process each line of the CSV file.
            while ((line = br.readLine()) != null) {
                // Split the line into tokens by the delimiter.
                String[] tokens = line.split(delimiter);

                // Map tokens to the appropriate fields.
                // It's a good idea to trim() each token in case there are extra spaces.
                String name = tokens[0].trim();
                String nationality = tokens[1].trim();
                String team = tokens[2].trim();
                int age = Integer.parseInt(tokens[3].trim());
                int skillRating = Integer.parseInt(tokens[4].trim());
                String position = tokens[5].trim();
                int number = Integer.parseInt(tokens[6].trim());
                int goals = Integer.parseInt(tokens[7].trim());
                int yellowCards = Integer.parseInt(tokens[8].trim());
                int redCards = Integer.parseInt(tokens[9].trim());
                double value = Double.parseDouble(tokens[10].trim());

                // Create a new Player instance with the extracted data.
                Player player = new Player(name, nationality, team, age, skillRating, position,
                                           number, goals, yellowCards, redCards, value);
                players.add(player);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return players;
    }
}
