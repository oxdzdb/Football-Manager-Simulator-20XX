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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class SettingsController implements Initializable {
    @FXML private Button back;
    @FXML private Button team;
    
    @FXML
    private Button previous;
    @FXML
    private Button next;
    @FXML
    private Button select;
    @FXML
    private ImageView icon;
    @FXML
    private Label leagueName;
    private int index = 0;
    private int teamIndex;
    private League chosenLeague;
    private Team chosenTeam;
    private ArrayList<Team> teamList;
    
    @FXML
    private void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Title.fxml"));
        Parent root = loader.load();
        TitleController controller = loader.getController();
        controller.chosen(getChosenLeague(), getChosenLeague().getTeamList(), getIndex());
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
        System.out.println(getChosenLeague().getName() + " is the new chosen league.");
    }
    
    @FXML
    private void start(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TeamSelect.fxml"));
        Parent root = loader.load();
        TeamSelectController controller = loader.getController();
        controller.chosen(getChosenLeague(), getChosenLeague().getTeamList(), getTeamIndex());
        System.out.println(getChosenLeague().getName() + " is the new chosen team.");
        controller.updateTeam();
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene  = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    @FXML
    public void previous(){
        if(getIndex() > 0){
            index--;
            updateLeague();    
        }
    }
    
    @FXML
    public void chosen(League l, ArrayList<Team> tl, int tI){
        chosenLeague = l;
        teamList = tl;
        teamIndex = tI;
        chosenTeam = chosenLeague.searchTeam(teamIndex);
    }
    
    @FXML
    public void next(){
        if(getIndex() < League.getLeagueListLen()){
            index++;
            updateLeague();
        }
    }
    
    @FXML
    public void select(){
        chosenLeague = League.searchLeague(getIndex());
        System.out.println(getChosenLeague().getName() + " is the new chosen league.");
    }
    
    @FXML
    public void updateLeague(){
        League league = League.searchLeague(getIndex());
        if (league != null){
            getLeagueName().setText(league.getName());
            getIcon().setImage(new Image(getClass().getResourceAsStream(league.getImgFileName())));
            
            getPrevious().setDisable(getIndex() == 0);
            getNext().setDisable(getIndex() == (League.getLeagueListLen() - 1));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    /**
     * @return the back
     */
    public Button getBack() {
        return back;
    }

    /**
     * @return the team
     */
    public Button getTeam() {
        return team;
    }

    /**
     * @return the previous
     */
    public Button getPrevious() {
        return previous;
    }

    /**
     * @return the next
     */
    public Button getNext() {
        return next;
    }

    /**
     * @return the select
     */
    public Button getSelect() {
        return select;
    }

    /**
     * @return the icon
     */
    public ImageView getIcon() {
        return icon;
    }

    /**
     * @return the leagueName
     */
    public Label getLeagueName() {
        return leagueName;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @return the teamIndex
     */
    public int getTeamIndex() {
        return teamIndex;
    }

    /**
     * @return the chosenLeague
     */
    public League getChosenLeague() {
        return chosenLeague;
    }

    /**
     * @return the chosenTeam
     */
    public Team getChosenTeam() {
        return chosenTeam;
    }

    /**
     * @return the teamList
     */
    public ArrayList<Team> getTeamList() {
        return teamList;
    }
    
}