/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndqtrprojectdesign_batarilan_kimwell_uy;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Manager extends Staff {
    Scanner sc = new Scanner(System.in);
    
    public Manager(String nm, String nt, Team t, int XP, int sR, int pR) {
        super(nm, nt, t, XP, sR, pR, "Managing");
        
    }
    
    public void SwapPlayers(Team t){
        Player temp1; //temp to store player to be subbed out 
        Player temp2; // temp to store player to be subbed in
        
        System.out.println("Enter array number of who do you want to Sub out?");
        int subOut = sc.nextInt(); //input
        System.out.println("Enter array number of who do you want to Sub in?");
        int subIn = sc.nextInt(); //input
        temp1 = t.getStartingLineup().get(subOut); //variable assignment of temp1
        temp2 = t.getSubsLineup().get(subIn); //variable assignment of temp2
        t.getStartingLineup().set(subOut, temp2); //using the built in (ata) set function of java, this switches the Player info of subOut and temp2 
        t.getSubsLineup().set(subIn, temp1);//using the built in (ata) set function of java, this switches the Player info of subIn and temp1
    }
}
