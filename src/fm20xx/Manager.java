/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Manager extends Staff implements Exchange{
    Scanner sc = new Scanner(System.in);
    
    public Manager(String nm, String nt, Team t, int XP, int sR, int pR) {
        super(nm, nt, t, XP, sR, pR, "Managing");
        
    }
    
    @Override
    public void exchange(Team t){
        Player temp1; //temp to store player to be subbed out 
        Player temp2; // temp to store player to be subbed in
        
        System.out.println("Enter name of who you want to sub out: ");
        String subOut = sc.nextLine(); //input
        System.out.println("Enter array number of who you want to sub in: ");
        String subIn = sc.nextLine(); //input
        
        for(Player e: t.getStartingLineup()) {
            if (e.getName().equals(subOut)) {
                temp1 = e;
            }
        }
        
        for(Player e: t.getSubsLineup()) {
            if (e.getName().equals(subIn)) {
                temp2 = e;
            }
        }
        
        t.getStartingLineup().add(temp2); 
        t.getSubsLineup().add(temp1);
    }

}
