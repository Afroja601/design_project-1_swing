package com.mycompany.designproject_1;


import javax.swing.*;

public class AdminNotification extends JFrame {
    public AdminNotification() {
        setTitle("Notification Page");
        setSize(500, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);
        
        
        JLabel userLabel = new JLabel("Notification:");
        userLabel.setBounds(50, 50, 100, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 180, 25);
        panel.add(userText);
        
        JButton editDetails = new JButton("Send");
        editDetails.setBounds(200,90, 70, 30);
        panel.add(editDetails);

        JLabel title = new JLabel("Notification");
        title.setBounds(200, 20, 150, 25);
        panel.add(title);
        
        

        JTable notificationTable = new JTable(15, 2);
        JScrollPane scroll = new JScrollPane(notificationTable);
        scroll.setBounds(50, 150, 400, 220);
        panel.add(scroll);

      
    }
}
