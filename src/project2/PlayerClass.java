/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.InputMismatchException;

/**
 *
 * @author Joe
 */
public class PlayerClass extends PlayerRace implements Melee, Magic, Range{
    
    //Declaring Variables
    //private int classChoice;
    private int weaponChoice;
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
                    selectWeapon();
                    break;
                    
            case 2 : this.setClassType("Bard");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectWeapon();
                    break;
            
            case 3 : this.setClassType("Cleric");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectWeapon();
                    break;
            
            case 4 : this.setClassType("Druid");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectWeapon();
                    break;
            
            case 5 : this.setClassType("Fighter");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectWeapon();
                    break;
                    
            case 6 : this.setClassType("Monk");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectWeapon();
                    break;
                    
            case 7 : this.setClassType("Paladin");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectWeapon();
                    break;
                    
            case 8 : this.setClassType("Ranger");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectRangeWeapon();
                    break;
                    
            case 9 : this.setClassType("Rogue");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectWeapon();
                    break;
                    
            case 10 : this.setClassType("Sorcerer");
                    this.setMaxHitPoints(6+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectWeapon();
                    break;
             
            case 11 : this.setClassType("Warlock");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectWeapon();
                    break;
                    
            case 12 : this.setClassType("Wizard");
                    this.setMaxHitPoints(6+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    test = false;
                    selectWeapon();
                    break;
        }
        
    }  

    @Override
    public void selectWeapon() {
        while(!test){
            System.out.println("What type of weapon would you like to select?");
            if(classChoice == 2 || classChoice == 4 || classChoice == 9 || classChoice == 10 || classChoice == 11 || classChoice == 12){
                try{
                    System.out.printf("%n----------%nSimple Melee%n---------%n1. Club         1d4 bludgeoning%n2. Dagger   1d4 piercing%n3. Greatclub   1d8 bludgeoning%n4. Handaxe   1d6 slashing%n5. Javelin   1d6 piercing%n6. Light Hammer   1d4 bludgeoning%n7. Mace   1d6 bludgeoning%n8. Quarterstaff   1d6 bludgeoning%n9. Sickle   1d4 slashing%n10. Spear   1d6 piercing%n");
                    System.out.println("Select a weapon from 1-10: ");
                    weaponChoice = input.nextInt();
                    if(weaponChoice < 0){
                        throw new IllegalArgumentException("Enter Positive Number!");
                    }
                    else if(weaponChoice > 10){
                        throw new IllegalArgumentException("Enter a number from 1-11!!!");
                    }
                
                    //exit the loop when selection is completed
                    test = true;
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                catch(InputMismatchException e){
                    System.err.printf("%nException: %s%n", e);
                    input.nextLine();
                    System.out.printf("You must enter an integer. Please try again.%n%n");            
                }
            }
            else if(classChoice == 1 || classChoice == 3 || classChoice == 5 || classChoice == 6 || classChoice == 7){
                try{
                    System.out.printf("%n---------------------------------%n          Martial Melee%n---------------------------------%n1. Battleaxe     1d8  slashing%n2. Fail          1d8  bludgeoning%n3. Glaive        1d10 slashing%n4. Greataxe      1d12 slashing%n5. Greatsword    2d6  slashing%n6. Halberd       1d10 slashing%n7. Lance         1d12 piercing%n8. Longsword     1d8  slashing%n9. Maul         2d6  bludgeoning%n10. Morningstar  1d8  piercing%n11. Pike         1d10 piercing%n12. Rapier       1d8  piercing%n13. Scimitar     1d6  slashing%n14. Shortsword   1d6  piercing%n15. Trident      1d6  piercing%n16. War Pick     1d8  piercing%n17. Warhammer    1d8  bludgeoning%n18. Whip         1d4  slashing%n");
                    System.out.println("Select a weapon from 1-19: ");
                    weaponChoice = input.nextInt();
                    if(weaponChoice < 0){
                        throw new IllegalArgumentException("Enter Positive Number!");
                    }
                    else if(weaponChoice > 18){
                        throw new IllegalArgumentException("Enter a number from 1-11!!!");
                    }
                
                    //exit the loop when selection is completed
                    test = true;
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                catch(InputMismatchException e){
                    System.err.printf("%nException: %s%n", e);
                    input.nextLine();
                    System.out.printf("You must enter an integer. Please try again.%n%n");            
                }
            }
        }
    }
    
    @Override
    public void selectRangeWeapon() {
        while(!test){
            System.out.println("What type of weapon would you like to select?");
            if(classChoice == 2 || classChoice == 4 || classChoice == 9 || classChoice == 10 || classChoice == 11 || classChoice == 12){
                try{
                    System.out.printf("%n----------%nMartial Ranged%n---------%n1. Blowgun         1 piercing%n2. Hand Crossbow   1d6 piercing%n3. Heavy Crossbow   1d10 piercing%n4. Longbow   1d8 piercing%n");
                    System.out.println("Select a weapon from 1-4: ");
                    weaponChoice = input.nextInt();
                    if(weaponChoice < 0){
                        throw new IllegalArgumentException("Enter Positive Number!");
                    }
                    else if(weaponChoice > 4){
                        throw new IllegalArgumentException("Enter a number from 1-4!!!");
                    }
                
                    //exit the loop when selection is completed
                    test = true;
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                catch(InputMismatchException e){
                    System.err.printf("%nException: %s%n", e);
                    input.nextLine();
                    System.out.printf("You must enter an integer. Please try again.%n%n");            
                }
            }
        }
    }

    @Override
    public void RangeWeaponAtk() {
        switch(weaponChoice){
            case 1: atkDamage = 1+getDexMod();
                    decreaseAmmoCount();
                    break;
            case 2: atkDamage = rollD6()+getDexMod();
                    decreaseAmmoCount();
                    break;
            case 3: atkDamage = rollD10()+getDexMod();
                    decreaseAmmoCount();
                    break;
            case 4: atkDamage = rollD8()+getDexMod();
                    decreaseAmmoCount();
                    break;
        }
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
}
