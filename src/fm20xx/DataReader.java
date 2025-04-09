/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

/**
 *
 * @author Zion
 */

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
    public static ArrayList<Team> readData(String filename, int x) throws FileNotFoundException{
        
        ArrayList<Team> dataList = new ArrayList<>();

        File dataFile;
        dataFile = new File(filename);

        Scanner fileScanner = new Scanner(dataFile);

        ArrayList<String> lines;
        lines = new ArrayList<>();
        
        while (fileScanner.hasNextLine()){
            lines.add(fileScanner.nextLine());
        } 

        for (int index = 1; index < lines.size(); index++)
        {
        	String line = lines.get(index);
                String [] data = line.split(",");
            
                String name = data[0];
                String shortName = data[1];
                String location = data[2];
                String stadiumName = data[3];
                int wins = Integer.parseInt(data[4]);
                int draws = Integer.parseInt(data[5]);
                int losses = Integer.parseInt(data[6]);
                int goals = Integer.parseInt(data[7]);
                int conGoals = Integer.parseInt(data[8]);
                int funds = Integer.parseInt(data[9]);
                int facRating = Integer.parseInt(data[10]);
                int points = Integer.parseInt(data[11]);
                int staCap = Integer.parseInt(data[12]);
                String imgFileName = data[13];
                
                League league = null;
                
                switch(x) {
                case 1:
                    league = (League) League.searchLeague("prem");
                break;
                case 2:
                    league = (League) League.searchLeague("bundesliga");
                break;
                case 3:
                    league = (League) League.searchLeague("laLiga");
                break;
                case 4:
                    league = (League) League.searchLeague("serieA");
                break;
                case 5:
                    league = (League) League.searchLeague("ligue1");
                break;
                }

            Team team = new Team(name, shortName, location, stadiumName, wins, draws, losses, goals, conGoals, funds, facRating, points, staCap, imgFileName, league);
            dataList.add(team);
        }
        return dataList;
    }
}