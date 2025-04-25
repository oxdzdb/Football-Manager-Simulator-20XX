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

public class readPlayersFromTeam {
    
    public static List<Team> readTeam(String filePath) {
        List<Team> teams = new ArrayList<>();
        String delimiter = ",";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Read and discard the header row if your CSV has one.
            if ((line = br.readLine()) != null) {
                // Optionally, you can process or verify the header here.
            }
            
            // Process each line of the CSV file.
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(delimiter);
                // Create a new Player instance using parsed values.
                // Make sure the CSV columns are in the same order as the parameters.
                Team team = new Team(
                    tokens[0],                          // Name
                    tokens[1],                          // Short Name
                    tokens[2],                          // Location
                    tokens[3],                          // Stadium Name
                    Integer.parseInt(tokens[4]),        // Wins
                    Integer.parseInt(tokens[5]),        // Draws
                    Integer.parseInt(tokens[6]),        // Losses
                    Integer.parseInt(tokens[7]),        // Goals
                    Integer.parseInt(tokens[8]),        // Conceded Goals
                    Double.parseDouble(tokens[9]),      // Funds
                    Integer.parseInt(tokens[10]),       // Facility Rating
                    Integer.parseInt(tokens[11]),       // Points
                    Integer.parseInt(tokens[12]),       // Stadium Capacity
                    tokens[13]                          // Image File Name
                );
                teams.add(team);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teams;
    }
}
