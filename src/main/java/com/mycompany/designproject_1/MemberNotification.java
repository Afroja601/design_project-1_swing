

package com.mycompany.designproject_1;


import javax.swing.*;

public class MemberNotification extends JFrame {
    public MemberNotification() {
        setTitle("Notification Page");
        setSize(500, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel title = new JLabel("Notifications");
        title.setBounds(200, 20, 150, 25);
        panel.add(title);

        JTable notificationTable = new JTable(15, 2);
        JScrollPane scroll = new JScrollPane(notificationTable);
        scroll.setBounds(50, 60, 400, 220);
        panel.add(scroll);

    }
}