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
    
    //@FXML Label homeTeam;
    //@FXML Label awayTeam;
    //@FXML Label homeScore;
    //@FXML Label awayScore;
    //@FXML Label nameGameWeek;
    @FXML Label timer;
    //@FXML Label commentary;
    //@FXML Label matchSummary;
    //@FXML ImageView icon;
    //@FXML Button skip;
    @FXML Button manage;
    
    int minutes = 0;
    
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
    private void updateTime() {
        if (minutes < 10) {
            timer.setText("'0" + minutes);
        }
        else {
            timer.setText("'" + minutes);
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
            updateTime();
        }
        else {
            //update total data from match data (need csv data)
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
            Parent root = loader.load();
            Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene  = new Scene(root);
            thisStage.setScene(scene);
            thisStage.show();
        }
    }
}
