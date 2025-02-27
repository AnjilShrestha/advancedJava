/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guisample.lab1;

/**
 *
 * @author ANJIL
 */
import javax.swing.*;
public class SampleImage {
    public static void main(String args[])
    {
        ImageIcon icon=new ImageIcon("C:\\Users\\ANJIL\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-02-19 200226.png");
        JLabel label=new JLabel(icon);
        JFrame f=new JFrame("Add image to jframe");
        f.add(label);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
