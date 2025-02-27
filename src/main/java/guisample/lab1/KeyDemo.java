/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guisample.lab1;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;

/**
 *
 * @author ANJIL
 */
public  class KeyDemo implements KeyListener{
    String line1 ="";
    JTextArea txtarea;
    public void form(){
        txtarea=new JTextArea();
        txtarea.setText("Press any key on keyboard");
        txtarea.setEnabled(true);
        txtarea.setBackground(Color.BLUE);
        txtarea.setFont(new Font("Arial",Font.BOLD,14));
        JFrame frame=new JFrame("KeyEvent example");
        frame.add(txtarea);
        frame.addKeyListener(this);
        
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
                      
    }
    
    public void KeyTyped(KeyEvent e){
        line1=e.getKeyChar()+"KeyTyped:";
        setLine(e);
    }
    public void KeyPressed(KeyEvent e){
        line1="KeyPressed:"+e.getKeyChar();
        setLine(e);
    }
    public void KeyReleased(KeyEvent e){
        line1="KeyReleased:"+e.getKeyChar();
        setLine(e);
    }
    public void setLine(KeyEvent e){
        txtarea.setText(String.format(line1));
    }
    public static void main(String args[]){
        KeyDemo f=new KeyDemo();
        f.form();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
