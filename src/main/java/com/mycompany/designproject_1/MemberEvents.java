
package com.mycompany.designproject_1;


import javax.swing.*;



public class MemberEvents extends JFrame {
    public MemberEvents() {
        setTitle("Upcoming Events");
        setSize(600, 550);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel title = new JLabel("Events");
        title.setBounds(260, 20, 200, 25);
        panel.add(title);


        JButton reg = new JButton("Register");
        reg.setBounds(50, 60, 150, 25);
        panel.add(reg);

        JButton un= new JButton("Unregister");
        un.setBounds(320,60, 150, 25);
        panel.add(un);

        JLabel Label = new JLabel("Upcoming Events");
        Label.setBounds(50, 120, 100, 25);
        panel.add(Label);

        JTable uevent= new JTable(6, 2);
        JScrollPane scroll1 = new JScrollPane(uevent);
        scroll1.setBounds(50, 150, 480, 120);
        panel.add(scroll1);
        
        JLabel Label2 = new JLabel("My next Events");
        Label2.setBounds(50,300, 100, 25);
        panel.add(Label2);

        JTable revent= new JTable(3, 2);
        JScrollPane scroll16 = new JScrollPane(revent);
        scroll16.setBounds(50, 340, 480, 100);
        panel.add(scroll16);

    }
}

