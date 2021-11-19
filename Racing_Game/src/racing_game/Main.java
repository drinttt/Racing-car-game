/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing_game;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author v3-471g
 */
public class Main {
    public static void main(String[] args) {
        JFrame JF = new AllGame1();
        JF.setSize(700,700);
        JF.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JF.setVisible(true);
        JF.setLocationRelativeTo(null);
    }  
}
