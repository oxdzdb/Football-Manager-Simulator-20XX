/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

/**
 *
 * @author oxdzdb
 */
public class Person {
    private String name, nation;
    private int sklRating, popRating, XP;
    private Team team;
    
    public Person(String nm, String nt, Team t, int XP, int sR, int pR) {
        this.name = nm;
        this.nation = nt;
        this.team = t;
        this.XP = XP;
        this.sklRating = sR;
        this.popRating = pR;
    }
    
    //getters and setters
    public String getName(){
        return name;
    }
    public String getNation(){
        return nation;
    }
    public int getSkillRating(){
        return sklRating;
    }
    public int getPopRating(){
        return popRating;
    }
    public Team getTeam(){
        return team;
    }
}
