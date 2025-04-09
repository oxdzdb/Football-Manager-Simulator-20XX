/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

/**
 *
 * @author oxdzdb
 */
public class Player extends Person {
    private String position;
    private int goals, number;
    private double value;
    
    public Player(String nm, String nt, Team t, int aG, int sR, int pR, String p, int pN, double pV) {
        super(nm, nt, t, aG, sR, pR);
        this.position = p;
        this.number = pN;
        this.value = pV;
        this.getTeam().getPlayerList().add(this);
    }
    
    //getters and setters
    public String getPosition(){
        return position;
    }
    public int getGoals(){
        return goals;
    }
    public int getNumber(){
        return number;
    }
    public double getValue(){
        return value;
    }
}
