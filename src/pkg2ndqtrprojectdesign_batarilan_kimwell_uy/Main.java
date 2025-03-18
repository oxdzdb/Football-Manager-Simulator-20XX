/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2ndqtrprojectdesign_batarilan_kimwell_uy;

/**
 *
 * @author Dell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean exit = false;

        Team AdM = new Team("Atletico de Manila", "ADM", "Manila", "Rizal Memorial Stadium", 450000000, 60, 40);
        Team DD = new Team("Dynamo Dresden", "DD", "Dresden", "Rudolf-Harbig-Stadion", 550000000, 70, 60);
        
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
        
        Manager Batarilan = new Manager("Prian Batarilan", "Filipino", AdM, 85, 85, 85);
        Manager Kimwell = new Manager("Oltritch Kimwell", "German", DD, 70, 65, 75); 
        
        League OL = new League("Origins League", "Philippines", 85);
        Match m = new Match(AdM, DD, 20000, 40.0, OL);
        
            System.out.println(AdM.getPlayerList());
           System.out.println(AdM.getStartingLineup()); 
    
        System.out.println("The team composition");
     
           System.out.println(AdM.getSubsLineup()); 
        
        
        m.matchEngine(AdM, DD);
        
    }
    
}
