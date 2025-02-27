/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guisample.lab1;

import javax.swing.JFrame;

/**
 *
 * @author ANJIL
 */
public class Draw {
    public static void main(String [] args){
        JFrame frame=new JFrame("Sample Shapes");
        frame.add(new Shapes());
        frame.setSize(400,250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
