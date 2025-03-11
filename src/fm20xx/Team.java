/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

import java.util.ArrayList;

/**
 *
 * @author oxdzdb
 */
public class Team {
    private String name, shortName, imgFileName, location;
    private int win, draw, loss, funds, goals, concGoals, facRating, points;
    private static ArrayList<Player> playerList = new ArrayList();
    private static ArrayList<Staff> staffList = new ArrayList();
    private static ArrayList<Player> startList = new ArrayList();
    private static ArrayList<Player> subList = new ArrayList();
    
    //getters and setters
    public String getName(){
        return name;
    }
    public String getShortName(){
        return shortName;
    }
    public String getImgFileName(){
        return imgFileName;
    }
    public String getLocation(){
        return location;
    }
    public int getWins(){
        return win;
    }
    public int getDraws(){
        return draw;
    }
    public int getLosses(){
        return loss;
    }
    public int getFunds(){
        return funds;
    }
    public int getGoals(){
        return goals;
    }
    public int getConcGoals(){
        return concGoals;
    }
    public int getFacRating(){
        return facRating;
    }
    public int getPoints(){
        return points;
    }
    public static int getPlayerListSize(){
        return playerList.size();
    }
    
    public void buySell(){
        
    }
}
