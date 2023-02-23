package com.company;

import javax.swing.*;
import java.awt.*;

public class A extends JPanel{
    public  JFrame jFrame;
    public  JLabel label;
    public  JTextField jTextField;
    public  JButton jButton;

     A(){


        jFrame = new JFrame();
        jFrame.setTitle("Ako");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(800,500);
        jFrame.setLayout(new BorderLayout(10,10));
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
         jFrame.add(this,BorderLayout.CENTER);

        this.setVisible(true);

        label = new JLabel("Enter your Name");
        label.setVisible(true);

        jTextField = new JTextField(20);
        jTextField.setVisible(true);
        jTextField.setBackground(Color.BLACK);

        jButton = new JButton("Save");
        jButton.setVisible(true);


        this.add(jButton);
        this.add(jTextField);
        this.add(label);




        this.paintComponent(this.getGraphics());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("d");
    }
}
