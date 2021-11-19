/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing_game;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.LinkedList;

/**
 *
 * @author v3-471g
 */
public class ControlEnemy {
    static LinkedList<Enemy> e = new LinkedList<>();
    Enemy temp;
    
    public ControlEnemy(){
        addEnemy(new Enemy(140,-10));
        addEnemy(new Enemy(290,-500));
        addEnemy(new Enemy(440,-50));
        addEnemy(new Enemy(140,-1000));
        addEnemy(new Enemy(290,-1200));
        addEnemy(new Enemy(440,-1700));
        addEnemy(new Enemy(140,-2000));
        addEnemy(new Enemy(290,-2500));
        addEnemy(new Enemy(440,-3000));
        addEnemy(new Enemy(290,-3500));
        addEnemy(new Enemy(140,-3600));
    }
    
    public void draw(Graphics2D g2d){
        for(int i=0;i<e.size();i++){
            temp = e.get(i);
            temp.draw(g2d);
        }
    }
    public void Update(){
        for(int i=0;i<e.size();i++){
            temp=e.get(i);
            temp.Update();
        }
    }
    public void addEnemy(Enemy enemy){
        e.add(enemy);
    } 
    
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }
    
    public static LinkedList<Enemy> getEnemyBounds(){
        return e;
    }
}
