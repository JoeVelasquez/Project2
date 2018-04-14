/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Joe
 */
public class PlayerStats extends Player{
    //Scanner for user input
    Scanner input = new Scanner(System.in);
    
    //Declaring variables and array to hold the stats of the character
    private int stats[] = {10,10,10,10,10,10}; // {str = [0], dex = [1], con = [2], intel = [3], wis = [4], cha = [5]}
    private int statMods[] = {0,0,0,0,0,0,0}; // {strMod = [0], dexMod = [1], conMod = [2], intelMod = [3], wisMod = [4], chaMod = [5]}
    private int saves[] = {0,0,0}; // fortitude = [0], reflex = [1], will = [2];
    private int baseAtkBonus = 0;
    private int hitPoints = 0;
    private int maxHitPoints = 0;
    private int initiative = 0;
    private int armorClass = 0;
    private int statCount = 32;
    private boolean finish = false;
    private int statChoice = 0;
    private int statIncDec = 0;
    private int statMulti = 0;
    private boolean test = false;
    private int choice;
    
    //PlayerStats Constructor
    public PlayerStats(String firstName, String lastName) {
        super(firstName, lastName);
    }
    
    //setter functions
    public void setStat(int i, int statNumber){
        stats[i] = statNumber;
    }
    
    public void setStrMod(int str){
        this.statMods[0] = str;
    }
    
    public void setDexMod(int dex){
        this.statMods[1] = dex;
    }
    
    public void setConMod(int con){
        this.statMods[2] = con;
    }
    
    public void setIntMod(int intel){
        this.statMods[3] = intel;
    }
    
    public void setWisMod(int wis){
        this.statMods[4] = wis;
    }
    
    public void setChaMod(int cha){
        this.statMods[5] = cha;
    }
    
    public void setFortSave(int fort){
        this.saves[0] = fort;
    }
    
    public void setReflexSave(int reflex){
        this.saves[1] = reflex;
    }
    
    public void setWillSave(int will){
        this.saves[2] = will;
    }
    
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    
    public void setMaxHitPoints(int maxHitPoints){
        this.maxHitPoints = maxHitPoints;
    }
    
    public void setInitiative(int initiative){
        this.initiative = initiative;
    }
    
    public void setArmorClass(int armorClass){
        this.armorClass = armorClass;
    }
    
    public void setBaseAtkBonus(int baseAtkBonus){
        this.baseAtkBonus = baseAtkBonus;
    }
    
    //Function that assigns stat Modifiers
    public void setStatMod(){
        for(int i = 0; i < 6; i++){
            if(stats[i] == 10 || stats[i] == 11){
                statMods[i] = 0;
            }
            else if(stats[i] == 12 || stats[i] == 13){
                statMods[i] = 1;
            }
            else if(stats[i] == 14 || stats[i] == 15){
                statMods[i] = 2;
            }
            else if(stats[i] == 16 || stats[i] == 17){
                statMods[i] = 3;
            }
            else if(stats[i] == 18 || stats[i] == 19){
                statMods[i] = 4;
            }
            else{
                statMods[i] = 5;
            }
        }
    }
    
    //getter functions
    public int getStat(int i){
        return stats[i];
    }
    
    public int getStatCount(){
        return statCount;
    }
    
    public int getStatMod(int i){
        return statMods[i];
    }
    
    public int getStrMod(){
        return statMods[0];
    }
    
    public int getDexMod(){
        return statMods[1];
    }
    
    public int getConMod(){
        return statMods[2];
    }
    
    public int getIntMod(){
        return statMods[3];
    }
    
    public int getWisMod(){
        return statMods[4];
    }
    
    public int getChaMod(){
        return statMods[5];
    }
    
    public int getFortSave(){
        return saves[0];
    }
    
    public int getReflexSave(){
        return saves[1];
    }
    
    public int getWillSave(){
        return saves[2];
    }
    
    public int getHitPoints(){
        return this.hitPoints;
    }
    
    public int getMaxHitPoints(){
        return this.maxHitPoints;
    }
    
    public int getInitiative(){
        return this.initiative;
    }
    
    public int getArmorClass(){
        return this.armorClass;
    }
    
    public int getBaseAtkBonus(){
        return this.baseAtkBonus;
    }
  
