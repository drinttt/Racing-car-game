/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing_game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
/**
 *
 * @author v3-471g
 */
public class AllGame1 extends JFrame implements ActionListener {
    homeStart homeGame1 = new homeStart();
    Playing gamef = new Playing();
    
    public AllGame1(){
        this.setSize(700, 700);
	this.add(homeGame1);
        homeGame1.btStart.addActionListener(this);
        homeGame1.btExit1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //select Start Botton
        if(e.getSource()== homeGame1.btStart){
            this.setLocationRelativeTo(null);
            this.remove(homeGame1);
            JFrame frame = new CarFrame();
            frame.setSize(700, 700);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
        //Exit Game
        else if(e.getSource() == homeGame1.btExit1){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        JFrame jf = new AllGame1();
        jf.setSize(700,700);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
    
}
