/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndqtrprojectdesign_batarilan_kimwell_uy;

import java.util.function.Predicate;

/**
 *
 * @author Dell
 */
public class Sell {
     public double Sell(Player p1, Team t1, Team t2, double value){
            if(t2.getFunds()>p1.getPlayerValue()){
                    value = t2.getFunds() - p1.getPlayerValue();
                    t2.getPlayerList().add(p1);
                    t1.getPlayerList().removeIf((Predicate<? super Player>) p1);
                    
            }  
           
            return value;
        }
}
