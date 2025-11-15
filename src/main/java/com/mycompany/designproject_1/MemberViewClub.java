package com.mycompany.designproject_1;


import javax.swing.*;


public class MemberViewClub extends JFrame {
    public MemberViewClub() {
        setTitle("View Club");
        setSize(600, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel title = new JLabel("View club");
         title.setBounds(260, 20, 200, 25);
        panel.add(title);


        JButton addMember = new JButton("Join");
        addMember.setBounds(50, 60, 150, 25);
        panel.add(addMember);

        JButton removeMember = new JButton("Leave");
        removeMember.setBounds(320,60, 150, 25);
        panel.add(removeMember);

        JLabel clubsLabel = new JLabel("Clubs");
        clubsLabel.setBounds(50, 120, 100, 25);
        panel.add(clubsLabel);

        JTable clubs = new JTable(15, 1);
        JScrollPane scroll1 = new JScrollPane(clubs);
        scroll1.setBounds(50, 150, 250, 200);
        panel.add(scroll1);

        JLabel eventLabel = new JLabel("Joined Clubs");
        eventLabel.setBounds(320, 120, 100, 25);
        panel.add(eventLabel);

        JTable JoinedClubs = new JTable(3, 1);
        JScrollPane scroll2 = new JScrollPane(JoinedClubs);
        scroll2.setBounds(320, 150, 200, 70);
        panel.add(scroll2);
    }
}
