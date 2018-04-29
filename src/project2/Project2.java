/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner for user input
        Scanner input = new Scanner(System.in);
        
        PlayerGUI gui = new PlayerGUI();
                
        gui.setVisible(true);
        gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);
        
//Askin the user for first name
        //System.out.println("Enter your character's first name: ");
        //String firstName = input.nextLine();
        
        //Asking the user for last name
        //System.out.println("Enter your characeter's last name: ");
        //String lastName = input.nextLine();
        
        //creating the players character object
        //PlayerClass p1 = new PlayerClass(firstName, lastName);
        
        //calls function to select a race
        //p1.selectPlayerRace();
        
        //calls function to select a class
        //p1.selectClassType();
        
        //calls the function to allocate ability points for the character
        p1.allocateAbilityPoints();
        
        //Display HUD
        p1.hud();
    }   
}