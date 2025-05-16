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
public class dataManager {
    Team chosenTeam;
    League chosenLeague;
    ArrayList<Team> leagueTeams;
    int matchday = 0;
    int budget = 0;
    ArrayList<Player> teamPlayers;
    ArrayList<Staff> teamStaff;
    int facilityRating = 0;
    
    public dataManager(Team chosenTeam, League chosenLeague, ArrayList leagueTeams, int matchday, int budget, ArrayList teamPlayers, ArrayList teamStaff, int facilityRating) {
        chosenTeam = chosenTeam;
        chosenLeague = chosenLeague;
        leagueTeams = leagueTeams;
        matchday = matchday;
        budget = budget;
        teamPlayers = teamPlayers;
        teamStaff = teamStaff;
        facilityRating = facilityRating;
    }
}
