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
        System.out.println("What do you want to do?\n1: to advance minutes \n2: to substitute ");
            int courseOfAction = sc.nextInt();
            int advanceMinutes = 0;
            //KickOFF
            int random;
            boolean result;
            
            if (minuteCounter == 0){
                random = (int) Math.floor(Math.random()*100) + 1;
                result = (random < 50);
                if(result){
                    turnTeam = homeTeam; // if result is true, ball goes home
                    notTurnTeam = awayTeam;
                } 
                else {
                    turnTeam = awayTeam; //if result is false, ball goes away
                    notTurnTeam = homeTeam;
                }
                random = (int) Math.floor(Math.random()*(turnTeam.getStartingLineup().size()));
                turnPlayer = turnTeam.getStartingLineup().get(random);
            }
            
            do{
                switch(courseOfAction){
                    case 1 -> {
                        System.out.println("Enter amount of minutes you wish to advance:");
                        advanceMinutes = sc.nextInt();
                    }
                    case 2 -> {
                        m.exchange(homeTeam);
                    }
                    default -> System.out.println("Invalid Input!");
                }        
            } while (advanceMinutes == 0);
            
            for(int i = 0; i < advanceMinutes; i++){
                System.out.println("'" + minuteCounter + " - Team " + turnPlayer.getName() + "has possesion of the ball!");
                
                double bound1, bound2, moveDeterminer, successDeterminer;
                
                switch(turnPlayer.getPosition()){
                    case "FW" -> {
                        bound1 = 50;
                        bound2 = 75;
                    }
                    case "MF" -> {
                        bound1 = 25;
                        bound2 = 75;
                    }
                    case "DF" -> {
                        bound1 = 25;
                        bound2 = 50;
                    }
                }
                
                moveDeterminer = Math.random()*100;
                
                if (moveDeterminer < bound1) {  // attack
                    random = (int) Math.floor(Math.random()*(turnTeam.getStartingLineup().size()));
                    notTurnPlayer = notTurnTeam.getStartingLineup().get(random);
                    successDeterminer = turnPlayer.getSkillRating() / (turnPlayer.getSkillRating() + notTurnPlayer.getSkillRating());
                    
                    if (move)
                }
                else if (bound1 <= moveDeterminer && moveDeterminer < bound2) { // pass
                    
                }
                else {  // keep
                    
                }
                
                
                
                turnPlayer.getSkillRating();
                
                minuteCounter++;
                
                if (minuteCounter == 90) {
                    break;
                }
            }
    
        } while(minuteCounter < 90);
    }
}
