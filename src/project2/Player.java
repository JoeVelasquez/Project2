/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Joe
 */
public class Player {
    private String firstName;
    private String lastName;
    private String raceType;
    private String classType;
    private int str;
    private int dex;
    private int con;
    private int intel;
    private int wis;
    private int cha;
    
    public Player(String firstName, String lastName, String raceType, String classType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.raceType = raceType;
        this.classType = classType;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setRaceType(String raceType){
        this.raceType = raceType;
    }
    
    public void setStr(int str){
        this.str = str;
    }
    
    public void setDex(int dex){
        this.dex = dex;
    }
    
    public void setCon(int con){
        this.con = con;
    }
    
    public void setIntel(int intel){
        this.intel = intel;
    }
    
    public void setWis(int wis){
        this.wis = wis;
    }
    
    public void setCha(int cha){
        this.cha = cha;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getRaceType(){
        return raceType;
    }
    
    public int getStr(){
        return str;
    }
    
    public int getDex(){
        return dex;
    }
    
    public int getCon(){
        return con;
    }
    
    public int getIntel(){
        return intel;
    }
    
    public int getWis(){
        return wis;
    }
    
    public int getCha(){
        return cha;
    }
}
