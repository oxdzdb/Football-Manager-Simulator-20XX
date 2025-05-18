/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

import java.util.ArrayList;

/**
 * League that contains a set of teams to compete in matches
 * @author oxdzdb
 */
public class League {
    /**
     * name of the League
     */
    private String name;
    /**
     * string file name of League image logo in leagueImgs
     */
    private String imgFileName;
    /**
     * nation or location of the League
     */
    private String nation;
    /**
     * how popular the League is based on Matches
     */
    private int popRating;
    /**
     * list of all Leagues created
     */
    private static ArrayList<League> leagueList = new ArrayList();
    /**
     * list of all Teams within the League
     */
    private ArrayList<Team> teamList;
    
    /**
     * @param nm League name
     * @param nt League nation or location 
     * @param fn League image logo file name
     */
    public League(String nm, String nt, String fn) {
        this.name = nm;
        this.nation = nt;
        this.imgFileName = fn;
    }
    
    //getters and setters
    /**
     * @return League name
     */
    public String getName(){
        return name;
    }
    /**
     * @return League image logo file name
     */
    public String getImgFileName(){
        return imgFileName;
    }
    /**
     * @return League nation or location
     */
    public String getNation(){
        return nation;
    }
    /**
     * @return ArrayList of all League instances
     */
    public static ArrayList getLeagueList(){
        return leagueList;
    }
    /**
     * @return size of ArrayList of all League instances
     */
    public static int getLeagueListLen(){
        return leagueList.size();
    }
    /**
     * @return ArrayList of Teams within League instance
     */
    public ArrayList<Team> getTeamList(){
        return teamList;
    }
    /**
     * @return size of ArrayList of Teams within League instance
     */
    public int getTeamListSize(){
        return teamList.size();
    }
    /**
     * @param tL ArrayList of Teams
     */
    public void setTeamList(ArrayList<Team> tL){
        this.teamList = tL;
    }
    
    /**
     * @param index index of desired League in LeagueList
     * @return League with given index
     */
    public static League searchLeague(int index) throws IndexOutOfBoundsException{
        return leagueList.get(index);
    }
    
    /**
     * @param search leagueName of desired League in LeagueList
     * @return League with given name
     */
    public static League searchLeague(String search){
        League match = null;
        for(int i = 0; i < 5; i++){
            match = (League) League.getLeagueList().get(i);
            if (match.getName().equals(search)) {
                break;
            }
        }
        return match;
    }
    
    /**
     * @param index index of desired League in LeagueList
     * @return Team with given index
     */
    public Team searchTeam(int index) throws IndexOutOfBoundsException{
        return teamList.get(index);
    }
    /**
     * @param search name of League with the desired index
     * @return int index of League in LeagueList
     */
    public int indexGrabber(String search) throws NullPointerException{
        int i = 0;
        for(Team t : this.getTeamList()){
            if(t.getName().equalsIgnoreCase(search)) {
                return i;
            }
            else {
                i++;
            }
        }
        throw new NullPointerException();
    }
}