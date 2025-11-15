
package com.mycompany.designproject_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DesignProject_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("OOP Project - Main Menu");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 10, 10));
        frame.add(panel, BorderLayout.CENTER);

        JLabel title = new JLabel("OOP Project - Page Viewer", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(title, BorderLayout.NORTH);

        JButton login = new JButton("Login Page");
        JButton register = new JButton("Register Page");
        JButton reset = new JButton("Reset Password Page");
        
        JButton member = new JButton("Member Dashboard");
        JButton mv = new JButton("Member View Clubs");
        JButton me = new JButton("Member Events");
        JButton mp = new JButton("Member Progress");
        JButton mn = new JButton("Member Notification");
        
        
        
        JButton admin = new JButton("Admin Dashboard");
        JButton avm = new JButton("Admin View Members");
        JButton ama = new JButton("Admin Member Approval");
        JButton aem = new JButton("Admin Event Manegment");
        JButton an = new JButton("Admin Notification");
        JButton adm = new JButton("Admin data manegment");
        
        
        

        

        panel.add(login);
        panel.add(register);
        panel.add(reset);
        
        panel.add(member);
        panel.add(mv);
         panel.add(me);
         panel.add(mp);
         panel.add(mn);
        
        
        panel.add(admin);
        panel.add(avm);
        panel.add(ama);
        panel.add(aem);
        panel.add(an);
        panel.add(adm);
        
        

        

        // open each page on button click
        login.addActionListener(e -> new LoginPage().setVisible(true));
        register.addActionListener(e -> new Registerpage().setVisible(true));
        reset.addActionListener(e -> new ResetPasswordPage().setVisible(true));
        
        member.addActionListener(e -> new MemberDashboard().setVisible(true));
        mv.addActionListener(e -> new MemberViewClub().setVisible(true));
        me.addActionListener(e -> new MemberEvents().setVisible(true));
         mp.addActionListener(e -> new MemberProgress().setVisible(true));
         mn.addActionListener(e -> new MemberNotification().setVisible(true));
        
        
        
        admin.addActionListener(e -> new AdminDashboard().setVisible(true));
        avm.addActionListener(e -> new AdminViewMembers().setVisible(true));
        ama.addActionListener(e -> new AdminMemberApproval().setVisible(true));
        aem.addActionListener(e -> new AdminEventManegment().setVisible(true));
        an.addActionListener(e -> new AdminNotification().setVisible(true));
        adm.addActionListener(e -> new AdminDataManegment().setVisible(true));
        
        
        
        


        frame.setVisible(true);
    }
}
