/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing_game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author v3-471g
 */
public class homeStart extends JPanel {
    private ImageIcon bghome = new ImageIcon(this.getClass().getResource("image/bghome1.jpg"));
    private ImageIcon start = new ImageIcon(this.getClass().getResource("image/btStart.jpg"));
    private ImageIcon exit = new ImageIcon(this.getClass().getResource("image/btExit.jpg"));
    public JButton btStart = new JButton(start);
    public JButton btExit1 = new JButton(exit);

    public homeStart() {
        setLayout(null);
        add(btStart);
        add(btExit1);
        btStart.setBounds(500, 230, 90, 50);
        btExit1.setBounds(510, 300, 80, 40);
        add(btStart);
    }
    
    public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(bghome.getImage(),0,0,700,700,this);
            g.setColor(Color.BLACK);
            g.setFont(new Font("2005_iannnnnTKO",Font.CENTER_BASELINE,90));
	}
}
