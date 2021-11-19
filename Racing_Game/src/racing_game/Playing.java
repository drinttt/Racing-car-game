/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package racing_game;

import java.awt.*;
import java.net.URL;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author v3-471g
 */
public class Playing extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new CarFrame();
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class CarFrame extends JFrame {
    boolean timestart = false;
    char KeyChar = 'A';
    

    public CarFrame() {
        add(new GameArea1());
    }

    

    //
    public static class GameArea1 extends JPanel implements ActionListener {
        Timer loop;
        Player player;
        ControlEnemy c;

        //keep image
        int x=290;
        int y=495;
        URL BackgroundURL = this.getClass().getResource("image/bgPlay.jpg");
        Image bg = new ImageIcon(BackgroundURL).getImage();
        
        
        public GameArea1() {
            loop = new Timer(10,this);
            loop.start();
            boolean timestart = true;
            player = new Player(290,495);
            c = new ControlEnemy(); 
            setFocusable(true);
            addKeyListener(new KeyInput(player));
        }
        //draw
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g;
            g.drawImage(bg, 0, 0, this.getWidth(), this.getHeight(), this);
            player.draw(g2d);
            c.draw(g2d);
            g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,30));
            g.setColor(Color.white);
            g.drawString("SCORE =  "+player.Score(),10, 50);	
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            player.Update();
            c.Update();
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