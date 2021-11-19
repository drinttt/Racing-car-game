/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing_game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author v3-471g
 */
public class Frameover extends JFrame {
    public static void main(String[] args) {
        JFrame frame2 = new Frameover();
        frame2.setSize(700, 700);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    }
}
class CarFrame2 extends JFrame{
    public CarFrame2() {
        add(new CarFrame2.GameArea2());
    }
    public static class GameArea2 extends JPanel{
        URL BackgroundURL = this.getClass().getResource("image/bgover.jpg");
        Image bgover = new ImageIcon(BackgroundURL).getImage();
        
        
        public GameArea2() {
            setFocusable(true);
        }
        
        
        
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(bgover, 0, 0, this.getWidth(), this.getHeight(), this);
            
        }
        public void actionPerformed(ActionEvent arg0) {
            repaint();
        }
        
        class Listener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                // call paintComponent
                repaint();
                
            }
        }
    }
}
