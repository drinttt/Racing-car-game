/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author v3-471g
 */
public class Player extends JFrame{
    Playing gamef = new Playing();
    Frameover over = new Frameover();
    
    private int x;
    private int y;
    private int speedx = 0;
    private int speedy = 0;
    private int chon=0;
    public int score=0;
    private LinkedList<Enemy>e = ControlEnemy.getEnemyBounds();

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Player() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //จัดการการเคลื่อนที่
    public void Update(){
        x+=speedx;
        y+=speedy;
        if(x<140){
            x=140;        
        }
        if(x>460){
            x=460;
        }
        coiision();
    }
    //สี่เหลี่ยม
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.red);
        g2d.fillRect(x, y, 90, 105);
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            speedx=5;
        }
        if(key==KeyEvent.VK_LEFT){
            speedx=-5;
        }
        if(key==KeyEvent.VK_UP){
            speedy=0;
        }
        if(key==KeyEvent.VK_DOWN){
            speedy=0;
        }
    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            speedx=0;
        }
        if(key==KeyEvent.VK_LEFT){
            speedx=0;
        }
        if(key==KeyEvent.VK_UP){
            speedy=0;
        }
        if(key==KeyEvent.VK_DOWN){
            speedy=0;
        }
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,90,105);
    }
    
    public void coiision(){
        for (int i = 0; i < e.size(); i++) {
            if(getBounds().intersects(e.get(i).getBounds())){
                chon+=1;
                if(chon==1){
                    break;
                }
            }
            else if(chon==0){
                score+=1;
            }
            if(chon==1){
                this.remove(gamef);
                
                JFrame frame2 = new CarFrame2();
                frame2.setSize(700, 700);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setLocationRelativeTo(null);
                frame2.setVisible(true);
            }
        }
    }
    
    public int Score(){
        return score;
    }
}
