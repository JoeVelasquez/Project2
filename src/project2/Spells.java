/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 * @author Joe
 */
public class Spells extends PlayerClass{
  
    public String spelllvl0[];
    public String spelllvl1[];
    public String spelllvl2[];
    public String spelllvl3[];
    public String spelllvl4[];
    public String spelllvl5[];
    public String spelllvl6[];
    public String spelllvl7[];
    public String spelllvl8[];
    public String spelllvl9[];
    
    
    public Spells(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public void selectSpellBard(){
            this.spelllvl0 = new String[]{"","","","","",""};
            this.spelllvl1 = new String[]{"","","",""};
            this.spelllvl2 = new String[]{"","",""};
            this.spelllvl3 = new String[]{"","",""};
            this.spelllvl4 = new String[]{"","",""};
            this.spelllvl5 = new String[]{"","",""};
            this.spelllvl6 = new String[]{"",""};
            this.spelllvl7 = new String[]{"",""};
            this.spelllvl8 = new String[]{""};
            this.spelllvl9 = new String[]{""};
    }
    public void selectSpellCleric(){
            this.spelllvl0 = new String[]{"","","","","",""};
            this.spelllvl1 = new String[]{"",""," "," "};
            this.spelllvl2 = new String[]{" "," "," "};
            this.spelllvl3 = new String[]{" "," "," "};
            this.spelllvl4 = new String[]{" "," "," "};
            this.spelllvl5 = new String[]{" "," "," "};
            this.spelllvl6 = new String[]{" "," "};
            this.spelllvl7 = new String[]{" "," "};
            this.spelllvl8 = new String[]{" "};
            this.spelllvl9 = new String[]{""};
    }
    public void selectSpellDruid(){
            this.spelllvl0 = new String[]{" "," "," "," "," "," "};
            this.spelllvl1 = new String[]{" "," "," "," "};
            this.spelllvl2 = new String[]{" "," "," "};
            this.spelllvl3 = new String[]{" "," "," "};
            this.spelllvl4 = new String[]{" "," "," "};
            this.spelllvl5 = new String[]{" "," "," "};
            this.spelllvl6 = new String[]{" "," "};
            this.spelllvl7 = new String[]{" "," "};
            this.spelllvl8 = new String[]{" "};
            this.spelllvl9 = new String[]{""};
    }
    public void selectSpellPaladin(){
            this.spelllvl0 = new String[]{" "," "," "," "," "," "};
            this.spelllvl1 = new String[]{" "," "," "," "};
            this.spelllvl2 = new String[]{" "," "," "};
            this.spelllvl3 = new String[]{" "," "," "};
            this.spelllvl4 = new String[]{" "," "," "};
            this.spelllvl5 = new String[]{" "," "," "};
            this.spelllvl6 = new String[]{" "," "};
            this.spelllvl7 = new String[]{" "," "};
            this.spelllvl8 = new String[]{" "};
            this.spelllvl9 = new String[]{""};
    }
    public void selectSpellRanger(){
            this.spelllvl0 = new String[]{" "," "," "," "," "," "};
            this.spelllvl1 = new String[]{" "," "," "," "};
            this.spelllvl2 = new String[]{" "," "," "};
            this.spelllvl3 = new String[]{" "," "," "};
            this.spelllvl4 = new String[]{" "," "," "};
            this.spelllvl5 = new String[]{" "," "," "};
            this.spelllvl6 = new String[]{" "," "};
            this.spelllvl7 = new String[]{" "," "};
            this.spelllvl8 = new String[]{" "};
            this.spelllvl9 = new String[]{""};
    }
    public void selectSpellSorcerer(){
            this.spelllvl0 = new String[]{" "," "," "," "," "," "};
            this.spelllvl1 = new String[]{" "," "," "," "};
            this.spelllvl2 = new String[]{" "," "," "};
            this.spelllvl3 = new String[]{" "," "," "};
            this.spelllvl4 = new String[]{" "," "," "};
            this.spelllvl5 = new String[]{" "," "," "};
            this.spelllvl6 = new String[]{" "," "};
            this.spelllvl7 = new String[]{" "," "};
            this.spelllvl8 = new String[]{" "};
            this.spelllvl9 = new String[]{""};
    }
    public void selectSpellWarlock(){
            this.spelllvl0 = new String[]{" "," "," "," "," "," "};
            this.spelllvl1 = new String[]{" "," "," "," "};
            this.spelllvl2 = new String[]{" "," "," "};
            this.spelllvl3 = new String[]{" "," "," "};
            this.spelllvl4 = new String[]{" "," "," "};
            this.spelllvl5 = new String[]{" "," "," "};
            this.spelllvl6 = new String[]{" "," "};
            this.spelllvl7 = new String[]{" "," "};
            this.spelllvl8 = new String[]{" "};
            this.spelllvl9 = new String[]{""};
    }
    public void selectSpellWizard(){
            this.spelllvl0 = new String[]{" "," "," "," "," "," "};
            this.spelllvl1 = new String[]{" "," "," "," "};
            this.spelllvl2 = new String[]{" "," "," "};
            this.spelllvl3 = new String[]{" "," "," "};
            this.spelllvl4 = new String[]{" "," "," "};
            this.spelllvl5 = new String[]{" "," "," "};
            this.spelllvl6 = new String[]{" "," "};
            this.spelllvl7 = new String[]{" "," "};
            this.spelllvl8 = new String[]{" "};
            this.spelllvl9 = new String[]{""};
    }
}
