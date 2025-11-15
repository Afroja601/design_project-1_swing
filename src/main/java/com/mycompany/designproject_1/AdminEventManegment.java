package com.mycompany.designproject_1;


import javax.swing.*;

public class AdminEventManegment extends JFrame {
    public  AdminEventManegment() {
        setTitle("Event Page");
        setSize(600, 650);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel title = new JLabel("Event Details");
        title.setBounds(250, 20, 100, 25);
        panel.add(title);

        JLabel nameLabel = new JLabel("Title:");
        nameLabel.setBounds(50, 60, 80, 25);
        panel.add(nameLabel);

        JTextField titleField = new JTextField();
        titleField.setBounds(150, 60, 150, 25);
        panel.add(titleField);

        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setBounds(50, 100, 80, 25);
        panel.add(dateLabel);

        JTextField dateField = new JTextField();
        dateField.setBounds(150, 100, 150, 25);
        panel.add(dateField);

        JLabel statusLabel = new JLabel("Status:");
        statusLabel.setBounds(50, 140, 80, 25);
        panel.add(statusLabel);

        JTextField statusField = new JTextField();
        statusField.setBounds(150, 140, 150, 25);
        panel.add(statusField);

        JButton addParticipant = new JButton("Add Participant");
        addParticipant.setBounds(350, 60, 180, 25);
        panel.add(addParticipant);

        JButton removeParticipant = new JButton("Remove Participant");
        removeParticipant.setBounds(350, 100, 180, 25);
        panel.add(removeParticipant);

        JButton editDetails = new JButton("Edit Event Details");
        editDetails.setBounds(350, 140, 180, 25);
        panel.add(editDetails);

        JLabel RequestsLabel = new JLabel("Requests");
        RequestsLabel.setBounds(50, 220, 100, 25);
        panel.add(RequestsLabel);

        JTable Requests = new JTable(15, 1);
        JScrollPane scroll1 = new JScrollPane(Requests);
        scroll1.setBounds(50, 250, 250, 200);
        panel.add(scroll1);

        JLabel PerticipentsLabel = new JLabel("Perticipents");
        PerticipentsLabel.setBounds(320, 220, 100, 25);
        panel.add(PerticipentsLabel);

        JTable Perticipents = new JTable(15, 1);
        JScrollPane scroll2 = new JScrollPane(Perticipents);
        scroll2.setBounds(320, 250, 200, 200);
        panel.add(scroll2);
        
        JLabel EventLabel = new JLabel("Event");
        EventLabel.setBounds(50, 450, 100, 25);
        panel.add(EventLabel);

        JTable Event = new JTable(5, 1);
        JScrollPane scroll3 = new JScrollPane(Event);
        scroll3.setBounds(50, 480, 480, 220);
        panel.add(scroll3); 
        
        
        
     
        
    }
}

