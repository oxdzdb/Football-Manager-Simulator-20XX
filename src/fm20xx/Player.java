/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

/**
 *
 * @author oxdzdb
 */
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
               ", skillRating=" + skillRating +
               ", position='" + position + '\'' +
               ", number=" + number +
               ", goals=" + goals +
               ", yellowCards=" + yellowCards +
               ", redCards=" + redCards +
               ", value=" + value +
               '}';
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @return the team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the skillRating
     */
    public int getSkillRating() {
        return skillRating;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return the goals
     */
    public int getGoals() {
        return goals;
    }

    /**
     * @return the yellowCards
     */
    public int getYellowCards() {
        return yellowCards;
    }

    /**
     * @return the redCards
     */
    public int getRedCards() {
        return redCards;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param skillRating the skillRating to set
     */
    public void setSkillRating(int skillRating) {
        this.skillRating = skillRating;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(int goals) {
        this.goals = goals;
    }

    /**
     * @param yellowCards the yellowCards to set
     */
    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    /**
     * @param redCards the redCards to set
     */
    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }
}