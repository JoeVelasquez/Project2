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
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your character's first name: ");
        String firstName = input.nextLine();
        
        System.out.println("Enter your characeter's last name: ");
        String lastName = input.nextLine();
        
        System.out.println("Enter your characeter's race: ");
        String raceType = input.nextLine();
        
        System.out.println("Enter your characeter's class: ");
        String classType = input.nextLine();
        
        PlayerStats p1 = new PlayerStats(firstName, lastName, raceType, classType);
        
        p1.allocateAbilityPoints();
        
        
        
        
    }
    
}
