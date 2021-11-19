/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing_game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author v3-471g
 */
public class KeyInput extends KeyAdapter{
    Player p;

    public KeyInput(Player p) {
        this.p = p;
    }



    @Override  //กดค้าง
    public void keyPressed(KeyEvent e) {
        p.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        p.keyReleased(e);
    }    
}
