/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

//import java.util.Scanner;

import java.util.InputMismatchException;


/**
 *
 * @author Joe
 */
public class PlayerRace extends PlayerStats {
    //Scanner to select user input
    //Scanner input = new Scanner(System.in);
    
//Declaring variables
    private int raceChoice;
    private boolean test = false;
    
    //PlayerRace Constuctor
    public PlayerRace(String firstName, String lastName) {
        super(firstName, lastName);
    }
    
    //function for selecting Player race
    public void selectPlayerRace(int raceChoice){
        
/*        //while loop to validate user input
        while(!test){
            
            //asks the user to select a race
            System.out.printf("%nWhat race would you like to play?");
            
            //try and catch block to validate user input
            try{
                System.out.printf("%n1. Dragonborn%n    +2 Strength%n    +1 Charisma%n%n2. Dwarf%n    +2 Constitution%n%n3. Elf%n    +2 Dexterity%n    +1 Wisdom%n%n4. Gnome%n    +2 Intelligence%n%n5. Half-Elf%n    +2 Charisma%n%n6. Halfling%n    +2 Dexterity%n%n7. Half-Orc%n    +2 Strength%n    +1 Constitution%n%n8. Human%n    +1 to All Ability Scores%n%n9. Tiefling%n    +2 Charisma%n    +1 Intelligence%n");
                System.out.println("Select a race by entering a number from 1-9:");
                raceChoice = input.nextInt();
                if(raceChoice < 0){
                    throw new IllegalArgumentException("Enter Positive Number!");
                }
                else if(raceChoice > 9){
                    throw new IllegalArgumentException("Enter a number from 1-9!!!");
                }
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            catch(InputMismatchException e){
                System.err.printf("%nException: %s%n", e);
                input.nextLine();
                System.out.printf("You must enter an integer. Please try again.%n%n");            
            }
            //exit the loop when selection is completed
            test = true;
        }
*/      
        //Switch statement to set race and stats
        switch(raceChoice){
            case 1 : this.setRaceType("Dragonborn");
                    this.setStat(0, 12);
                    this.setStat(5, 11);
                    break;

            case 2 : this.setRaceType("Dwarf");
                    this.setStat(2, 12);
                    break;

            case 3 : this.setRaceType("Elf");
                    this.setStat(1, 12);
                    this.setStat(4, 11);
                    break;

            case 4 : this.setRaceType("Gnome");
                    this.setStat(3, 12);
                    break;

            case 5 : this.setRaceType("Half-Elf");
                    this.setStat(5, 12);
                    break;

            case 6 : this.setRaceType("Halfling");
                    this.setStat(1, 12);
                    break;

            case 7 : this.setRaceType("Half-Orc");
                    this.setStat(0, 12);
                    this.setStat(2, 11);
                    break;

            case 8 : this.setRaceType("Human");
                    this.setStat(0, 11);
                    this.setStat(1, 11);
                    this.setStat(2, 11);
                    this.setStat(3, 11);
                    this.setStat(4, 11);
                    this.setStat(5, 11);
                    break;

            case 9 : this.setRaceType("Tiefling");
                    this.setStat(5, 12);
                    this.setStat(3, 11);
                    break;
        }
        
    }
    
}
