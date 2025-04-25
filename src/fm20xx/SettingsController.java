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
 * FXML Controller class
 *
 * @author Dell
 */
public class SettingsController implements Initializable {
    @FXML Button back, previous, next, select;
    @FXML ImageView icon;
    @FXML Label leagueName;
    
    int index = 0;
    League chosenLeague;
    
    @FXML
    private void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Title.fxml"));
        Parent root = loader.load();
        TitleController controller = loader.getController();
        controller.chosen(chosenLeague);
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
        System.out.println(chosenLeague.getName() + " is the new chosen league.");
    }
    
    @FXML
    public void previous(){
        if(index > 0){
            index--;
            updateLeague();    
        }
    }
    
    @FXML
    public void chosen(League l){
        chosenLeague = l;
    }
    
    @FXML
    public void next(){
        if(index < League.getLeagueListLen()){
            index++;
            updateLeague();
        }
    }
    
    @FXML
    public void select(){
        chosenLeague = League.searchLeague(index);
        System.out.println(chosenLeague.getName() + " is the new chosen league.");
    }
    
    @FXML
    public void updateLeague(){
        League league = League.searchLeague(index);
        if (league != null){
            leagueName.setText(league.getName());
            icon.setImage(new Image(getClass().getResourceAsStream(league.getImgFileName())));
            
            previous.setDisable(index == 0);
            next.setDisable(index == (League.getLeagueListLen() - 1));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}