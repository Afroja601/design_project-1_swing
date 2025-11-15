package com.mycompany.designproject_1;


import javax.swing.*;


public class AdminViewMembers extends JFrame {
    public AdminViewMembers() {
        setTitle("Admin View Members");
        setSize(600, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel title = new JLabel("Members");
         title.setBounds(260, 20, 200, 25);
        panel.add(title);


        JButton addMember = new JButton("Remove");
        addMember.setBounds(50, 60, 150, 25);
        panel.add(addMember);

      

        JLabel MembersLabel = new JLabel("Members");
        MembersLabel.setBounds(50, 120, 100, 25);
        panel.add(MembersLabel);

        JTable Members = new JTable(15, 1);
        JScrollPane scroll1 = new JScrollPane(Members);
        scroll1.setBounds(50, 150, 480, 220);
        panel.add(scroll1);

   
    }
}
