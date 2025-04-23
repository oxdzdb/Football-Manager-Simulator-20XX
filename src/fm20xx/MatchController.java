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
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class MatchController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML Label homeTeam;
    @FXML ImageView homeIcon;
    @FXML Label awayTeam;
    @FXML ImageView awayIcon;
    @FXML Label homeScore;
    @FXML Label awayScore;
    @FXML Label matchWeek;
    @FXML Label leagueName;
    @FXML Label timer;
    @FXML Label commentary;
    @FXML ImageView leagueIcon;
    @FXML Button timeControl;
    
    int minutes = 0;
    int hScore = 0;
    int aScore = 0;
    
    @FXML
    private void timeButton() {
        if(minutes == 0) {
            timeControl.setText("Start Match");
            //set time control on action to match() function
        }
        else if(minutes == 45) {
            timeControl.setText("Start 2nd Half");
            //set time control on action to match() function
        }
        else if(minutes == 90) {
            timeControl.setText("End Match");
            //set time control on action to updateData() function
        }
        else {
            timeControl.setText("Skip to End");
            //set time control on action to set minutes to 90
        }
    }
    
    @FXML
    private void manage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Management.fxml"));
        Parent root = loader.load();
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    @FXML
    private void gameLoad() {
        //minutes = 0;
        //reset possession bar
        //reset shots bar
        //reset passes bar
        //reset corner kicks bar
        //reset commentary box
        //homeTeam.setText("home team name");
        //set home team icon
        //awayTeam.setText("away team name");
        //set away team icon
        //set name of league loaded
        //set current matchweek
    }
    
    @FXML
    private void commentary() {
        if(minutes == 0) {
            commentary.setText("Kickoff is here at the stadiumName");
        }
        else if(minutes == 45){
            if(hScore > aScore) {
                commentary.setText("And it's halftime with homeTeam having the advantage.");
            }
            else if(aScore > hScore) {
                commentary.setText("And it's halftime with awayTeam having the advantage.");
            }
            else if(hScore == aScore) {
                commentary.setText("And it's all square here at halftime.");
            }
        }
        else if(minutes == 90){
            commentary.setText("And it's full time here at the stadiumName.");
        }
    }
    
    @FXML 
    private void updateTime() {
        if (minutes < 10) {
            timer.setText("'0" + minutes + ":00");
        }
        else if(minutes == 90){
            timer.setText("FT");
        }
        else {
            timer.setText("'" + minutes + ":00");
        }
    }

    @FXML
    private void skipToEnd(){
        minutes = 90;
        updateTime();
    }
    
    @FXML
    private void match(KeyEvent event) throws IOException {
        if(minutes < 90){
            minutes += 1;
            commentary();
            updateTime();
        }
    }
    
    @FXML 
    private void updateData() throws IOException {
        //update total data from match data using csv data
        //return to home screen
    }
}
