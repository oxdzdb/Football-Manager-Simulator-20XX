/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

/**
 *
 * @author oxdzdb
 */
public class Match {
    private Team homeTeam, awayTeam;
    private int attendance;
    private double attFee;
    private League league;
    
    public Match(Team h, Team a, int at, double eF, League lG) {
        this.homeTeam = h;
        this.awayTeam = a;
        this.attendance = at;
        this.attFee = eF;
        this.league = lG;
    }

    //getters and setters
    public Team getHomeTeam(){
        return homeTeam;
    }
    public Team getAwayTeam(){
        return awayTeam;
    }
    public int getAttendance(){
        return attendance;
    }
    public double getAttFee(){
        return attFee;
    }
    public League getLeague(){
        return league;
    }
    
    public void matchEngine(Team awayTeam, Team homeTeam){
        
    int minuteCounter = 0;
    int swapCounter = 0;
    boolean newPlayer = false;
    Team turnTeam, notTurnTeam; 
    Player turnPlayer, notTurnPlayer;
    
    do{
    // fixed matchEngine here
        } while(minuteCounter < 90);
    }
}
