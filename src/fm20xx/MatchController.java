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
import javafx.scene.control.ProgressBar;
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
    @FXML Label homeEvent1;
    @FXML Label homeEvent2;
    @FXML Label homeEvent3;
    @FXML Label homeEvent4;
    @FXML Label homeEvent5;
    @FXML Label homeEvent6;
    @FXML Label homeEvent7;
    @FXML Label homeEvent8;
    @FXML Label homeEvent9;
    @FXML Label homeEvent10;
    @FXML Label awayEvent1;
    @FXML Label awayEvent2;
    @FXML Label awayEvent3;
    @FXML Label awayEvent4;
    @FXML Label awayEvent5;
    @FXML Label awayEvent6;
    @FXML Label awayEvent7;
    @FXML Label awayEvent8;
    @FXML Label awayEvent9;
    @FXML Label awayEvent10;
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
    @FXML ProgressBar passes;
    @FXML ProgressBar possession;
    @FXML ProgressBar shots;
    
    Team home = TeamSelectController.chosenTeam;
    Team away = TeamSelectController.chosenTeam;
    int minutes = 0;
    int hScore = 0;
    int aScore = 0;
    int hPasses = 0;
    int aPasses = 0;
    int hTime = 0;
    int aTime = 0;
    int hCorner = 0;
    int aCorner = 0;
    int hShots = 0;
    int aShots = 0;

    Team poss = TeamSelectController.chosenTeam;
    Team opp = TeamSelectController.chosenTeam;
    Team pSwitch = TeamSelectController.chosenTeam;
    
    @FXML
    private void match(KeyEvent event) throws IOException {
       timeButton();
       commentary();
       attack();
    }
    
    @FXML
    private int rng() {
        return (int) (Math.random() * 100);
    }
    
    @FXML
    private int attack() {
        //2a
        int atkGen = 0;
        atkGen = (((int) (Math.random() * 100)) - ((poss.getFacilityRating() - opp.getFacilityRating()))); //supposed to be avg player ratings vs average player ratings
        //2b
        if((int) (Math.random() * 100) <= atkGen) {
            if(poss == home) {
                hPasses += 5;
            }
            else {
                aPasses += 5;
            }
            chance();
        }
        //2b-1
        else {
            //[RECYCLE]
            if(rng() <= 50) {
                if(poss == home) {
                hPasses += 10;
            }
            else {
                aPasses += 10;
            }
                minutes += 1;
                if(poss == home) {
                hTime += 1;
            }
            else {
                aTime += 1;
            }
                updateTime();
                attack();
            }
            //[LOSE]
            else if(rng() <= 90 && rng() > 50) {
                if(poss == home) {
                hPasses += 5;
            }
            else {
                aPasses += 5;
            }
                poss = opp;
                opp = pSwitch;
                pSwitch = poss;
                minutes += 1;
                if(poss == home) {
                hTime += 1;
            }
            else {
                aTime += 1;
            }
                updateTime();
                attack();
            }
            //[COUNTER]
            else {
                if(poss == home) {
                hPasses += 5;
            }
            else {
                aPasses += 5;
            }
                poss = opp;
                opp = pSwitch;
                pSwitch = poss;
                attack();
            }
        }
        return 1;
    }
    
    @FXML 
    private void chance() {
        //3a
        int chanceGen = 0;
        chanceGen = (((int) (Math.random() * 100)) - ((poss.getFacilityRating() - opp.getFacilityRating()))); //supposed to be avg player ratings vs average player ratings
        //3b
        if((int) (Math.random() * 100) <= chanceGen) {
            if(poss == home) {
                hPasses += 5;
            }
            else {
                aPasses += 5;
            }
            shot();
        }
        else {
            if(poss == home) {
                hPasses += 5;
            }
            else {
                aPasses += 5;
            }
            poss = opp;
            opp = pSwitch;
            pSwitch = poss;
            minutes += 1;
            if(poss == home) {
                hTime += 1;
            }
            else {
                aTime += 1;
            }
            updateTime();
            attack();
        }
    }
        
    @FXML
    private void shot() {
        //4a
        int shotGen = 0;
        shotGen = (((int) (Math.random() * 100)) - ((poss.getFacilityRating() - opp.getFacilityRating()))); //supposed to be attacker skill lvel vs gk skill level
        //4b
        if((int) (Math.random() * 100) <= shotGen) {
            //goal scored with a 60% chance divided among attackers, 30% chance divided among midifelders, 10% chance divided among defenders
            if(poss == home) {
                hScore += 1;
            }
            else {
                aScore += 1;
            }
            minutes += 2;
            if(poss == home) {
                hTime += 2;
            }
            else {
                aTime += 2;
            }
            updateTime();
        }
        //4b-1
        else {
            //[REBOUND]
            if(rng() <= 10) {
                shot();
            }
            //[MISS]
            else if(rng() <= 55 && rng() > 10) {
                if(poss == home) {
                    hPasses += 5;
                }
                else {
                   aPasses += 5;
                }
                poss = opp;
                opp = pSwitch;
                pSwitch = poss;
                minutes += 1;
                if(poss == home) {
                hTime += 1;
            }
            else {
                aTime += 1;
            }
                updateTime();
                attack();
            }
            //[CORNER]
            else if(rng() <= 95 && rng() > 55) {
                   corner();
            }
            //[PENALTY]
            else if(rng() <= 100 && rng() > 95) {
                if(rng() <= 75) {
                    //goal scored chance equally divided among all players on field
                    if(poss == home) {
                        hScore += 1;
                    }
                    else {
                        aScore += 1;
                    }
                    minutes += 3;
                    if(poss == home) {
                hTime += 3;
            }
            else {
                aTime += 3;
            }
                    updateTime();
                }
            }
        }
        if(poss == home) {
            hShots += 1;
        }
        else {
            aShots += 1;
        }
    }
    
    @FXML
    private void corner() {
        minutes += 2;
        if(poss == home) {
                hTime += 2;
            }
            else {
                aTime += 2;
            }
        updateTime();
        //5a
        //[SHORT]
        if(rng() <= 25) {
            chance();
        }
        //[CORNER SHOT]
        else if(rng() <= 98 && rng() > 25) {
            //5a-1
            int cornerGen = 0;
            cornerGen = (((int) (Math.random() * 100)) - ((poss.getFacilityRating() - opp.getFacilityRating()))); //supposed to be avg player ratings vs average player ratings
            //5a-2
            if((int) (Math.random() * 100) <= cornerGen) {
                if(rng() < cornerGen) {
                    //goal scored chance equally divided among all players on field
                    if(poss == home) {
                        hScore += 1;
                    }
                    else {
                        aScore += 1;
                    }
                    minutes += 3;
                    if(poss == home) {
                hTime += 3;
            }
            else {
                aTime += 3;
            }
                    updateTime();
                }
                else {
                    //[RECYCLE]
                    if(rng() <= 25) {
                        if(poss == home) {
                            hPasses += 10;
                        }
                        else {
                            aPasses += 10;
                        }
                        minutes += 1;
                        if(poss == home) {
                hTime += 1;
            }
            else {
                aTime += 1;
            }
                        updateTime();
                        chance();
                    }
                    //[LOSE]
                    else if(rng() <= 50 && rng() > 25) {
                        if(poss == home) {
                            hPasses += 5;
                        }
                        else {
                            aPasses += 5;
                        }
                        poss = opp;
                        opp = pSwitch;
                        pSwitch = poss;
                        minutes += 1;
                        if(poss == home) {
                hTime += 1;
            }
            else {
                aTime += 1;
            }
                        updateTime();
                        attack();
                    }
                    //[REBOUND]
                    else if(rng() <= 75 && rng() > 50) {
                        minutes += 1;
                        if(poss == home) {
                hTime += 1;
            }
            else {
                aTime += 1;
            }
                        updateTime();
                        shot();
                    }
                    //[CORNER COUNTER]
                    else if (rng() <= 100 && rng() > 75) {
                        if(poss == home) {
                            hPasses += 5;
                        }
                        else {
                            aPasses += 5;
                        }
                        poss = opp;
                        opp = pSwitch;
                        pSwitch = poss;
                        minutes += 1;
                        if(poss == home) {
                hTime += 1;
            }
            else {
                aTime += 1;
            }
                        updateTime();
                        attack();
                    }
                }
            }
            //[OLIMPICO]
            else {
                //goal scored chance equally divided among all players on field
                if(poss == home) {
                    hScore += 1;
                }
                else {
                    aScore += 1;
                }
                minutes += 2;
                if(poss == home) {
                hTime += 2;
            }
            else {
                aTime += 2;
            }
                updateTime();
            } 
            
        }
        if(poss == home) {
            hCorner += 1;
        }
        else {
            aCorner += 1;
        }
    }   
    
    @FXML
    private void timeButton() {
        switch (minutes) {
            case 0:
                timeControl.setText("Start Match");
                //set time control on action to match() function
                break;
            case 45:
                timeControl.setText("Start 2nd Half");
                //set time control on action to match() function
                break;
            case 90:
                timeControl.setText("End Match");
                //set time control on action to updateData() function
                break;
            default:
                timeControl.setText("Skip to End");
                //set time control on action to set minutes to 90
                break;
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
        minutes = 0;
        //reset possession bar
        //reset shots bar
        hPasses = 0;
        aPasses = 0;
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
            commentary.setText("Kickoff is here at the stadiumName"); //replace stadiumName
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
        
        passes.setProgress(hPasses/(hPasses+aPasses));
        shots.setProgress(hPasses/(hShots+aShots));
        possession.setProgress(hTime/(hTime+aTime));
    }

    @FXML
    private void skipToEnd(){
        minutes = 90;
        updateTime();
    }
    
    @FXML 
    private void updateData() throws IOException {
        //update total data from match data using csv data
        //return to home screen
    }
}
