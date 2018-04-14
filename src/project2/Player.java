/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Random;

/**
 * @author Joe
 */
public class Player {
    //Declaring Private Variables
    private String firstName;
    private String lastName;
    private String raceType;
    private String classType;
    private int playerLvl = 1;
    private int playerExp = 0;
    
    //Player Constructor
    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    //Setter Functions
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setRaceType(String raceType){
        this.raceType = raceType;
    }
    
    public void setClassType(String classType){
        this.classType = classType;
    }
    
    public void setPlayerLvl(int playerLvl){
        this.playerLvl = playerLvl;
    }
    
    public void setPlayerExp(int playerExp){
        this.playerExp = playerExp;
    }
    
    //Getter Functions
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getRaceType(){
        return this.raceType;
    }
    
    public String getClassType(){
        return this.classType;
    }
    
    public int getPlayerLvl(){
        return this.playerLvl;
    }
    
    public int getPlayerExp(){
        return this.playerExp;
    }
   
    public int rollD4(){
        //Random number generator
        Random rand = new Random();
        int roll = rand.nextInt(4) + 1;
        System.out.println("You rolled a " + roll + "!");
        return roll;
    }
    
    public int rollD6(){
        //Random number generator
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        System.out.println("You rolled a " + roll + "!");
        return roll;
    }
    
    public int rollD8(){
        //Random number generator
        Random rand = new Random();
        int roll = rand.nextInt(8) + 1;
        System.out.println("You rolled a " + roll + "!");
        return roll;
    }
    
    public int rollD10(){
        //Random number generator
        Random rand = new Random();
        int roll = rand.nextInt(10) + 1;
        System.out.println("You rolled a " + roll + "!");
        return roll;
    }
    
    public int rollD12(){
        //Random number generator
        Random rand = new Random();
        int roll = rand.nextInt(12) + 1;
        System.out.println("You rolled a " + roll + "!");
        return roll;
    }
    
    public int rollD100(){
        //Random number generator
        Random rand = new Random();
        int roll = rand.nextInt(100) + 1;
        System.out.println("You rolled a " + roll + "!");
        return roll;
    }
    
    public int rollD20(){
        //Random number generator
        Random rand = new Random();
        int roll = rand.nextInt(20) + 1;
        if(roll == 20){
            System.out.println("NAT " + roll + "!");
        }
        else if(roll == 1){
            System.out.println("You rolled a " + roll + "! Worst roll ever!");
        }
        else{
            System.out.println("You rolled a " + roll + "!");
        }
        return roll;
    }
}