    //Function that increases selected stat
    public void increaseStat(int i){
        int temp;
        
        if(stats[i] == 10 || stats[i] == 11 || stats[i] == 12 || stats[i] == 13){
           if(statCount > 0){ 
                temp = getStat(i)+1;
                setStat(i, temp);
                statCount--;
           }
           else{
               statMulti = 0;
               System.out.printf("%nOut of Ability Points!!");
           }
        }
        else if (stats[i] == 14 || stats[i] == 15){
            if(statCount > 1){
                temp = getStat(i)+1;
                setStat(i, temp);
                statCount -= 2;
            }
            else{
                statMulti = 0;
                System.out.printf("%nOut of Ability Points!!");
           }
        }
        else if (stats[i] == 16 || stats[i] == 17){
            if(statCount > 2){
                temp = getStat(i)+1;
                setStat(i, temp);
                statCount -= 3;
            }
            else{
                statMulti = 0;
                System.out.printf("%nOut of Ability Points!!");
           }
        }
        else if (stats[i] == 18 || stats[i] == 19){
            if(statCount > 3){
                temp = getStat(i)+1;
                setStat(i, temp);
                statCount -= 4;
            }
            else{
               statMulti = 0;
               System.out.printf("%nOut of Ability Points!!");
           }
        }
        else if (stats[i] == 20){
            statMulti = 0;
            System.out.println("The Ability is at its MAX!");
        }
        else{
            statMulti = 0;
            System.out.println("No Ability Points Avaliable!");
        }
    }
    
    //Function that decreases selected Stat
    public void decreaseStat(int i){
        int temp;
        if(this.getRaceType() == "Dragonborn"){
            if(i == 0){
                if(stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 12!");
                }
            }
            else if(i == 5){
                if(stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 11!");
                }
            }
            else{
                if(stats[i] == 11 || stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 10!");
                }
            }
        }
        else if(this.getRaceType() == "Dwarf"){
            if(i == 2){
                if(stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 12!");
                }
            }
            else{
                if(stats[i] == 11 || stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 10!");
                }
            }
        }
        else if(this.getRaceType() == "Elf"){
            if(i == 1){
                if(stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 12!");
                }
            }
            else if(i == 4){
                if(stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 11!");
                }
            }
            else{
                if(stats[i] == 11 || stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 10!");
                }
            }
        }
        else if(this.getRaceType() == "Gnome"){
            if(i == 3){
                if(stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 12!");
                }
            }
            else{
                if(stats[i] == 11 || stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 10!");
                }
            }
        }
        else if(this.getRaceType() == "Half-Elf"){
            if(i == 5){
                if(stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 12!");
                }
            }
            else{
                if(stats[i] == 11 || stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 10!");
                }
            }
        }
        else if(this.getRaceType() == "Halfling"){
            if(i == 1){
                if(stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 12!");
                }
            }
            else{
                if(stats[i] == 11 || stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 10!");
                }
            }
        }
        else if(this.getRaceType() == "Half-Orc"){
            if(i == 0){
                if(stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 12!");
                }
            }
            else if(i == 2){
                if(stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 11!");
                }
            }
            else{
                if(stats[i] == 11 || stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 10!");
                }
            }
        }
        else if(this.getRaceType() == "Human"){
            if(stats[i] == 12 ||stats[i] == 13){
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
                statMulti = 0;
                System.out.println("Can't go lower than the 11!");
            }
        }
        else if(this.getRaceType() == "Tiefling"){
            if(i == 5){
                if(stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 12!");
                }
            }
            else if(i == 3){
                if(stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 11!");
                }
            }
            else{
                if(stats[i] == 11 || stats[i] == 12 ||stats[i] == 13){
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
                    statMulti = 0;
                    System.out.println("Can't go lower than the 10!");
                }
            }
        }
    }
    
    //Print function that displays Ability stats and points
    public void printStats(){
        System.out.printf("%n%n----------Base Stats----------%n%nAbility Points Available: %d%n1.Strength: %d%n2.Dexterity: %d%n3.Constitution: %d%n4.Intelligence: %d%n5.Wisdom: %d%n6.Charisma: %d%n", getStatCount(), getStat(0), getStat(1), getStat(2), getStat(3), getStat(4), getStat(5));
    }
    
    //Print function that displays Ability Modifiers
    public void printStatMods(){
        System.out.printf("%n------------------------------------------------------------------------%nStrMod: %-2d DexMod: %-2d ConMod: %-2d IntMod: %-2d WisMod: %-2d ChaMod: %-2d%n------------------------------------------------------------------------%n", getStrMod(), getDexMod(), getConMod(), getIntMod(), getWisMod(), getChaMod());
    }
    
    //Print function that will display HitPoints, ArmorClass, and Initiative
    public void printPlayerStats(){
        System.out.printf("MaxHP: %-3d CurrentHP: %-3d AC: %-2d Init: %-2d%n------------------------------------------------------------------------%n", getMaxHitPoints(), getHitPoints(), getArmorClass(), getInitiative());
    }
    
