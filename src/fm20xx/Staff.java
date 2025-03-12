/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fm20xx;

/**
 *
 * @author oxdzdb
 */
public class Staff extends Person{
    private String specialty;
    
    public Staff(String nm, String nt, Team t, int XP, int sR, int pR, String s) {
        super(nm, nt, t, XP, sR, pR);
        this.specialty = s;
    }
    
    //getters and setters
    public String getSpecialty(){
        return specialty;
    }
}
