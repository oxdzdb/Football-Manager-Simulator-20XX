/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fm20xx;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * TeamSelect.fxml Controller class
 *
 * @author Dell
 */

public class TeamSelectController implements Initializable {
    @FXML private ImageView icon;
    @FXML private Button back;
    @FXML private Button home;
    @FXML private Button next;
    @FXML private Button previous;
    @FXML private Button search;
    @FXML private TextField searchBox;
    @FXML private Label teamName;
    @FXML private Label location;
    @FXML private Label leagueName;
    @FXML private Label budget;
    @FXML private Label aveRating;
    @FXML private Label facRating;
    @FXML private Label playerCount;
    
    int teamIndex;
    League chosenLeague;
    static Team chosenTeam;
    ArrayList<Team> teamList;
    
    
    @FXML
    private void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Settings.fxml"));
        Parent root = loader.load();
        SettingsController controller = loader.getController();
        controller.chosen(chosenLeague, chosenLeague.getTeamList(), teamIndex);
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    @FXML
    public void chosen(League l, ArrayList<Team> tl, int i){
        chosenLeague = l;
        teamList = tl;
        teamIndex = i;
    }
    
    @FXML
    private void home(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    @FXML
    public void previous(){
        if(teamIndex > 0){
            teamIndex--;
            updateTeam();    
        }
    }
    
    @FXML
    public void next(){
        if(teamIndex < chosenLeague.getTeamListSize()){
            teamIndex++;
            updateTeam();
        }
    }
    
    @FXML
    public void updateTeam(){
        Team team = chosenLeague.searchTeam(teamIndex);
        leagueName.setText(chosenLeague.getName());
        
        if (team != null){
            icon.setImage(new Image(getClass().getResourceAsStream(team.getImageFileName())));
            teamName.setText(team.getName());
            location.setText(team.getStadiumName() + ", " + team.getLocation());
            budget.setText("Budget: " + team.getFunds());
            aveRating.setText("Average Rating: ");
            facRating.setText("Facility Rating: " + team.getFacilityRating());
            playerCount.setText("Players: " + team.getPlayerListSize());
            
            previous.setDisable(teamIndex == 0);
            next.setDisable(teamIndex == (chosenLeague.getTeamListSize() - 1));
        }
    }
    
    @FXML
    public void search(){
        String searching = searchBox.getText();
        teamIndex = chosenLeague.indexGrabber(searching);
        Team team = chosenLeague.searchTeam(teamIndex);
        if (team != null){
            icon.setImage(new Image(getClass().getResourceAsStream(team.getImageFileName())));
            teamName.setText(team.getName());
            location.setText(team.getStadiumName() + ", " + team.getLocation());
            budget.setText("Budget: " + team.getFunds());
            aveRating.setText("Average Rating: ");
            facRating.setText("Facility Rating: " + team.getFacilityRating());
            playerCount.setText("Players: " + team.getPlayerListSize());
            
            previous.setDisable(teamIndex == 0);
            next.setDisable(teamIndex == (chosenLeague.getTeamListSize() - 1));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
} 