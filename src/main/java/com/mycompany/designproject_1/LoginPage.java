
package com.mycompany.designproject_1;

import javax.swing.*;

public class LoginPage extends JFrame {
    public LoginPage() {
        setTitle("Login Page");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 180, 25);
        panel.add(userText);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 90, 100, 25);
        panel.add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(150, 90, 180, 25);
        panel.add(passText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(50, 140, 120, 30);
        panel.add(loginButton);

        JButton resetButton = new JButton("Reset Password");
        resetButton.setBounds(190, 140, 120, 30);
        panel.add(resetButton);
        
         JButton rButton = new JButton("Register");
        rButton.setBounds(120, 180, 120, 30);
        panel.add(rButton);
        
    }
}

