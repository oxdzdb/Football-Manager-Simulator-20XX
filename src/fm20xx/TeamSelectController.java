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
import javafx.stage.Stage;

/**
 * TeamSelect.fxml Controller class
 *
 * @author Dell
 */

public class TeamSelectController implements Initializable {
    @FXML private Button back;
    @FXML private Button home;
    @FXML private Label teamName;
    @FXML private Label location;
    @FXML private Label leagueName;
    @FXML private Label budget;
    @FXML private Label aveRating;
    @FXML private Label facRating;
    @FXML private Label playerCount;
    
    private void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Title.fxml"));
        Parent root = loader.load();
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
} 