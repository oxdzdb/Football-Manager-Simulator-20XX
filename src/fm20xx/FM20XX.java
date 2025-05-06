/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package fm20xx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class FM20XX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Title.fxml"));
        Parent root = loader.load();
    
        League prem = new League("Premier League", "England", "leagueImgs/premierLeague.png");
        League bundesliga = new League("Bundesliga", "Germany", "leagueImgs/bundesliga.png");
        League laLiga = new League("La Liga", "Spain", "leagueImgs/laLiga.png");
        League serieA = new League("Serie A", "Italy", "leagueImgs/serieA.png");
        League ligue1 = new League("Ligue 1", "France", "leagueImgs/ligue1.png");
        
        
        League.getLeagueList().add(prem);
        League.getLeagueList().add(bundesliga);
        League.getLeagueList().add(laLiga);
        League.getLeagueList().add(serieA);
        League.getLeagueList().add(ligue1);
        
        TitleController controller = loader.getController();
        controller.chosen(prem, prem.getTeamList(), 0);
        
  
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
}
    public static void main(String[] args) {
        League prem = new League("Premier League", "England", "leagueImgs/premierLeague.png");
        League bundesliga = new League("Bundesliga", "Germany", "leagueImgs/bundesliga.png");
        League laLiga = new League("La Liga", "Spain", "leagueImgs/laLiga.png");
        League serieA = new League("Serie A", "Italy", "leagueImgs/serieA.png");
        League ligue1 = new League("Ligue 1", "France", "leagueImgs/ligue1.png");
        
        
        League.getLeagueList().add(prem);
        League.getLeagueList().add(bundesliga);
        League.getLeagueList().add(laLiga);
        League.getLeagueList().add(serieA);
        League.getLeagueList().add(ligue1);
        // Adjust the file path based on your project structure.
        String filePath = "src/fm20xx/database/bundTeams.csv";
        List<Team> teams = readPlayersFromTeam.readTeam((filePath));
        // Print each player to verify the output.
        for (Team t : teams) {
            //System.out.println(p);
            System.out.println(t.getName());
        }
        bundesliga.setTeamList((ArrayList<Team>) teams);
        System.out.println("==================================================================================");
         // Adjust the file path based on your project structure.
        String filePath1 = "src/fm20xx/database/eplTeams.csv";
        List<Team> teams1 = readPlayersFromTeam.readTeam((filePath1));
        // Print each player to verify the output.
        for (Team t : teams1) {
            //System.out.println(p);
            System.out.println(t.getName());
        }
        prem.setTeamList((ArrayList<Team>) teams1);
        System.out.println("==================================================================================");
         // Adjust the file path based on your project structure.
        String filePath2 = "src/fm20xx/database/laLigaTeams.csv";
        List<Team> teams2 = readPlayersFromTeam.readTeam((filePath2));
        // Print each player to verify the output.
        for (Team t : teams2) {
            //System.out.println(p);
            System.out.println(t.getName());
        }
        laLiga.setTeamList((ArrayList<Team>) teams2);
        System.out.println("==================================================================================");
         // Adjust the file path based on your project structure.
        String filePath3 = "src/fm20xx/database/ligue1Teams.csv";
        List<Team> teams3 = readPlayersFromTeam.readTeam((filePath3));
        // Print each player to verify the output.
        for (Team t : teams3) {
            //System.out.println(p);
            System.out.println(t.getName());
        }
        ligue1.setTeamList((ArrayList<Team>) teams3);
        System.out.println("==================================================================================");
         // Adjust the file path based on your project structure.
        String filePath4 = "src/fm20xx/database/serieATeams.csv";
        List<Team> teams4 = readPlayersFromTeam.readTeam((filePath4));
        // Print each player to verify the output.
        for (Team t : teams4) {
            //System.out.println(p);
            System.out.println(t.getName());
        }
        serieA.setTeamList((ArrayList<Team>) teams4);
        /*
        System.out.println("==================================================================================");
         // Adjust the file path based on your project structure.
        String filePath5 = "src/fm20xx/database/eplPlayers.csv";
        List<Player> players = PlayerReader.readPlayers((filePath5));
        // Print each player to verify the output
        for (Player player : players) {
            System.out.println(player.getName());
        }
        */
         launch(args);
    }    
}
   /*
    public static void main(String[] args) {
        String csvFile = "src/fm20xx/database/bundTeams.csv";
        String line;
        String csvDelimiter = ",";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // This splits the line by the delimiter
                String[] values = line.split(csvDelimiter);
                // Process each value in the array
                        for (String value : values) {
                        System.out.print(value + " ");
                        }
                    
                        System.out.print("\n");
                
            }
        } catch (IOException e) {
        }
    
        launch(args);
    }
    */