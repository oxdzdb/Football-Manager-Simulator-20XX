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
        // fixed Exchange here
    }

}
