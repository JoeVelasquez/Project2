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
        
        //Askin the user for first name
        System.out.println("Enter your character's first name: ");
        String firstName = input.nextLine();
        
        //Asking the user for last name
        System.out.println("Enter your characeter's last name: ");
        String lastName = input.nextLine();
        
        //Asking the user for characters race
        System.out.println("Enter your characeter's race: ");
        String raceType = input.nextLine();
        
        //asking the user for characters class
        System.out.println("Enter your characeter's class: ");
        String classType = input.nextLine();
        
        //creating the players character object
        PlayerStats p1 = new PlayerStats(firstName, lastName, raceType, classType);
        
        //calls the function to allocate ability points for the character
        p1.allocateAbilityPoints();
        
        
        
        
    }
    
}
