/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guisample.lab1;

/**
 *
 * @author ANJIL
 */
import javax.swing.JFrame;
public class Font {
    public static void main(String args[]){
        JFrame frame=new JFrame("Font Styles");
        frame.add(new FontExample());
        frame.setSize(480,150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
