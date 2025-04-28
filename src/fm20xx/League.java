/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

import java.util.ArrayList;

/**
 *
 * @author oxdzdb
 */
public class League {
    private String name, imgFileName, nation;
    private int popRating;
    private static ArrayList<League> leagueList = new ArrayList();
    private ArrayList<Team> teamList;
    
    public League(String nm, String nt, String fn) {
        this.name = nm;
        this.nation = nt;
        this.imgFileName = fn;
    }
    
    //getters and setters
    public String getName(){
        return name;
    }
    public String getImgFileName(){
        return imgFileName;
    }
    public String getNation(){
        return nation;
    }
    public static ArrayList getLeagueList(){
        return leagueList;
    }
    public static int getLeagueListLen(){
        return leagueList.size();
    }
    public ArrayList<Team> getTeamList(){
        return teamList;
    }
    public int getTeamListSize(){
        return teamList.size();
    }
    public void setTeamList(ArrayList<Team> tL){
        this.teamList = tL;
    }
    
    public static League searchLeague(int index) throws IndexOutOfBoundsException{
        return leagueList.get(index);
    }
    
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
    
    public Team searchTeam(int index) throws IndexOutOfBoundsException{
        return teamList.get(index);
    }
    
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