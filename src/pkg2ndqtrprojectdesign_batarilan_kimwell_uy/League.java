/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndqtrprojectdesign_batarilan_kimwell_uy;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class League {
    private String name;
    private String nation;
    private int popularityRating;
    private static ArrayList<Team> teamList = new ArrayList();

    /**
     * @return the name
     */
    
    public League(String nm, String nt, int pR) {
        this.name = nm;
        this.nation = nt;
        this.popularityRating = pR;
    }
    
    public String getName() {
        return name;
    }

    /**
     * @return the nation
     */
    public String getNation() {
        return nation;
    }

    /**
     * @return the popularityRating
     */
    public int getPopularityRating() {
        return popularityRating;
    }

    /**
     * @return the teamList
     */
    public static ArrayList<Team> getTeamList() {
        return teamList;
    }
    
}
