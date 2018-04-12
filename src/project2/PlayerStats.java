/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class PlayerStats extends Player{
    //Scanner for user input
    Scanner input = new Scanner(System.in);
    
    //Declaring variables and array to hold the stats of the character
    private int stats[] = {10,10,10,10,10,10}; // {str[0], dex[1], con[2], intel[3], wis[4], cha[5]}
    private int statCount = 32;
    private boolean finish = false;
    private int statChoice = 0;
    private int statIncDec = 0;
    private int statMulti = 0;
    private boolean test = false;
    
    //PlayerStats Constructor
    public PlayerStats(String firstName, String lastName, String raceType, String classType) {
        super(firstName, lastName, raceType, classType);
    }
    
    //setter functions
    public void setStat(int i, int statNumber){
        stats[i] = statNumber;
    }
    
    //getter functions
    public int getStat(int i){
        return stats[i];
    }
    
    public int getStatCount(){
        return statCount;
    }
    
    //Function that increases selected stat
    public void increaseStat(int i){
        int temp;
        
        if(stats[i] == 10 || stats[i] == 11 || stats[i] == 12 || stats[i] == 13){
            temp = getStat(i)+1;
            setStat(i, temp);
            statCount--;
        }
        else if (stats[i] == 14 || stats[i] == 15){
            temp = getStat(i)+1;
            setStat(i, temp);
            statCount -= 2;
        }
        else if (stats[i] == 16 || stats[i] == 17){
            temp = getStat(i)+1;
            setStat(i, temp);
            statCount -= 3;
        }
        else if (stats[i] == 18 || stats[i] == 19){
            temp = getStat(i)+1;
            setStat(i, temp);
            statCount -= 4;
        }
        else if (stats[i] == 20){
            System.out.println("The Ability is at its MAX!");
        }
        else{
            System.out.println("No Ability Points Avaliable!");
        }
    }
    
    //Function that decreases selected Stat
    public void decreaseStat(int i){
        int temp;
        
        if(stats[i] == 11 || stats[i] == 12 || stats[i] == 13){
            temp = getStat(i)-1;
            setStat(i, temp);
            statCount++;
        }
        else if (stats[i] == 14 || stats[i] == 15){
            temp = getStat(i)-1;
            setStat(i, temp);
            statCount += 2;
        }
        else if (stats[i] == 16 || stats[i] == 17){
            temp = getStat(i)-1;
            setStat(i, temp);
            statCount += 3;
        }
        else if (stats[i] == 18 || stats[i] == 19){
            temp = getStat(i)-1;
            setStat(i, temp);
            statCount += 4;
        }
        else{
            System.out.println("Can't go lower than the 10!");
        }
    }
    
    //Print function that displays Ability stats and points
    public void printStats(){
        System.out.printf("%n----------Base Stats----------%nAbility Points Available: %d%n1.Strength: %d%n2.Dexterity: %d%n3.Constitution: %d%n4.Intelligence: %d%n5.Wisdom: %d%n6.Charisma: %d%n", getStatCount(), getStat(0), getStat(1), getStat(2), getStat(3), getStat(4), getStat(5));
    }
    
    //Function to help allocate ability points to selected stats
    public void allocateAbilityPoints(){
        
        //lets the user know what the ratios are for buying ability points
        System.out.printf("This is a 32 point buy system for ability stats.%n1:1 Ratio from 10-14%n1:2 Ratio from 15-16%n1:3 Ratio from 17-18%n1:4 Ratio from 19-20");
        printStats();
        
        //DoWhile loop to let the user continue to increase or decrease ability points until they decide to finish
        do{
            //while loop to test user input for 6 choices
            while(!test){
                try{
                    System.out.println("Select a Stat: ");
                    statChoice = input.nextInt();
                    if(statChoice < 0){
                        throw new IllegalArgumentException("Enter Positive Number!");
                    }
                    else if(statChoice > 6){
                        throw new IllegalArgumentException("Enter a number from 1-6!!!");
                    }
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                catch(InputMismatchException e){
                    System.err.printf("%nException: %s%n", e);
                    input.nextLine();
                    System.out.printf("You must enter integers.Please try again.%n%n");            
                }
                test = true;
            }
            
            //ReInitualizing test variable
            test = false;
            
            //while loop to test user input for 2 choices
            while(!test){
                try{
                    System.out.println("Increase(1) or Decrease(2)? ");
                    statIncDec = input.nextInt();
                    if(statIncDec < 0){
                        throw new IllegalArgumentException("Enter Positive Number!");
                    }
                    else if(statIncDec > 2){
                        throw new IllegalArgumentException("Enter a 1 or 2!!!");
                    }
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                catch(InputMismatchException e){
                    System.err.printf("%nException: %s%n", e);
                    input.nextLine();
                    System.out.printf("You must enter integers.Please try again.%n%n");            
                }
                test = true;
            }
            
            //ReInitualizing test variable for next while loop
            test = false;
            
            //while loop to test user input for how many times to increase or decrease a stat
            while(!test){
                try{
                    System.out.println("How many times? ");
                    statMulti = input.nextInt();
                    if(statMulti < 0){
                        throw new IllegalArgumentException("Enter Positive Number!");
                    }
                    else if(statMulti > 10){
                        statMulti = 0;
                        throw new IllegalArgumentException("Enter a number from 1-10!!!");
                    }
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                catch(InputMismatchException e){
                    System.err.printf("%nException: %s%n", e);
                    input.nextLine();
                    System.out.printf("You must enter integers.Please try again.%n%n");            
                }
                test = true;
            }
            
            //ReInitualizing test variable for the start of the loop
            test = false;
            
            //switch that selects user input for Stat Choice and either they wanted to increase or Decrease the stat
            switch(statChoice){
                case 1 : switch (statIncDec) {
                        case 1:
                            for(int i = 0; i < statMulti; i++){
                                increaseStat(0);
                            }
                            break;
                        case 2:
                            for(int i = 0; i < statMulti; i++){
                                decreaseStat(0);
                            }
                            break;
                        default:
                            System.out.println("Invalid input please use 1 or 2 to select!");
                            break;
                        }
                    break;
                    
                case 2 : switch (statIncDec) {
                        case 1:
                            for(int i = 0; i < statMulti; i++){
                                increaseStat(1);
                            }
                            break;
                        case 2:
                            for(int i = 0; i < statMulti; i++){
                                decreaseStat(1);
                            }
                            break;
                        default:
                            System.out.println("Invalid input please use 1 or 2 to select!");
                            break;
                        }
                    break;
                    
                case 3 : switch (statIncDec) {
                        case 1:
                            for(int i = 0; i < statMulti; i++){
                                increaseStat(2);
                            }
                            break;
                        case 2:
                            for(int i = 0; i < statMulti; i++){
                                decreaseStat(2);
                            }
                            break;
                        default:
                            System.out.println("Invalid input please use 1 or 2 to select!");
                            break;
                        }
                    break;
                    
                case 4 : switch (statIncDec) {
                        case 1:
                            for(int i = 0; i < statMulti; i++){
                                increaseStat(3);
                            }
                            break;
                        case 2:
                            for(int i = 0; i < statMulti; i++){
                                decreaseStat(3);
                            }
                            break;
                        default:
                            System.out.println("Invalid input please use 1 or 2 to select!");
                             break;
                        }
                    break;
                    
                case 5 : switch (statIncDec) {
                        case 1:
                            for(int i = 0; i < statMulti; i++){
                                increaseStat(4);
                            }
                            break;
                        case 2:
                            for(int i = 0; i < statMulti; i++){
                                decreaseStat(4);
                            }
                            break;
                        default:
                            System.out.println("Invalid input please use 1 or 2 to select!");
                            break;
                        }
                    break;
                    
                case 6 : switch (statIncDec) {
                        case 1:
                            for(int i = 0; i < statMulti; i++){
                                increaseStat(5);
                            }
                            break;
                        case 2:
                            for(int i = 0; i < statMulti; i++){
                                decreaseStat(5);
                            }
                            break;
                        default:
                            System.out.println("Invalid input please use 1 or 2 to select!");
                            break;
                        }
                    break;
            }
            
            //prints out the stats
            printStats();
            
            //if the user is out of points they will be asked if they want to finish
            if(statCount <= 0){
                System.out.println("Do you want to finish?(Y/N): ");
                String choice = input.nextLine(); 
                if(choice == "YES" || choice == "yes" || choice == "y" || choice == "Yes" || choice == "YeS" || choice == "yEs" || choice == "Y"){
                    finish = true;
                }
            }
        }while(finish != true);
    }
}
