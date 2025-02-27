/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guisample.lab1;

import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ANJIL
 */
public class WindowEventExample extends WindowAdapter{
    JFrame frame;
    public WindowEventExample(){
        frame=new JFrame("Window event");
        frame.addWindowListener(this);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }
    public static void main(String args[]){
        new WindowEventExample();
    }
    @Override
    public void windowIconified(WindowEvent e){
        JOptionPane.showMessageDialog(null,"Window Iconified");
    }
    @Override
    public void windowDeiconified(WindowEvent e){
        JOptionPane.showMessageDialog(null,"Window Deiconified");
    }
    @Override
    public void windowClosing(WindowEvent e){
        JOptionPane.showMessageDialog(null,"Window closing");
    }
    @Override
    public void windowOpened(WindowEvent e){
        JOptionPane.showMessageDialog(null,"Window Opened");
    }
}
