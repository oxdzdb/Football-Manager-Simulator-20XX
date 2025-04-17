/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fm20xx;

import java.io.IOException;
import java.net.URL;
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
    @FXML private Label teamName;
    @FXML private Label location;
    @FXML private Label leagueName;
    @FXML private Label budget;
    @FXML private Label aveRating;
    @FXML private Label facRating;
    @FXML private Label playerCount;
    
    int index = 0;
    League chosenLeague;
    
    
    @FXML
    private void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Title.fxml"));
        Parent root = loader.load();
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    @FXML
    public void chosen(League l){
        chosenLeague = l;
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
        if(index > 0){
            index--;
            updateTeam();    
        }
    }
    
    @FXML
    public void next(){
        if(index < League.getLeagueListLen()){
            index++;
            updateTeam();
        }
    }
    
    @FXML
    public void updateTeam(){
        Team team = chosenLeague.searchTeam(index);
        if (team != null){
            icon.setImage(new Image(getClass().getResourceAsStream(team.getImageFileName())));
            teamName.setText(team.getName());
            location.setText(team.getStadiumName() + ", " + team.getLocation());
            budget.setText("Budget: " + team.getFunds());
            aveRating.setText("Average Rating: ");
            facRating.setText("Facility Rating: " + team.getFacilityRating());
            playerCount.setText("Players: " + team.getPlayerListSize());
            
            previous.setDisable(index == 0);
            next.setDisable(index == (chosenLeague.getTeamListSize() - 1));
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
} 