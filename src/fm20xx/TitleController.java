/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
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
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class TitleController implements Initializable {
    
    @FXML Button start;
    @FXML Button setting;
    @FXML Button exit;
    static League chosenLeague = null;
    int teamIndex;
    static Team chosenTeam = null;
    ArrayList<Team> teamList;
    
    
    @FXML
    private void start(ActionEvent event) throws IOException {
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
        chosenTeam = chosenLeague.searchTeam(teamIndex);
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