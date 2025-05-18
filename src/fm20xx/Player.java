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
    /**
     * name of the League
     */
    private String nationality;/**
     * name of the League
     */
    private String team;
    /**
     * name of the League
     */
    private int age;
    /**
     * name of the League
     */
    private int skillRating;
    /**
     * name of the League
     */
    private String position;
    /**
     * name of the League
     */
    private int number;
    /**
     * name of the League
     */
    private int goals;
    /**
     * name of the League
     */
    private int yellowCards;
    /**
     * name of the League
     */
    private int redCards;
    /**
     * name of the League
     */
    private int value;
    /**
     * name of the League
     */
    private double energy;

    /**
     * creates an instance of a Player
     * @param name name of player
     * @param nationality nationality of player
     * @param team team name of player
     * @param age age of player
     * @param skillRating skill rating of player
     * @param position position of player 
     * @param number player number of player
     * @param goals number of scored goals of player
     * @param yellowCards number of yellow cards the player has
     * @param redCards number of red cards the player has
     * @param value monetary value of the player
     * @param energy energy level of the player
     * 
     */
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

    /**
     * @return name of player
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return nationality of player
     */
    public String getNationality() {
        return nationality;
    }
    
    /**
     * @return team name of player
     */
    public String getTeam() {
        return team;
    }
    
    /**
     * @return age of player
     */
    public int getAge() {
        return age;
    }
    
    /**
     * @return skill rating of player
     */
    public int getSkillRating() {
        return skillRating;
    }
    
    /**
     * @return position of player
     */
    public String getPosition() {
        return position;
    }
    
    /**
     * @return player number of player
     */
    public int getNumber() {
        return number;
    }
    
    /**
     * @return number of goals of player
     */
    public int getGoals() {
        return goals;
    }
    
    /**
     * @return number of yellow cards the player has
     */
    public int getYellowCards() {
        return yellowCards;
    }
    
    /**
     * @return number of red cards the player has
     */
    public int getRedCards() {
        return redCards;
    }
    
    /**
     * @return monetary value of player
     */
    public int getValue() {
        return value;
    }
    
    /**
     * @return energy level of player
     */
    public double getEnergy() {
        return energy;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
    }
}
