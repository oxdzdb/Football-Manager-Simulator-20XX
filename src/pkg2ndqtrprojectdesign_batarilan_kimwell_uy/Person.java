/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndqtrprojectdesign_batarilan_kimwell_uy;

/**
 *
 * @author Dell
 */
public abstract class Person {
    protected String name, nationality;
    protected Team team; 
    protected int XP, skillRating, popularityRating;
    
    public Person(String nm, String nt, Team t, int XP, int sR, int pR) {
        this.name = nm;
        this.nationality = nt;
        this.team = t;
        this.XP = XP;
        this.skillRating = sR;
        this.popularityRating = pR;
    }
    
    public String getName(){
        return name;
    }
    
    public String getNationality(){
        return nationality;
    }
    
    public Team getTeam(){
        return team;
    }
    
    public int getXP(){
        return XP;
    }
    
    public int getskillRating(){
        return skillRating;
    }
    
    public int getpopularityRating(){
        return popularityRating;
    }
    
}
