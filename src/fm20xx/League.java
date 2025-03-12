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
public class League {
    private String name, imgFileName, nation;
    private int popRating;
    private static ArrayList<League> leagueList = new ArrayList();
    private static ArrayList<Team> teamList = new ArrayList();
    
    public League(String nm, String nt, int pR) {
        this.name = nm;
        this.nation = nt;
        this.popRating = pR;
        League.leagueList.add(this);
    }
    
    //getters and setters
    public String getName(){
        return name;
    }
    public String getImgFileName(){
        return imgFileName;
    }
    public String getNation(){
        return nation;
    }
    public int getPopRating(){
        return popRating;
    }
    public static ArrayList getLeagueList(){
        return leagueList;
    }
    public static int getLeagueListLen(){
        return leagueList.size();
    }
    public static int getTeamListSize(){
        return teamList.size();
    }
}
