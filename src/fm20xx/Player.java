/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

/**
 *
 * @author oxdzdb
 */

public class Player {
    private String name;
    private String nationality;
    private String team;
    private int age;
    private int skillRating;
    private String position;
    private int number;
    private int goals;
    private int yellowCards;
    private int redCards;
    private int value;
    private double energy;

    public Player(String name, String nationality, String team, int age, int skillRating,
                  String position, int number, int goals, int yellowCards, int redCards, int value, double energy) {
        this.name = name;
        this.nationality = nationality;
        this.team = team;
        this.age = age;
        this.skillRating = skillRating;
        this.position = position;
        this.number = number;
        this.goals = goals;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.value = value;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }
    
    public String getNationality() {
        return nationality;
    }
    
    public String getTeam() {
        return team;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getSkillRating() {
        return skillRating;
    }
    
    public String getPosition() {
        return position;
    }
    
    public int getNumber() {
        return number;
    }
    
    public int getGoals() {
        return goals;
    }
    
    public int getYellowCards() {
        return yellowCards;
    }
    
    public int getRedCards() {
        return redCards;
    }
    
    public int getValue() {
        return value;
    }
    
    public double getEnergy() {
        return energy;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
    }

    void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
