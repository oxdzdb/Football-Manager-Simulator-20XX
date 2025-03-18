/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndqtrprojectdesign_batarilan_kimwell_uy;

/**
 *
 * @author Dell
 */
public class Buy {
     public double Buy(Player p2, Team t1, Team t2, double value){
            if(t1.getFunds()>p2.getPlayerValue()){
                    value = t1.getFunds() - p2.getPlayerValue();
                    t1.getPlayerList().add(p2);
                    
                    
            }  
           
            return value;
        }
}
