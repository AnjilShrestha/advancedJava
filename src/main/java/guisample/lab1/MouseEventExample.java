/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guisample.lab1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
/**
 *
 * @author ANJIL
 */
public class MouseEventExample implements MouseListener{
    JFrame frame;
    public MouseEventExample(){
        frame=new JFrame("Click your mouse");
        frame.addMouseListener((MouseListener) this);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
        
    }
    
   @Override
    public void mouseClicked(MouseEvent e){
        JOptionPane.showMessageDialog(null,"Mouse clicked...");
    }
    @Override
    public void mousePressed(MouseEvent e){
        Graphics g=frame.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);
                
    }
    @Override
    public void mouseReleased(MouseEvent e){
        JOptionPane.showMessageDialog(null,"Mouse released...");
    }
    public static void main(String  args[]){
        MouseEventExample me=new MouseEventExample();   
    }
    @Override
    public void mouseEntered(MouseEvent e){
    }
    @Override
    public void mouseExited(MouseEvent e){
    }
    
}
