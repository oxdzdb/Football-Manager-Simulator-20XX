/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package fm20xx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class FM20XX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fm20xx/Title.fxml"));
        
        League prem = new League("Premier League", "England", "leagueImgs/premierLeague.png");
        League bundesliga = new League("Bundesliga", "Germany", "leagueImgs/bundesliga.png");
        League laLiga = new League("La Liga", "Spain", "leagueImgs/laLiga.png");
        League serieA = new League("Serie A", "Italy", "leagueImgs/serieA.png");
        League ligue1 = new League("Ligue 1", "France", "leagueImgs/ligue1.png");
        
        Team AdM = new Team("Atletico de Manila", "ADM", "Manila", "Rizal Memorial Stadium", 0, 0, 0, 0, 0, 450000000, 60, 40, 10, "s");
        Team DD = new Team("Dynamo Dresden", "DD", "Dresden", "Rudolf-Harbig-Stadion", 0, 0, 0, 0, 0, 550000000, 70, 60, 10, "s");
        Team SS = new Team("Sofia Strikers", "SS", "Sofia", "Vasil Levski National Stadium", 0, 0, 0, 0, 0, 450000000, 60, 40, 10, "s");
        Team YM = new Team("Yokohama Marinos", "YM", "Yokohama", "Nissan Stadium", 0, 0, 0, 0, 0, 550000000, 70, 60, 10, "s");
        
        Player p1 = new Player("Arti", "Filipino", AdM, 60, 80, 60, "FW", 0, 42, 600000.0);
        Player p2 = new Player("Ficial", "Filipino", AdM, 70, 70, 60, "MF", 0, 3, 700000.0);
        Player p3 = new Player("Ama", "Filipino", AdM, 70, 60, 60, "DF", 0, 12, 800000.0);
        Player p4 = new Player("Teurs", "Filipino", AdM, 80, 75, 60, "FW", 0, 13, 900000.0);
        Player p5 = new Player("Arent", "Filipino", AdM, 70, 75, 60, "MF", 0, 15, 1000000.0);
        Player p6 = new Player("Alla", "Filipino", AdM, 70, 60, 60, "DF", 0, 2, 550000.0);
        Player p7 = new Player("Masing", "Filipino", AdM, 65, 80, 60, "FW", 0, 6, 650000.0);
        Player p8 = new Player("Anali", "Filipino", AdM, 70, 90, 60, "MF", 0, 24, 750000.0);
        Player p9 = new Player("Tikli", "Filipino", AdM, 80, 60, 60, "DF", 0, 25, 850000.0);
        Player p10 = new Player("Iya", "Filipino", AdM, 80, 60, 60, "FW", 0, 26, 950000.0);
        Player p11 = new Player("Sault", "Filipino", AdM, 80, 70, 60, "MF", 0, 27, 1050000.0);
        Player p12 = new Player("Anam", "Filipino", AdM, 75, 75, 60, "DF", 0, 29, 1000000.0);
        Player p13 = new Player("Atith", "Filipino", AdM, 70, 75, 60, "FW", 0, 28, 11000000.0);
        Player p14 = new Player("Ings", "Filipino", AdM, 55, 75, 60, "MF", 0, 41, 1200000.0);
        Player p15 = new Player("Brock", "Filipino", AdM, 85, 60, 60, "DF", 0, 39, 1300000.0);
        Player p16 = new Player("Enba", "Filipino", AdM, 90, 60, 60, "FW", 0, 37, 1150000.0);
        Player p17 = new Player("Riers", "Filipino", AdM, 80, 80, 60, "MF", 0, 35, 600000.0);
        Player p18 = new Player("Bounde", "German", DD, 70, 60, 80, "DF", 0, 33, 700000.0);
        Player p19 = new Player("Dibby", "German", DD, 80, 60, 75, "FW", 0, 31, 800000.0);
        Player p20 = new Player("Zubbob", "German", DD, 80, 60, 75, "MF", 0, 32, 900000.0);
        Player p21 = new Player("Beat", "German", DD, 60, 90, 90, "DF", 0, 34, 1000000.0);
        Player p22 = new Player("Bill", "German", DD, 60, 60, 80, "FW", 0, 36, 1100000.0);
        Player p23 = new Player("Dings", "German", DD, 80, 75, 60, "MF", 0, 38, 1200000.0);
        Player p24 = new Player("Harbro", "German", DD, 80, 90, 60, "DF", 0, 40, 1300000.0);
        Player p25 = new Player("Kenbae", "German", DD, 70, 60, 80, "FW", 0, 50, 650000.0);
        Player p26 = new Player("Sicly", "German", DD, 65, 60, 75, "MF", 0, 53, 750000.0);
        Player p27 = new Player("Imbom", "German", DD, 85, 60, 65, "DF", 0, 56, 850000.0);
        Player p28 = new Player("Barding", "German", DD, 70, 70, 80, "FW", 0, 62, 950000.0);
        Player p29 = new Player("Casual", "German", DD, 60, 65, 60, "MF", 0, 63, 1050000.0);
        Player p30 = new Player("Leecree", "German", DD, 70, 75, 60, "DF", 0, 59, 1150000.0);
        Player p31 = new Player("Aitcat", "German", DD, 80, 80, 70, "FW", 0, 67, 1250000.0);
        Player p32 = new Player("Tastro", "German", DD, 60, 60, 85, "MF", 0, 65, 1350000.0);
        Player p33 = new Player("Fisca", "German", DD, 70, 65, 90, "DF", 0, 10, 600000.0);
        Player p34 = new Player("Salti", "German", DD, 75, 60, 75, "FW", 0, 8, 700000.0);
        Player p35 = new Player("Scanse", "Bulgarian", SS, 75, 60, 75, "MF", 0, 12, 800000.0);
        Player p36 = new Player("Lingcats", "Bulgarian", SS, 60, 60, 75, "DF", 0, 17, 900000.0);
        Player p37 = new Player("Godder", "Bulgarian", SS, 80, 60, 75, "FW", 0, 23, 1000000.0);
        Player p38 = new Player("Canopee", "Bulgarian", SS, 70, 70, 75, "MF", 0, 25, 650000.0);
        Player p39 = new Player("Scalas", "Bulgarian", SS, 65, 80, 75, "DF", 0, 26, 750000.0);
        Player p40 = new Player("Ting", "Bulgarian", SS, 70, 60, 80, "FW", 0, 29, 850000.0);
        Player p41 = new Player("Deton", "Bulgarian", SS, 80, 65, 70, "MF", 0, 31, 950000.0);
        Player p42 = new Player("Nata", "Bulgarian", SS, 75, 75, 75, "DF", 0, 43, 1050000.0);
        Player p43 = new Player("Dimadank", "Bulgarian", SS, 75, 60, 65, "FW", 0, 37, 1000000.0);
        Player p44 = new Player("Delidoo", "Bulgarian", SS, 75, 80, 75, "MF", 0, 34, 1100000.0);
        Player p45 = new Player("Windo", "Bulgarian", SS, 75, 75, 60, "DF", 0, 48, 1200000.0);
        Player p46 = new Player("Denon", "Bulgarian", SS, 75, 60, 65, "FW", 0, 38, 1300000.0);
        Player p47 = new Player("Strachi", "Bulgarian", SS, 75, 85, 75, "MF", 0, 28, 1150000.0);
        Player p48 = new Player("Onsdon", "Bulgarian", SS, 75, 65, 80, "DF", 0, 26, 1250000.0);
        Player p49 = new Player("Dadaond", "Bulgarian", SS, 75, 75, 75, "FW", 0, 49, 1350000.0);
        Player p50 = new Player("Thedown", "Bulgarian", SS, 75, 60, 70, "MF", 0, 47, 600000.0);
        Player p51 = new Player("Loweat", "Bulgarian", SS, 75, 80, 60, "DF", 0, 45, 700000.0);
        Player p52 = new Player("Ingother", "Japanese", YM, 75, 60, 65, "FW", 0, 2, 600000.0);
        Player p53 = new Player("Editer", "Japanese", YM, 75, 60, 75, "MF", 0, 5, 700000.0);
        Player p54 = new Player("Switch", "Japanese", YM, 80, 60, 85, "DF", 0, 46, 800000.0);
        Player p55 = new Player("Eachen", "Japanese", YM, 65, 60, 75, "FW", 0, 56, 900000.0);
        Player p56 = new Player("Ivery", "Japanese", YM, 75, 60, 60, "MF", 0, 57, 1000000.0);
        Player p57 = new Player("Enerch", "Japanese", YM, 75, 60, 70, "DF", 0, 63, 1100000.0);
        Player p58 = new Player("Ecticep", "Japanese", YM, 75, 60, 65, "FW", 0, 38, 1200000.0);
        Player p59 = new Player("Isode", "Japanese", YM, 80, 65, 75, "MF", 0, 50, 900000.0);
        Player p60 = new Player("Elefa", "Japanese", YM, 75, 70, 80, "DF", 0, 40, 650000.0);
        Player p61 = new Player("Tededy", "Japanese", YM, 65, 65, 70, "FW", 0, 30, 750000.0);
        Player p62 = new Player("Ettikit", "Japanese", YM, 60, 80, 60, "MF", 0, 20, 850000.0);
        Player p63 = new Player("Furyo", "Japanese", YM, 70, 70, 75, "DF", 0, 10, 950000.0);
        Player p64 = new Player("Spat", "Japanese", YM, 85, 75, 60, "FW", 0, 62, 1050000.0);
        Player p65 = new Player("Fabulous", "Japanese", YM, 80, 80, 75, "MF", 0, 64, 1250000.0);
        Player p66 = new Player("Fanta", "Japanese", YM, 75, 65, 85, "DF", 0, 66, 1350000.0);
        Player p67 = new Player("Stick", "Japanese", YM, 75, 70, 75, "FW", 0, 72, 1100000.0);
        Player p68 = new Player("Flur", "Japanese", YM, 70, 80, 60, "MF", 0, 68, 1300000.0);
        
        Manager Batarilan = new Manager("Prian Batarilan", "Filipino", AdM, 85, 85, 85);
        Manager Kimwell = new Manager("Oltritch Kimwell", "German", DD, 70, 65, 75); 
        Manager Uy = new Manager("Scian Uy", "Bulgarian", SS, 80, 75, 80);
        Manager Citar = new Manager("Carmer Citar", "Japanese", YM, 75, 80, 65); 
  
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
