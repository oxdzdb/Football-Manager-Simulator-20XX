/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndqtrprojectdesign_batarilan_kimwell_uy;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Match {
    private Team home;
    private Team away;
    private int attendance;
    private double entranceFee;
    private League leagueGame;
    Manager Kimwell = new Manager("Oltritch Kimwell", "German", home, 70, 65, 75); 
    
    public Match(Team h, Team a, int at, double eF, League lG) {
        this.home = h;
        this.away = a;
        this.attendance = at;
        this.entranceFee = eF;
        this.leagueGame = lG;
    }

    /**
     * @return the home
     */
    public Team getHome() {
        return home;
    }

    /**
     * @return the away
     */
    public Team getAway() {
        return away;
    }

    /**
     * @return the attendance
     */
    public int getAttendance() {
        return attendance;
    }

    /**
     * @return the entranceFee
     */
    public double getEntranceFee() {
        return entranceFee;
    }

    /**
     * @return the leagueStatus
     */
    public League getLeagueGame() {
        return leagueGame;
    }
    
     Scanner sc = new Scanner(System.in);
    public void matchEngine(Team awayTeam, Team homeTeam){
    int counter = 0;
    Team turn; 
    
    do{
        System.out.println("What do you want to do?\n1: to advance minutes \n2: to substitute ");
            int courseOfAction = sc.nextInt();
            int advanceMinutes = 0;
            //KickOFF
            String possession;
            if(randomFunction() != true){
                turn = homeTeam; // if result is false, ball is given to us YESSIR
                possession = "home";
            } 
            else {
                turn = awayTeam; //if result = true, ball is given to opps
                possession = "away";
            }
            do{
                switch(courseOfAction){
                    case 1: {
                        System.out.println("Enter amount of minutes you wish to advance:");
                        advanceMinutes = sc.nextInt();
                        counter += advanceMinutes;
                    }
                    break;
                    case 2:{
                        Kimwell.SwapPlayers(homeTeam);
                    }
                    break;
                    default: System.out.println("Invalid Input!");break;
                }        
            } while (advanceMinutes == 0);
            
            if(advanceMinutes > 0){ 
                advanceMinutes--;
            }
            
            //the rest of the simulated game??
            for(int i = 0; i < advanceMinutes; i++){
                System.out.println("Team " + turn.getName() + "has possesion of the ball");
                if(randomFunction() == true){
                    turn = homeTeam; // if result is false, ball is given to us YESSIR
                    if("home".equals(possession)){
                        System.out.println("Team "+ turn.getName() + "retains the ball.");
                        possession = "home";
                    }
                    else{
                        System.out.println("Oh no! Team "+ turn.getName() + "steals the ball!");
                        possession = "away";
                    }
                     
                } 
                else {
                turn = awayTeam; //if result = true, ball is given to opps
                    if("away".equals(possession)){
                        System.out.println("Team "+ turn.getName() + "retains the ball");
                        possession = "away";
                    }
                    else{
                        System.out.println("Team "+ turn.getName() + "steals the ball");
                        possession = "home";
                    }
                }
            }
    
        } while(counter < 90);
    }
    
    public boolean randomFunction(){
        //basically randomizes the output of the boolean to be T/F
        int random1 = (int) Math.floor(Math.random()*100) + 1;
            boolean result = (random1 > 50);
    
            return result;
    }
}
