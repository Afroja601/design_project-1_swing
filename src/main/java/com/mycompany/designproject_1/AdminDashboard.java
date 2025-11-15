
package com.mycompany.designproject_1;

import javax.swing.*;

public class AdminDashboard extends JFrame {
    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(700, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel title = new JLabel("Welcome to ULAB Club Manegment System (Admin)");
        title.setBounds(220, 20, 300, 25);
        panel.add(title);

        JButton approve = new JButton("View Members");
        approve.setBounds(50, 70, 180, 30);
        panel.add(approve);

        JButton decline = new JButton("Member Approvaal");
        decline.setBounds(250, 70, 180, 30);
        panel.add(decline);

        JButton createEvent = new JButton("Event Manegment");
        createEvent.setBounds(450, 70, 180, 30);
        panel.add(createEvent);

        JButton editEvent = new JButton("Send Notification");
        editEvent.setBounds(130, 120, 180, 30);
        panel.add(editEvent);

        JButton sendNotification = new JButton("Club Data");
        sendNotification.setBounds(330, 120, 180, 30);
        panel.add(sendNotification);

     

     
    }
}
