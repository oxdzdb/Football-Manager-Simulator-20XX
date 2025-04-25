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

    public Player(String name, String nationality, String team, int age, int skillRating,
                  String position, int number, int goals, int yellowCards, int redCards, int value) {
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
}
/*
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
*/
/*
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
    private double value;

    public Player(String name, String nationality, String team, int age, int skillRating,
                  String position, int number, int goals, int yellowCards, int redCards, double value) {
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
    }

    @Override
    public String toString() {
        return "Player{" +
               "name='" + name + '\'' +
               ", nationality='" + nationality + '\'' +
               ", team='" + team + '\'' +
               ", age=" + age +
               ", skillRating=" + skillRating+
               ", position='" + position + '\'' +
               ", number=" + number +
               ", goals=" + goals +
               ", yellowCards=" + yellowCards +
               ", redCards=" + redCards +
               ", value=" + value +
               '}';
    }
*/