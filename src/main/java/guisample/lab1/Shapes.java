/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guisample.lab1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author ANJIL
 */
public class Shapes extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g); 
    }
    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.drawLine(5, 30, 380, 30);
        
        g.setColor(Color.BLUE);
        g.drawRect(5,40,90,55);
        
        g.setColor(Color.GREEN);
        g.drawOval(195,50,90,55);
        g.fillOval(280, 40, 70, 55);
        
        g.setColor(Color.CYAN);
        g.fillOval(5, 100, 90, 90);
    }
}
