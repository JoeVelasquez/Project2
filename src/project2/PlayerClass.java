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
public class PlayerClass extends PlayerRace{
    
    //Declaring Variables
    private int classChoice;
    private boolean test = false;
    
    //PlayerClass Constructor
    public PlayerClass(String firstName, String lastName) {
        super(firstName, lastName);
    }
    
    public void selectClassType(){
        while(!test){
            try{
                System.out.println("What class would you like to play?");
                System.out.printf("%n1. Warrior%n    Hit Die: d12%n    Primary Ability: Strength%n    Saves: Strength & Constitution%n%n2. Bard%n    Hit Die: d8%n    Primary Ability: Charisma%n    Saves: Dexterity & Charisma%n%n3. Cleric%n    Hit Die: d8%n    Primary Ability: Wisdom%n    Saves: Wisdom & Charisma%n%n4. Druid%n    Hit Die: d8%n    Primary Ability: Wisdom%n    Saves: Intelligence & Wisdom%n%n5. Fighter%n    Hit Die: d10%n    Primary Ability: Strength or Dexterity%n    Saves: Strength & Constitution%n%n6. Monk%n    Hit Die: d8%n    Primary Ability: Dexterity & Wisdom%n    Saves: Strength & Dexterity%n%n7. Paladin%n    Hit Die: d10%n    Primary Ability: Strength & Charisma%n    Saves: Wisdom & Charisma%n%n8. Ranger%n    Hit Die: d10%n    Primary Ability: Dexterity & Wisdom%n    Saves: Strength & Dexterity%n%n9. Rogue%n    Hit Die: d8%n    Primary Ability: Dexterity%n    Saves: Dexterity & Intelligence%n%n10. Sorcerer%n    Hit Die: d6%n    Primary Ability: Charisma%n    Saves: Constitution & Charisma%n%n11. Warlock%n    Hit Die: d8%n    Primary Ability: Charisma%n    Saves: Wisdom & Charisma%n%n12. Wizard%n   Hit Die: d6%n    Primary Ability: Intelligence%n    Saves: Intelligence & Wisdom");
                System.out.println("Select a from 1-12: ");
                classChoice = input.nextInt();
                if(classChoice < 0){
                    throw new IllegalArgumentException("Enter Positive Number!");
                }
                else if(classChoice > 11){
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
        
        switch(classChoice){
            case 1 : this.setClassType("Barbarian");
                    this.setMaxHitPoints(12+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
                    
            case 2 : this.setClassType("Bard");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
            
            case 3 : this.setClassType("Cleric");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
            
            case 4 : this.setClassType("Druid");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
            
            case 5 : this.setClassType("Fighter");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
                    
            case 6 : this.setClassType("Monk");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
                    
            case 7 : this.setClassType("Paladin");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
                    
            case 8 : this.setClassType("Ranger");
                    this.setMaxHitPoints(10+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
                    
            case 9 : this.setClassType("Rogue");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
                    
            case 10 : this.setClassType("Sorcerer");
                    this.setMaxHitPoints(6+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
             
            case 11 : this.setClassType("Warlock");
                    this.setMaxHitPoints(8+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
                    
            case 12 : this.setClassType("Wizard");
                    this.setMaxHitPoints(6+getConMod());
                    this.setHitPoints(getMaxHitPoints());
                    this.setBaseAtkBonus(2);
                    break;
        }
    }  
}
