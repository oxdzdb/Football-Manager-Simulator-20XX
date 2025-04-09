/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
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
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class TitleController implements Initializable {
    
    @FXML Button start;
    @FXML Button setting;
    @FXML Button exit;
    League chosenLeague = null;
    
    
    @FXML
    private void start(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TeamSelect.fxml"));
        Parent root = loader.load();
        TeamSelectController controller = loader.getController();
        controller.chosen(chosenLeague);
        System.out.println(chosenLeague.getName() + " is the new chosen team.");
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    @FXML
    private void setting(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Settings.fxml"));
        Parent root = loader.load();
        SettingsController controller = loader.getController();
        controller.chosen(chosenLeague);
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
    private void exit(ActionEvent event) {
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        thisStage.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}