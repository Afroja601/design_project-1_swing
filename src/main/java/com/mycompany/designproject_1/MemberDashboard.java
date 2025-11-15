
package com.mycompany.designproject_1;

import javax.swing.*;

public class MemberDashboard extends JFrame {
    public MemberDashboard() {
    setTitle("Admin Dashboard");
        setSize(900, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel title = new JLabel("Welcome to ULAB Club Manegment System");
        title.setBounds(360, 20, 250, 50);
        panel.add(title);

        JButton approve = new JButton("View Club");
        approve.setBounds(50, 90, 180, 30);
        panel.add(approve);

        JButton decline = new JButton("Upcoming Events");
        decline.setBounds(250, 90, 180, 30);
        panel.add(decline);

        JButton createEvent = new JButton("Progress");
        createEvent.setBounds(450, 90, 180, 30);
        panel.add(createEvent);

        JButton editEvent = new JButton("Notification");
        editEvent.setBounds(650, 90, 180, 30);
        panel.add(editEvent);

 
    
    }
}

