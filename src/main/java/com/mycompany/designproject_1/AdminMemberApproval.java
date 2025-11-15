
package com.mycompany.designproject_1;


import javax.swing.*;


public class AdminMemberApproval extends JFrame {
    public AdminMemberApproval() {
        setTitle("View Club");
        setSize(600, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel title = new JLabel("Admin Member Approval");
         title.setBounds(260, 20, 200, 25);
        panel.add(title);


        JButton addMember = new JButton("Approve");
        addMember.setBounds(50, 60, 150, 25);
        panel.add(addMember);

        JButton removeMember = new JButton("Decline");
        removeMember.setBounds(320,60, 150, 25);
        panel.add(removeMember);

        JLabel RequestsLabel = new JLabel("Requests");
        RequestsLabel.setBounds(50, 120, 100, 25);
        panel.add(RequestsLabel);

        JTable Requests = new JTable(15, 1);
        JScrollPane scroll1 = new JScrollPane(Requests);
        scroll1.setBounds(50, 150, 480, 220);
        panel.add(scroll1);

    }
}
