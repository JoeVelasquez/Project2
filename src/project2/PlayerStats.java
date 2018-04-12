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
public class PlayerStats extends Player{
    Scanner input = new Scanner(System.in);
    
    private int stats[] = {10,10,10,10,10,10}; // {str[0], dex[1], con[2], intel[3], wis[4], cha[5]}
    private int statCount = 32;
    private boolean finish = false;

    public PlayerStats(String firstName, String lastName, String raceType, String classType) {
        super(firstName, lastName, raceType, classType);
    }
    
    public void setStat(int i, int statNumber){
        stats[i] = statNumber;
    }
    public int getStat(int i){
        return stats[i];
    }
    public int getStatCount(){
        return statCount;
    }
    
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
    
    public void printStats(){
        System.out.printf("%n----------Base Stats----------%nAbility Points Available: %d%n1.Strength: %d%n2.Dexterity: %d%n3.Constitution: %d%n4.Intelligence: %d%n5.Wisdom: %d%n6.Charisma: %d%n", getStatCount(), getStat(0), getStat(1), getStat(2), getStat(3), getStat(4), getStat(5));
    }
    
    public void allocateAbilityPoints(){
        System.out.printf("This is a 32 point buy system for ability stats.%n1:1 Ratio from 10 to 14%n1:2 Ratio from 15-16%n1:3 Ratio from 17-18%n1:4 Ratio from 19-20");
        printStats();
        do{
            System.out.println("Select a Stat: ");
            int statChoice = input.nextInt();
            System.out.println("Increase(1) or Decrease(2)? ");
            int statIncDec = input.nextInt();
            System.out.println("How many times? ");
            int statMulti = input.nextInt();
            
            switch(statChoice){
                case 1 : if(statIncDec == 1){
                        for(int i = 0; i < statMulti; i++){
                            increaseStat(0);
                        }
                    }
                    else if(statIncDec == 2){
                        for(int i = 0; i < statMulti; i++){
                            decreaseStat(0);
                        }
                    }
                    else{
                        System.out.println("Invalid input please use 1 or 2 to select!");
                    }
                    break;
                case 2 : if(statIncDec == 1){
                        for(int i = 0; i < statMulti; i++){
                            increaseStat(1);
                        }
                    }
                    else if(statIncDec == 2){
                        for(int i = 0; i < statMulti; i++){
                            decreaseStat(1);
                        }
                    }
                    else{
                        System.out.println("Invalid input please use 1 or 2 to select!");
                    }
                    break;
                case 3 : if(statIncDec == 1){
                        for(int i = 0; i < statMulti; i++){
                            increaseStat(2);
                        }
                    }
                    else if(statIncDec == 2){
                        for(int i = 0; i < statMulti; i++){
                            decreaseStat(2);
                        }
                    }
                    else{
                        System.out.println("Invalid input please use 1 or 2 to select!");
                    }
                    break;
                case 4 : if(statIncDec == 1){
                        for(int i = 0; i < statMulti; i++){
                            increaseStat(3);
                        }
                    }
                    else if(statIncDec == 2){
                        for(int i = 0; i < statMulti; i++){
                            decreaseStat(3);
                        }
                    }
                    else{
                        System.out.println("Invalid input please use 1 or 2 to select!");
                    }
                    break;
                case 5 : if(statIncDec == 1){
                        for(int i = 0; i < statMulti; i++){
                            increaseStat(4);
                        }
                    }
                    else if(statIncDec == 2){
                        for(int i = 0; i < statMulti; i++){
                            decreaseStat(4);
                        }
                    }
                    else{
                        System.out.println("Invalid input please use 1 or 2 to select!");
                    }
                    break;
                case 6 : if(statIncDec == 1){
                        for(int i = 0; i < statMulti; i++){
                            increaseStat(5);
                        }
                    }
                    else if(statIncDec == 2){
                        for(int i = 0; i < statMulti; i++){
                            decreaseStat(5);
                        }
                    }
                    else{
                        System.out.println("Invalid input please use 1 or 2 to select!");
                    }
                    break;        
            }
        
            printStats();
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