    //standard display
    public void hud(){
        printStatMods();
        printPlayerStats();
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
                    test = true;
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                catch(InputMismatchException e){
                    System.err.printf("%nException: %s%n", e);
                    input.nextLine();
                    System.out.printf("You must enter integers.Please try again.%n%n");            
                }  
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
                    test = true;
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                catch(InputMismatchException e){
                    System.err.printf("%nException: %s%n", e);
                    input.nextLine();
                    System.out.printf("You must enter integers.Please try again.%n%n");            
                }
            }
            
            //ReInitualizing test variable for next while loop
            test = false;
            
            //while loop to test user input for how many times to increase or decrease a stat
            while(!test){
                try{
                    System.out.println("How many times? ");
                    statMulti = input.nextInt();
                    if(statMulti < 0){
                        statMulti = 0;
                        throw new IllegalArgumentException("Enter Positive Number!");
                    }
                    else if(statMulti > 10){
                        statMulti = 0;
                        throw new IllegalArgumentException("Enter a number from 1-10!!!");
                    }
                    test = true;
                }
                catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                catch(InputMismatchException e){
                    System.err.printf("%nException: %s%n", e);
                    input.nextLine();
                    System.out.printf("You must enter integers.Please try again.%n%n");            
                }
            }
            
            //ReInitualizing test variable for the start of the loop
            test = false;
            
            //switch that selects user input for Stat Choice and either they wanted to increase or Decrease the stat
            switch(statChoice){
                case 1 : switch (statIncDec) {
                        case 1:
                            for(int i = 0; i < statMulti; i++){
                                if(stats[0] == 20){
                                    break;
                                }
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
                                if(stats[1] == 20){
                                    break;
                                }
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
                                if(stats[2] == 20){
                                    break;
                                }
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
                                if(stats[3] == 20){
                                    break;
                                }
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
                                if(stats[4] == 20){
                                    break;
                                }
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
                                if(stats[5] == 20){
                                    break;
                                }
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
            input.nextLine();
            
            //ReInitializing test variable
            test = false;
           
            //if the user is out of points they will be asked if they want to finish
            if(statCount == 0){
                while(!test){
                    try{
                        System.out.println("Do you want to finish?(1: yes/2: No): ");
                        choice = input.nextInt();
                        if(choice < 0){
                            throw new IllegalArgumentException("Enter Positive Number!");
                        }
                        else if(choice > 2){
                            throw new IllegalArgumentException("Enter 1 or 2!!!"); 
                        }
                        if(choice == 1){
                            finish = true;
                        }
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
        }while(!finish);
        
        setStatMod();
        setInitiative(getDexMod());
    }
     
    public void levelUp(){
        if(getPlayerExp() >= 300){
            this.setPlayerLvl(2);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 900){
            this.setPlayerLvl(3);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
            
        }
        else if(getPlayerExp() >= 2700){
            this.setPlayerLvl(4);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(2);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 6500){
            this.setPlayerLvl(5);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 14000){
            this.setPlayerLvl(6);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 23000){
            this.setPlayerLvl(7);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 34000){
            this.setPlayerLvl(8);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(3);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 48000){
            this.setPlayerLvl(9);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 64000){
            this.setPlayerLvl(10);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 85000){
            this.setPlayerLvl(11);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 100000){
            this.setPlayerLvl(12);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(4);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 120000){
            this.setPlayerLvl(13);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 140000){
            this.setPlayerLvl(14);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 165000){
            this.setPlayerLvl(15);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 195000){
            this.setPlayerLvl(16);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 225000){
            this.setPlayerLvl(17);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 265000){
            this.setPlayerLvl(18);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 305000){
            this.setPlayerLvl(19);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else if(getPlayerExp() >= 335000){
            this.setPlayerLvl(20);
            if(null == getClassType()){
                System.out.printf("%nClass was lost!!!");
            }
            else switch (getClassType()) {
                case "Barbarian":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD12()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Bard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Cleric":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(5);
                    break;
                case "Druid":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Fighter":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Monk":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Paladin":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Ranger":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD10()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Rogue":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Sorcerer":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Warlock":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD8()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                case "Wizard":
                    this.setMaxHitPoints(getMaxHitPoints()+rollD6()+getConMod());
                    this.setBaseAtkBonus(6);
                    break;
                default:
                    System.out.printf("%nClass was lost!!!");
                    break;
            }
        }
        else{
            System.out.println("You Have reached MAX lvl!!!");
        }
    }
}
