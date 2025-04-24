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
    
    int minutes = 0;
    int hScore = 0;
    int aScore = 0;

    //Team possession = homeTeam;
    //Team opposition = awayTeam;
    //Team possessionSwitch = homeTeam;
    
    @FXML
    private void match(KeyEvent event) throws IOException {
       timeButton();
       commentary();
       attack();
    }
    
    @FXML
    private int attack() {
        int rngA = (int) (Math.random() * 100);
        //2a
        int atkGen = 0;
        // = (((int) (Math.random() * 100)) - ((possession.getAvgSkillLvl() - opposition.getAvgSkillLvl()))
        //2b
        if((int) (Math.random() * 100) <= atkGen) {
            //possession passes +5
            chance();
        }
        //2b-1
        else {
            //[RECYCLE]
            if(rngA <= 50) {
                //poss team passes +10
                minutes += 1;
                updateTime();
                attack();
            }
            //[LOSE]
            else if(rngA <= 90 && rngA > 50) {
                //poss team passess +5
                //possession = opposition;
                //opposition = possessionSwitch;
                //possessionSwitch = possession;
                minutes += 1;
                updateTime();
                attack();
            }
            //[COUNTER]
            else {
                //poss team passess +5
                //possession = opposition;
                //opposition = possessionSwitch;
                //possessionSwitch = possession;
                attack();
            }
        }
        return 1;
    }
    
    @FXML 
    private void chance() {
        //3a
        int chanceGen = 0;
        // = (((int) (Math.random() * 100)) - ((possession.player.getSkillLvl() - opposition.player.getSkillLvl()))
        //3b
        if((int) (Math.random() * 100) <= chanceGen) {
            //possession passes +5
            shot();
        }
        else {
            //poss team passess +5
            //possession = opposition;
            //opposition = possessionSwitch;
            //possessionSwitch = possession;
            minutes += 1;
            updateTime();
            attack();
        }
    }
        
    @FXML
    private void shot() {
        int rngS = (int) (Math.random() * 100);
        //4a
        int shotGen = 0;
        // = (((int) (Math.random() * 100)) - ((possession atk skill lvl - opposition gk skill lvl))
        //4b
        if((int) (Math.random() * 100) <= shotGen) {
            //award goal, goal scored with a 60% chance divided among attackers, 30% chance divided among midifelders, 10% chance divided among defenders
            minutes += 2;
            updateTime();
        }
            //4b-1
            else {
                //[REBOUND]
                if(rngS <= 10) {
                    shot();
                }
                //[MISS]
                else if(rngS <= 55 && rngS > 10) {
                    //poss team passess +5
                    //possession = opposition;
                    //opposition = possessionSwitch;
                    //possessionSwitch = possession;
                    minutes += 1;
                    updateTime();
                    attack();
                }
                //[CORNER]
                else if(rngS <= 95 && rngS > 55) {

                }
                //[PENALTY]
                else if(rngS <= 100 && rngS > 95) {
                    if(rngS <= 75) {
                        //award goal, goal scored chance equally divided among all players on field
                        minutes += 3;
                        updateTime();
                    }
                }
            }
    }
    
    @FXML
    private void corner() {
        minutes += 2;
        updateTime();
        int rngC = (int) (Math.random() * 100);
        
        //5a
        //[SHORT]
        if(rngC <= 25) {
            chance();
        }
        //[CORNER SHOT]
        else if(rngC <= 98 && rngC > 25) {
            //5a-1
            int cornerGen = 0;
            // = (((int) (Math.random() * 100)) - ((possession.getAvgSkillLvl() - opposition.getAvgSkillLvl()))
            //5a-2
            if((int) (Math.random() * 100) <= cornerGen) {
                if(rngC < cornerGen) {
                    //award goal, goal scored chance equally divided among all players on field
                    minutes += 3;
                    updateTime();
                }
                else {
                    //[RECYCLE]
                    if(rngC <= 25) {
                        //poss team passes +10
                        minutes += 1;
                        updateTime();
                        chance();
                    }
                    //[LOSE]
                    else if(rngC <= 50 && rngC > 25) {
                        //poss team passess +5
                        //possession = opposition;
                        //opposition = possessionSwitch;
                        //possessionSwitch = possession;
                        minutes += 1;
                        updateTime();
                        attack();
                    }
                    //[REBOUND]
                    else if(rngC <= 75 && rngC > 50) {
                        minutes += 1;
                        updateTime();
                        shot();
                    }
                    //[CORNER COUNTER]
                    else if (rngC <= 100 && rngC > 75) {
                        //poss team passess +5
                        //possession = opposition;
                        //opposition = possessionSwitch;
                        //possessionSwitch = possession;
                        minutes += 1;
                        updateTime();
                        attack();
                    }
                }
            }
            //[OLIMPICO]
            else {
                //award goal, goal scored chance equally divided among all players on field
                minutes += 2;
                updateTime();
            }    
        }
    }   
        
        /*
        Match System:
        First Possession - homeTeam
        Every 5 rolls, advance 1 minute.
        At halftime, possession is given to awayTeam

        REMINDERS:
        Update shots taken if after every shot (4)
        Count minutes that a team has poss to calculate poss stat
        Every activation (2b, 3b, 4b) is 5 passes, every change in possession is 5 passes, every [RECYCLE] is 10 passes (for calculating passes stat)
        Update corners taken after every corner (5)
        Always return to (1) if there is goal or possession switch
     
        1. Set poss and opp teams

        2. (SIM ATTACK) -

            2a. (GENERATE ATTACK) - Generate random number (1-100), Add the difference of possession and opp team avg skill lvl

            2b. (ROLL ATTACK) - Generate another number (1-100), If less than or equal to generateAttack number, chance is activated. If greater, roll for possession roll.

                2b-1. (Possession Roll) - Generate random number (1-100), if 0-50: poss team keep poss, advance minute return to -> 2a [RECYCLE], if 51-90: give poss to other team, advance minute [LOSE], if 91-100: give poss to other team, immediately return to -> 2a without advancing a minute [COUNTER].

        3. (SIM CHANCE) - 

            3a. (GENERATE CHANCE) - Generate random number (1-100), Add the difference of possession team attacker (random from players on field) and opp team defender (random from players on field) skill lvl.

            3b. (ROLL CHANCE) - Generate another random number (1-100), if less than or equal to generateChance number, shot is activated. If greater, give poss to other team, advance minute.

        4. (SIM SHOT) - 

            4a. (GENERATE SHOT) - Get the difference of the possession team attacker and opp team GK skill lvl and add it to (either 10, 25, or rng [FOR CALIBRATION]). 

            4b. (ROLL SHOT) - Generate random number (1-100), if less than or equal to generateShot number, goal is awarded to poss team, scored by random player from poss team (STs have 75% chance, MFs have 25% chance), advance a minute [GOAL]. If greater, roll for Recycle roll.

                4b-1 (Recycle Roll) - Generate random number (1-100). If 0-10: Return to 4a with the same poss team [REBOUND], if 11-55: Give poss to opp team, advance a minute [MISS], if 56-95: Activate corner for poss team [CORNER], if 96-100: Activate penalty for poss team [PENALTY].

                    4b-1a (ROLL PENALTY) - Generate random number (1-100), if lower than 75, goal awarded to poss team (All players have equal chance), advance 3 minutes [PEN].

        5. (SIM CORNER) - 

            5a. (ROLL CORNER) - Advance a minute then generate random number (1-100). If 0-25: Return to -> 3a [SHORT], if 26-98: Roll for corner shot roll, if 99-100: goal is awarded to poss team, scored by random player from poss team (STs have 25% chance, MFs have 75% chance), advance a minute [OLIMPICO].

                5a-1. (Generate Corner Shot) - Generate random number (1-100) add difference of poss team ST avg skill rating and opp team DF avg skill rating.

                5a-2. (Roll Corner Shot) - Generate another number (1-100), if lower than generateCornerShot, goal is awarded to poss team (All players have equal chance, GK has 2% chance) [CORNER GOAL]. If greater, roll for corner shake roll.

                    5a-2a. (Corner Shake Roll) - Generate random number (1-100). If 0-25: Poss remains with poss team, return to -> 3a [RECYCLE], if 26-50: give poss to opp team, advance 1 minute [LOSE]. If 51-75: Poss remains with poss team, return to -> 4a [REBOUND]. If 76-100: give poss to opp team, immediately return to -> 2a without advancing [CORNER COUNTER].
        */
    
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
            //commentary.setText("Kickoff is here at the stadiumName");
        }
        else if(minutes == 45){
            if(hScore > aScore) {
                //commentary.setText("And it's halftime with homeTeam having the advantage.");
            }
            else if(aScore > hScore) {
                //commentary.setText("And it's halftime with awayTeam having the advantage.");
            }
            else if(hScore == aScore) {
                //commentary.setText("And it's all square here at halftime.");
            }
        }
        else if(minutes == 90){
            //commentary.setText("And it's full time here at the stadiumName.");
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
    private void updateData() throws IOException {
        //update total data from match data using csv data
        //return to home screen
    }
}
