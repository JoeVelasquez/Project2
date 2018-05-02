
package project2;

import java.util.InputMismatchException;

public class PlayerClass extends PlayerRace implements Melee, Magic, Range{
    
    //Declaring Variables
    //private int classChoice;
    private String weaponChoice;
    private boolean test = false;
    private int atkDamage = 0;
    private int ammoCount = 100;
    
    //PlayerClass Constructor
    public PlayerClass(String firstName, String lastName) {
        super(firstName, lastName);
    }
    
    public void selectClassType(int classChoice){
    
        switch(classChoice){
            case 1 : this.setClassType("Barbarian");
                    this.setMaxHitPoints(12+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Bardiche";
                    break;
                    
            case 2 : this.setClassType("Bard");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Rapier";
                    break;
            
            case 3 : this.setClassType("Cleric");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Mace & Shield";
                    break;
            
            case 4 : this.setClassType("Druid");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Woodland Staff";
                    break;
            
            case 5 : this.setClassType("Fighter");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Gladius & Tower Shield";
                    break;
                    
            case 6 : this.setClassType("Monk");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Cestus";
                    break;
                    
            case 7 : this.setClassType("Paladin");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Claymore";
                    break;
                    
            case 8 : this.setClassType("Ranger");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Long Bow";
                    break;
                    
            case 9 : this.setClassType("Rogue");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Dualwield Daggers";
                    break;
                    
            case 10 : this.setClassType("Sorcerer");
                    this.setMaxHitPoints(6+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Dark Staff";
                    break;
             
            case 11 : this.setClassType("Warlock");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Scepter and scroll";
                    break;
                    
            case 12 : this.setClassType("Wizard");
                    this.setMaxHitPoints(6+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    weaponChoice = "Elemental Staff";
                    break;
        }
        
    }  

    public String getWeapon() {
        return weaponChoice;
    }
    
    @Override
    public int getAmmoCount() {
        return ammoCount;
    }

    @Override
    public void setAmmoCount(int ammoCount) {
        this.ammoCount = ammoCount;
    }

    @Override
    public void decreaseAmmoCount() {
        ammoCount -= 1;
    }

    @Override
    public void increaseAmmoCount(int plusAmmoCount) {
        ammoCount += plusAmmoCount;
    }

    @Override
    public void selectWeapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void weaponAtk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void selectSpell() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void magicAtk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void selectRangeWeapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RangeWeaponAtk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
