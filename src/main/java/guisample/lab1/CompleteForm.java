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
import java.awt.*;

public class CompleteForm implements ActionListener {
    JLabel header,lblname,lblemail,lblnumber,lblmessage,lblcheck;
    JTextField txtname,txtemail;
    JComboBox <String> cmbnum;
    JCheckBox chkyes;
    JTextArea txtarea;
    JButton btnsubmit;
    JFrame frame;
    JPanel panel;
    String select,text;
    public void setform()
    {
        header=new JLabel("Form Demo");
        Font font=new Font("Courier",Font.BOLD,24);
        header.setFont(font);
        
        
        lblname=new JLabel("Name:");
        lblemail=new JLabel("Email:");
        lblnumber=new JLabel("Select Number:");
        lblmessage=new JLabel("Message:");
        
        txtname=new JTextField("Name");
        txtemail=new JTextField("Email");
        String s[]={"1","2","3","4","5"};
        cmbnum=new JComboBox(s);
        chkyes=new JCheckBox("Yes/No");
        txtarea=new JTextArea();
        btnsubmit=new JButton("Submit Information");
        btnsubmit.addActionListener(this);
        
        header.setBounds(200, 10, 200, 30);
        lblname.setBounds(10, 40, 100, 25);
        lblemail.setBounds(10,100,100,25);
        lblnumber.setBounds(10,160,100,25);
        lblmessage.setBounds(10,220,100,25);
        txtname.setBounds(140, 40, 100, 25);
        txtemail.setBounds(140, 100, 100, 25);
        cmbnum.setBounds(140, 160, 100, 25);
        txtarea.setBounds(140,220,100,25);
        chkyes.setBounds(10, 280, 100, 25);
        btnsubmit.setBounds(20, 350, 110, 25);
        btnsubmit.setToolTipText("Submit");
        
        frame=new JFrame("Registration Form....");
        panel=new JPanel();
        panel.setLayout(null);
        panel.add(header);
        panel.add(lblname);
        panel.add(lblemail);
        panel.add(lblnumber);
        panel.add(lblmessage);
        panel.add(txtname);
        panel.add(txtemail);
        panel.add(cmbnum);
        panel.add(txtarea);
        panel.add(chkyes);
        panel.add(btnsubmit);
        
        frame.getContentPane().add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource().equals(btnsubmit)){
            JOptionPane.showMessageDialog(frame,"Successfully Registered");
            if(chkyes.isSelected())
                select="yes";
            else
                select="no";
            text=txtarea.getText();
            newform();
        }
    }
    public void newform()
    {
        header=new JLabel("Registered Information");
        Font font=new Font("Courier",Font.BOLD,24);
        header.setFont(font);
        
        
        lblname=new JLabel("Name:");
        lblemail=new JLabel("Email:");
        lblnumber=new JLabel("Select Number:");
        lblmessage=new JLabel("Message:");
        
        JLabel lname=new JLabel();
        JLabel lemail=new JLabel();
        JLabel lnum=new JLabel();
        txtarea=new JTextArea(350,150);
        header.setBounds(80, 10, 300, 30);
        lblname.setBounds(10, 40, 300, 25);
        lblemail.setBounds(10,100,300,25);
        lblnumber.setBounds(10,160,300,25);
        lblmessage.setBounds(10,220,300,25);
        lname.setBounds(10, 70, 350, 25);
        lemail.setBounds(10, 130, 350, 25);
        lnum.setBounds(10, 190, 350, 25);
        txtarea.setBounds(10,250,350,25);
        
        lname.setText(txtname.getText());
        lemail.setText(txtemail.getText());
        lnum.setText(cmbnum.getSelectedItem().toString());
        
        txtarea.setText(text);
        txtarea.setEditable(false);
        
        lblcheck=new JLabel("Option is "+select);
        lblcheck.setBounds(10,410,100,25);
        
        panel=new JPanel();
        panel.setLayout(null);
        panel.add(header);
        panel.add(lblname);
        panel.add(lblemail);
        panel.add(lblnumber);
        panel.add(lblmessage);
        panel.add(lname);
        panel.add(lemail);
        panel.add(lnum);
        panel.add(txtarea);
        panel.add(lblcheck);
        
        frame=new JFrame("Registered Data...");
        frame.getContentPane().add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    public static void main(String args[])
    {
        CompleteForm cmb=new CompleteForm();
        cmb.setform();
    }
}
