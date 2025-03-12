/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oxdzdb
 */
public class Team implements Exchange {
    private String name, shortName, location, stadiumName;
    private int wins, draws, losses, goals, concededGoals, funds, facilityRating, points;
    private static ArrayList<Player> playerList = new ArrayList();
    private static ArrayList<Staff> staffList = new ArrayList();
    private static ArrayList<Player> startingLineup = new ArrayList();
    private static ArrayList<Player> subsLineup = new ArrayList();

    public Team(String n, String shN, String l, String sN, int f, int fR, int p) {
        this.name = n;
        this.shortName = shN;
        this.location = l;
        this.stadiumName = sN;
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
        this.goals = 0;
        this.concededGoals = 0;
        this.funds = f;
        this.facilityRating = fR;
        this.points = p;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    

    /**
     * @return the shortName
     */
    public String getShortName() {
        return shortName;
    }



    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }



    /**
     * @return the stadiumName
     */
    public String getStadiumName() {
        return stadiumName;
    }


    /**
     * @return the wins
     */
    public int getWins() {
        return wins;
    }


    /**
     * @return the funds
     */
    public int getFunds() {
        return funds;
    }

  
    /**
     * @return the draws
     */
    public int getDraws() {
        return draws;
    }



    /**
     * @return the losses
     */
    public int getLosses() {
        return losses;
    }



    /**
     * @return the goals
     */
    public int getGoals() {
        return goals;
    }



    /**
     * @return the concededGoals
     */
    public int getConcededGoals() {
        return concededGoals;
    }



    /**
     * @return the facilityRating
     */
    public int getFacilityRating() {
        return facilityRating;
    }



    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }


    
    /**
     * @return the playerList
     */
    public static ArrayList<Player> getPlayerList() {
        return playerList;
    }


    /**
     * @return the staffList
     */
    public static ArrayList<Staff> getStaffList() {
        return staffList;
    }



    /**
     * @return the startingLineup
     */
    public static ArrayList<Player> getStartingLineup() {
        return startingLineup;
    }


    /**
     * @return the subsLineup
     */
    public static ArrayList<Player> getSubsLineup() {
        return subsLineup;
    }

    /**
     * @param wins the wins to set
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * @param draws the draws to set
     */
    public void setDraws(int draws) {
        this.draws = draws;
    }

    /**
     * @param losses the losses to set
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(int goals) {
        this.goals = goals;
    }

    /**
     * @param concededGoals the concededGoals to set
     */
    public void setConcededGoals(int concededGoals) {
        this.concededGoals = concededGoals;
    }

    /**
     * @param funds the funds to set
     */
    public void setFunds(int funds) {
        this.funds = funds;
    }

    /**
     * @param facilityRating the facilityRating to set
     */
    public void setFacilityRating(int facilityRating) {
        this.facilityRating = facilityRating;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * @param aPlayerList the playerList to set
     */
    
    
    Scanner sc = new Scanner(System.in); 
    
    @Override
    public void exchange(Team t){
        // fixed Exchange here
    }
}