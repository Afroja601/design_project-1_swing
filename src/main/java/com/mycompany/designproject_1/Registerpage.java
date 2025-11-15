
package com.mycompany.designproject_1;


import javax.swing.*;

public class Registerpage extends JFrame {
    public Registerpage() {
        setTitle("Register Page");
        setSize(280, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel p = new JPanel();
        p.add(new JLabel("Email:"));
        p.add(new JTextField(15));
        p.add(new JLabel("Username:"));
        p.add(new JTextField(15));
        p.add(new JLabel("Password:"));
        p.add(new JPasswordField(15));
        p.add(new JButton("Register"));
        add(p);
    }
}
