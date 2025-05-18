/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fm20xx;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    Team away = TeamSelectController.chosenTeam; // supposed to be another team, need function for matchups
    
    private static final Random rng = new Random();
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

    Team poss = home;
    Team opp = away; 
    Team pSwitch = home;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void match(KeyEvent event) throws IOException {
        timeButton();
        attack();
    }
    
    private int rng() {
        return rng.nextInt(100);
    }

    private void attack() {
        int atkGen1;
        int atkGen2;

        atkGen1 = rng() - (poss.getFacilityRating() - opp.getFacilityRating()); //supposed to be average player skill ratings
        atkGen2 = rng();

        if (atkGen2 <= atkGen1) {
            if (poss == home) {
                hPasses += 5;
            } else {
                aPasses += 5;
            }
            commentary.setText("A chance here for " + poss.getName() + "!");
            chance();
        } else {
            int atkFail = rng();

            if (atkFail <= 50) {
                if (poss == home) {
                    hPasses += 10;
                } else {
                    aPasses += 10;
                }
                if (poss == home) {
                    hTime += 1;
                } else {
                    aTime += 1;
                }
                commentary.setText(poss.getName() + " recycles the ball.");
                tickTime();
                attack();
            } else if (atkFail <= 90) {
                if (poss == home) {
                    hPasses += 5;
                } else {
                    aPasses += 5;
                }
                commentary.setText("And " + poss.getName() + " loses the ball!");
                swapPossession();
                if (poss == home) {
                    hTime += 1;
                } else {
                    aTime += 1;
                }
                tickTime();
                attack();
            } else {
                if (poss == home) {
                    hPasses += 5;
                } else {
                    aPasses += 5;
                }
                swapPossession();
                commentary.setText("A great challenge wins " + poss.getName() + " the ball.");
                attack();
            }
        }
    }

    private void chance() {
        int chanceGen1 = rng() + poss.getFacilityRating() - opp.getFacilityRating(); //supposed to be attack rating vs defense rating
        int chanceGen2 = rng();

        if (chanceGen2 <= chanceGen1) {
            commentary.setText(poss.getName() + " has a clear opportunity!");
            shot();
        } else {
            commentary.setText(poss.getName() + "'s attack is snuffed out.");
            swapPossession();
            if (poss == home) {
                hPasses += 2;
            } else {
                aPasses += 2;
            }
            tickTime();
            attack();
        }
    }

    private void shot() {
        int shotGen = (rng() - (poss.getFacilityRating() - opp.getFacilityRating())); //supposed to be attacker vs gk rating
        if (rng() <= shotGen) {
            if (poss == home) {
                hScore += 1;
            } else {
                aScore += 1;
            }
            minutes += 2;
            if (poss == home) {
                hTime += 2;
            } else {
                aTime += 2;
            }
            if (hScore > aScore) {
                if (hScore > aScore + 1) {
                    commentary.setText("And the home side add another to their tally!");
                } else {
                    commentary.setText("And the home side take the lead!");
                }
            } else if (hScore == aScore) {
                commentary.setText("It's in and " + poss.getName() + " equalize!");
            } else {
                commentary.setText(poss.getName() + " score!");
            }
            updateTime();
            attack();
        } else {
            if (rng() <= 10) {
                shot();
            } else if (rng() <= 55 && rng() > 10) {
                if (poss == home) {
                    hPasses += 5;
                } else {
                    aPasses += 5;
                }
                commentary.setText(opp.getName() + " do well to clear it out.");
                swapPossession();
                if (poss == home) {
                    hTime += 1;
                } else {
                    aTime += 1;
                }
                tickTime();
                attack();
            } else if (rng() <= 100 && rng() > 55) {
                commentary.setText("Ball goes out for a corner.");
                corner();
            }
        }
        if (poss == home) {
            hShots += 1;
        } else {
            aShots += 1;
        }
    }

    private void corner() {
        minutes += 2;
        if (poss == home) {
            hTime += 2;
        } else {
            aTime += 2;
        }
        updateTime();

        if (rng() <= 25) {
            commentary.setText("Corner taken short.");
            chance();
        } else if (rng() <= 98 && rng() > 25) {
            int cornerGen = (rng() - (poss.getFacilityRating() - opp.getFacilityRating())); //supposed to be average ratings

            if (rng() <= cornerGen) {
                if (rng() < cornerGen) {
                    if (poss == home) {
                        hScore += 1;
                    } else {
                        aScore += 1;
                    }
                    if (hScore > aScore) {
                if (hScore > aScore + 1) {
                    commentary.setText("A bullet header gives the home side a larger advantage!!");
                } else {
                    commentary.setText("It's a header and in! The home side take the lead!");
                }
                } else if (hScore == aScore) {
                    commentary.setText("It's in and " + poss.getName() + " equalize!");
                } else {
                    commentary.setText(poss.getName() + " score!");
                }
                    minutes += 3;
                    if (poss == home) {
                        hTime += 3;
                    } else {
                        aTime += 3;
                    }
                    updateTime();
                } else {
                    if (rng() <= 25) {
                        if (poss == home) {
                            hPasses += 10;
                        } else {
                            aPasses += 10;
                        }
                        if (poss == home) {
                            hTime += 1;
                        } else {
                            aTime += 1;
                        }
                        commentary.setText("Corner brought outside the box...");
                        tickTime();
                        chance();
                    } else if (rng() <= 50 && rng() > 25) {
                        if (poss == home) {
                            hPasses += 5;
                        } else {
                            aPasses += 5;
                        }
                        commentary.setText(opp.getName() + " gain possession and an opportunity to counter.");
                        swapPossession();
                        if (poss == home) {
                            hTime += 1;
                        } else {
                            aTime += 1;
                        }
                        tickTime();
                        attack();
                    } else if (rng() <= 75 && rng() > 50) {
                        if (poss == home) {
                            hTime += 1;
                        } else {
                            aTime += 1;
                        }
                        commentary.setText("He's open for the shot!");
                        tickTime();
                        shot();
                    } else if (rng() <= 100 && rng() > 75) {
                        if (poss == home) {
                            hPasses += 5;
                        } else {
                            aPasses += 5;
                        }
                        commentary.setText("Ball is cleared and it's on for a counter!");
                        swapPossession();
                        if (poss == home) {
                            hTime += 1;
                        } else {
                            aTime += 1;
                        }
                        tickTime();
                        attack();
                    }
                }
            } else {
                if (poss == home) {
                    hScore += 1;
                } else {
                    aScore += 1;
                }
                commentary.setText("And it's gone straight in from the corner!");
                if (poss == home) {
                    hTime += 2;
                } else {
                    aTime += 2;
                }
                tickTime();
            }
        }

        if (poss == home) {
            hCorner += 1;
        } else {
            aCorner += 1;
        }
    }

    private void swapPossession() {
        Team temp = poss;
        poss = opp;
        opp = temp;
    }    
    
    private void tickTime() {
        minutes += 1;
        updateTime();
    }
    
    private void fillerCommentary() {
        int random = rng.nextInt(5);
        switch (random) {
            case 1:
                commentary.setText("A clean pass.");
                break;
            case 2:
                commentary.setText("Good Defending.");
                break;
            case 3:
                commentary.setText("Holding up play.");
                break;
            case 4:
                commentary.setText("Going down the side...");
                break;
            case 5:
                commentary.setText("Missed challenge there.");
        }
    }


    @FXML
    private void manage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Management.fxml"));
        Parent root = loader.load();
        Stage thisStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }
    
    @FXML
    private void home(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        Stage thisStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        thisStage.setScene(scene);
        thisStage.show();
    }

    @FXML
    private void commentary() {
        switch (minutes) {
            case 0:
                commentary.setText("Kickoff is here at the stadiumName"); //replace stadiumName
                break;
            case 45:
                if (hScore > aScore) {
                    commentary.setText("And it's halftime with homeTeam having the advantage.");
                } else if (aScore > hScore) {
                    commentary.setText("And it's halftime with awayTeam having the advantage.");
                } else if (hScore == aScore) {
                    commentary.setText("And it's all square here at halftime.");
                }   break;
            case 90:
                commentary.setText("And it's full time here at the stadiumName.");
                break;
            default:
                break;
        }
    }

    @FXML
    private void updateTime() {
        if (minutes >= 90) {
            timer.setText("FT");
            minutes = 90;
        } else if (minutes < 10) {
            timer.setText("'0" + minutes + ":00");
        } else {
            timer.setText("'" + minutes + ":00");
        }

        passes.setProgress((double) hPasses / (hPasses + aPasses));
        shots.setProgress((double) hShots / (hShots + aShots));
        possession.setProgress((double) hTime / (hTime + aTime));
    }
    
    @FXML
    private void timeButton()
    {
        switch (minutes) {
            case 0:
                timeControl.setText("Start Match");
                timeControl.setOnAction(event -> startMatch());
                break;
            case 45:
                timeControl.setText("Start 2nd Half");
                timeControl.setOnAction(event -> startSecondHalf());
                break;
            case 90:
                timeControl.setText("End Match");
                timeControl.setOnAction((ActionEvent event) -> {
                    try {
                        endMatch();
                    } catch (IOException ex) {
                        Logger.getLogger(MatchController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }); break;
            default:
                timeControl.setText("Skip to End");
                timeControl.setOnAction(event -> skipToEnd());
                break;
        }
    }

    
    private void startMatch() {
        attack();
        minutes = 1;
        updateTime();
        timeButton();
    }

    private void startSecondHalf() {
        attack();
        minutes = 45;
        updateTime();
        timeButton();
    }

    private void endMatch() throws IOException {
        minutes = 90;
        updateTime();
        updateData();
        timeControl.setDisable(true);
    }

    private void skipToEnd() {
        minutes = 90;
        updateTime();
        timeButton();
    }


    @FXML
    private void updateData() throws IOException {
        TeamSelectController.chosenTeam.setGoals(hScore);
        TeamSelectController.chosenTeam.setConcededGoals(aScore);
        //same for other team
        if(hScore > aScore) {
            TeamSelectController.chosenTeam.setWins(1);
            TeamSelectController.chosenTeam.setPoints(3);
            //same for other team
        } else if (hScore == aScore) {
            TeamSelectController.chosenTeam.setDraws(1);
            TeamSelectController.chosenTeam.setPoints(1);
            //same for other team
        } else {
            TeamSelectController.chosenTeam.setLosses(1);
            //same for other team
        }
        
    }
}
