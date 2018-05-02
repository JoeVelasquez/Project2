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

    
//Declaring variables
    private int raceChoice;
    private boolean test = false;
    
    //PlayerRace Constuctor
    public PlayerRace(String firstName, String lastName) {
        super(firstName, lastName);
    }
    
    //function for selecting Player race
    public void selectPlayerRace(int raceChoice){
             
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
