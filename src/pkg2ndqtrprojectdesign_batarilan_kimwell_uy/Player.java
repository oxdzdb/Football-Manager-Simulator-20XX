/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndqtrprojectdesign_batarilan_kimwell_uy;

/**
 *
 * @author Dell
 */
public class Player extends Person{
    protected String position;
    protected int goals, appearances, playerNumber;
    protected double playerValue;
    
    public Player(String nm, String nt, Team t, int XP, int sR, int pR, String p, int a, int pN, double pV) {
        super(nm, nt, t, XP, sR, pR);
        this.position = p;
        this.appearances = a;
        this.playerNumber = pN;
        this.playerValue = pV;
        this.team.getPlayerList().add(this);
    }
    
    public int getGoals(){
        return goals;
}
    public int getAppearances(){
        return appearances;
}
    public int getPlayerNumber(){
        return playerNumber;
    }
    public double getPlayerValue(){
        return playerValue;
    }
}
