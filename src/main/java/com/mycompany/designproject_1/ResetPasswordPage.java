
package com.mycompany.designproject_1;


import javax.swing.*;

public class ResetPasswordPage extends JFrame {
    public ResetPasswordPage() {
        setTitle("Reset Password Page");
        setSize(400, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel label = new JLabel("Enter New Password:");
        label.setBounds(100, 50, 200, 25);
        panel.add(label);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 80, 180, 25);
        panel.add(pass);

        JButton submit = new JButton("Submit");
        submit.setBounds(140, 120, 100, 30);
        panel.add(submit);
    }
}
