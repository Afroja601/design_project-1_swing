package com.mycompany.designproject_1;


import javax.swing.*;

public class MemberProgress extends JFrame {
    public MemberProgress() {
        setTitle("Reset Password Page");
        setSize(400, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel label = new JLabel("Total Progress points:");
        label.setBounds(100, 50, 200, 25);
        panel.add(label);
    }
   
}