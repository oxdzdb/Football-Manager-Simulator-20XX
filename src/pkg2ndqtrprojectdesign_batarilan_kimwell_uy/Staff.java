/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndqtrprojectdesign_batarilan_kimwell_uy;

/**
 *
 * @author Dell
 */
public class Staff extends Person{
    private String specialty;

    public Staff(String nm, String nt, Team t, int XP, int sR, int pR, String s) {
        super(nm, nt, t, XP, sR, pR);
        this.specialty = s;
    }
    
    /**
     * @return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }
}
