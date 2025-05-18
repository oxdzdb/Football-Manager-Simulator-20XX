/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fm20xx;

import static fm20xx.PlayerReader.readCSV;
import static fm20xx.readPlayersFromTeam.readTeam;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class TransferController implements Initializable {
    @FXML ImageView icon;
    private League chosenLeague;
    private ArrayList<Team> teamList;
    private int teamIndex;
    private Team chosenTeam;
    
    
    @FXML
    public void chosen(League l, ArrayList<Team> tl, int i){
        chosenLeague = l;
        teamList = tl;
        teamIndex = i;
        chosenTeam = chosenLeague.searchTeam(i);
    }
    
    @FXML
    private void home(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    
      // Reference to the League instance (shared from settingsController)
    String teamFile;
    String playerFile;
    public String determineTeamFile(League l){
    switch(l.getName()){
            case "Premier League":
                  teamFile = "src/fm20xx/database/eplTeams.csv";
            break;
            
            case "Bundesliga":
                  teamFile = "src/fm20xx/database/bundTeams.csv";
            break;
            
            case "La Liga":
                  teamFile = "src/fm20xx/database/laLigaTeams.csv";
            break;
            
            case "Ligue 1":
                  teamFile = "src/fm20xx/database/ligue1Teams.csv";
            break;
            
            case "Serie A":
                  teamFile = "src/fm20xx/database/serieATeams.csv";
            break; 
            
            default:
                System.out.println("Help");
            break;
        }
        return teamFile;
                }
        public String determinePlayerFile(League l){
    switch(l.getName()){
            case "Premier League":
                  teamFile = "src/fm20xx/database/eplPlayers.csv";
            break;
            
            case "Bundesliga":
                  teamFile = "src/fm20xx/database/bundPlayers.csv";
            break;
            
            case "La Liga":
                  teamFile = "src/fm20xx/database/laLigaPlayers.csv";
            break;
            
            case "Ligue 1":
                  teamFile = "src/fm20xx/database/ligue1Players.csv";
            break;
            
            case "Serie A":
                  teamFile = "src/fm20xx/database/serieAPlayers.csv";
            break; 
            
            default:
                System.out.println("Help");
            break;
        }
        return teamFile;
                }

    // The user's team (the home team). This might be set from settings/configuration.
    private Team team1;
    private Team team2;
    private Player player1;
    private Player player2;
    private int amount1;
    private int amount2;
    
    @FXML
    private TextField amount1IN;

    @FXML
    private TextField amount2IN;

    @FXML
    private TextField player1IN;

    @FXML
    private TextField player2IN;

    @FXML
    private TextField teamIN;
    
    @FXML
    void confirm(ActionEvent event) throws IOException {      
    //Confirms the transfer
    //>Check if other team has accepted terms done
    //>Check team1 money amount and validity done
    //>Check team2 money amount and validity done
    
    //>Subtract money1 amount from team1
    //>Add money1 amount to team2 from team1
    //>Subtract money2 amount from team2
    //>Add money2 amount to team1 from team2
    //>Check player and validity of team1
    
    //> Remove player1 from team1 player list and add player1 to team2 player list
    //> Remove player2 from team2 player list and add player2 to team1 player list


        // 1. Ensure all five boxes have input.
        if (amount1IN.getText().trim().isEmpty() ||
            amount2IN.getText().trim().isEmpty() ||
            player1IN.getText().trim().isEmpty() ||
            player2IN.getText().trim().isEmpty() ||
           teamIN.getText().trim().isEmpty()) {
                
            System.out.println("Error: All trade fields must be filled.");
            return;
        }
         System.out.println(amount1IN.getText());
        
        System.out.println(amount2IN.getText());
        
        System.out.println(player2IN.getText());
        
        String player21 =player2IN.getText();
         String player31 = player1IN.getText();
        Player playerAdj = null;
         List<Player> players = readCSV(determinePlayerFile(chosenLeague));
         Player playerOpp = null;
        for(Player player: players){
        if(player21.equals(player.getName())){
            System.out.println(player);
            playerOpp = player;   
        }
        
        if(player31.equals(player.getName())){
            System.out.println(player);
            playerAdj = player;
        }
}
            if(containsTeam(teamIN.getText()) && containsPlayer(teamIN.getText()) && containsPlayer(chosenTeam.getName()) && validateBalance(getsTeam(teamIN.getText()),playerOpp) && validateBalance(chosenTeam,playerOpp)){
                //transfer
                subtractMoneyFromTeam1(Integer.parseInt(amount1IN.getText()));
                
                addMoneyToTeam2FromTeam1(Integer.parseInt(amount1IN.getText()));
                
                subtractMoneyFromTeam2(Integer.parseInt(amount2IN.getText()));
                
                addMoneyToTeam1FromTeam2(Integer.parseInt(amount2IN.getText()));
                
                swapPlayerData(playerOpp, playerAdj);
                
                
        }
                
        System.out.println(player1IN.getText());
        
                
        
        
        System.out.println(teamIN.getText());   
         

    
    }
        public static void swapPlayerData(Player p1, Player p2) {
        // Swap names
        
        // Swap teams
        String tempTeam = p1.getTeam();
        p1.setTeam(p2.getTeam());
        p2.setTeam(tempTeam);
    }
    
        public boolean containsTeam(String teamName) {
        // Ensure that the team name is not null.
        boolean data = false;
        if (teamName == null || teamName.trim().isEmpty()) {
            data = false;
        }
        List<Team> teams = readTeam(determineTeamFile(chosenLeague));
        for (Team team : teams) {
            data = team.getName().equals(teamName);
        }
        return data;
        }
       
        public Team getsTeam(String teamName) {
        // Ensure that the team name is not null.
        boolean data = false;
        Team sTeam = null;
        if (teamName == null || teamName.trim().isEmpty()) {
            data = false;
        }

        List<Team> teams = readTeam(determineTeamFile(chosenLeague));
        for (Team team : teams) {
            data = team.getName().equals(teamName);
            sTeam = team;
        }
        return sTeam;
        }
        List<Player> players = readCSV(determinePlayerFile(chosenLeague));
         public boolean containsPlayer(String teamName) {
        // Ensure that the team name is not null.
        boolean data = false;
        if (teamName == null || teamName.trim().isEmpty()) {
            data = false;
        }

       
        for (Player player: players) {
            data = player.getName().equals(teamName);
        }
        return data;
        }
         
        
        // Iterate over each team group and display the players
        
         public boolean validateBalance(Team t, Player p){
             boolean data = false;
             double playerValue = 0;
             if(p.getSkillRating()>85){
                 playerValue=playerValue+100000;
                 playerValue=playerValue+(p.getSkillRating()-85)*1000000;
             }
             if(t.getFunds()>playerValue){
                 data = true;
             }
             return data;
         }
    public void subtractMoneyFromTeam1(int amount) {
        team1Money -= amount;
    }
double team1Money = chosenTeam.getFunds();
double team2Money = getsTeam(teamIN.getText()).getFunds();
    // Transfer an amount from team1 to team2
    public void addMoneyToTeam2FromTeam1(int amount) {
        team2Money += amount;
    }

    // Subtract an amount from team2's money
    public void subtractMoneyFromTeam2(int amount) {
        team2Money -= amount;
    }

    // Transfer an amount from team2 to team1
    public void addMoneyToTeam1FromTeam2(int amount) {
        team1Money += amount;
    }
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
/*
String line;
            // Optionally skip a header line if your CSV contains one.
            // Uncomment the next line if there is a header:
            br.readLine();

            while ((line = br.readLine()) != null) {
                // Assuming that team names are in the first column of the CSV.
                // Adjust the split index or add a CSV parser if your CSV structure is more complex.
                String[] tokens = line.split(",");
                
                if (tokens.length > 0) {
                    // Normalize the team name from the CSV file.
                    String nameInFile = tokens[0].trim().toLowerCase();
                    if (nameInFile.equals(teamNameToFind)) {
                        return true;
                    }
                }
            }
*/