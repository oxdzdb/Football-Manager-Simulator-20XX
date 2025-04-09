/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package fm20xx;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class FM20XX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Title.fxml"));
        Parent root = loader.load();
        
        League prem = new League("Premier League", "England", "leagueImgs/premierLeague.png");
        League bundesliga = new League("Bundesliga", "Germany", "leagueImgs/bundesliga.png");
        League laLiga = new League("La Liga", "Spain", "leagueImgs/laLiga.png");
        League serieA = new League("Serie A", "Italy", "leagueImgs/serieA.png");
        League ligue1 = new League("Ligue 1", "France", "leagueImgs/ligue1.png");
        
        
        League.getLeagueList().add(prem);
        League.getLeagueList().add(bundesliga);
        League.getLeagueList().add(laLiga);
        League.getLeagueList().add(serieA);
        League.getLeagueList().add(ligue1);
        
        TitleController controller = loader.getController();
        controller.chosen(prem);
        
  
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}