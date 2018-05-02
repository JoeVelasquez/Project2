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
               
        PlayerGUI gui = new PlayerGUI();
                
        gui.setVisible(true);
        gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);
    }   
}