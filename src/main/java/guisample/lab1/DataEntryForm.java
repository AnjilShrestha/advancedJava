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
import java.awt.event.*;
public class DataEntryForm implements ActionListener{
    JLabel lblname,lbladdress,lbllevel;
    JTextField txtname,txtaddress,txtlevel;
    JButton btnregister;
    JPanel panel;
    JFrame frame;
    void createform(){
        lblname=new JLabel("Name:");
        lbladdress=new JLabel("Address:");
        lbllevel=new JLabel("Level");
        
        txtname=new JTextField();
        txtaddress=new JTextField();
        txtlevel=new JTextField();
        
        btnregister=new JButton("Register");
        btnregister.addActionListener(this);
        
        lblname.setBounds(10,20,80,35);
        lbladdress.setBounds(10,60,80,35);
        lbllevel.setBounds(10,100,80,35);
        txtname.setBounds(100,20,160,35);
        txtaddress.setBounds(100,60,160,35);
        txtlevel.setBounds(100,100,160,35);
        btnregister.setBounds(100,150,100,35);
        
        panel=new JPanel();
        panel.setLayout(null);
        panel.add(lblname);
        panel.add(lbladdress);
        panel.add(lbllevel);
        panel.add(txtname);
        panel.add(txtaddress);
        panel.add(txtlevel);
        panel.add(btnregister);
        
        frame=new JFrame("data entry form");
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnregister)){
            JOptionPane.showMessageDialog(frame, "Information is recorded");
        }
    }
    public static void main(String args[]){
        DataEntryForm form=new DataEntryForm();
        form.createform();
    }
}
