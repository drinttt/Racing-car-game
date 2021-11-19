/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author v3-471g
 */
public class Enemy {
    public int x,y;
    public int speedy=2;
    
    public Enemy(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.blue);
        g2d.fillRect(x, y, 90, 105);
    }
    public void Update(){
        y+=speedy;
        if(y==850){
            y=-3600;
        }
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,90,105);
    }
}
