/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guisample.lab1;

import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author ANJIL
 */

public class eventsample implements ActionListener {
    JButton open, edit, save;
    JLabel label;

    public void setButton() {

        open = new JButton("Open");
        open.setBounds(30, 20, 200, 25);
        open.addActionListener(this);

        edit = new JButton("Edit");
        edit.setBounds(30, 60, 200, 25);
        edit.addActionListener(this);

        save = new JButton("Save");
        save.setBounds(30, 100, 200, 25);
        save.addActionListener(this);

        label = new JLabel();
        label.setBounds(30, 140, 200, 25);

        JPanel panel = new JPanel();
        panel.add(open);
        panel.add(edit);
        panel.add(save);
        panel.add(label);

        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Button is action");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == open) {
            label.setText("You clicked Open button");
        } else if (e.getSource() == save) {
            label.setText("You clicked Save button");
        } else if (e.getSource() == edit) {
            label.setText("You clicked Edit button");
        }
    }

    public static void main(String args[]) {
        eventsample num = new eventsample();
        num.setButton();
    }
}