
package com.mycompany.designproject_1;

import javax.swing.*;

public class AdminDataManegment extends JFrame {
    public AdminDataManegment() {
        setTitle("Data Manager Page");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(null);
        add(panel);

        JLabel title = new JLabel("Data Manager");
        title.setBounds(250, 20, 150, 25);
        panel.add(title);

        JTable dataTable = new JTable(15, 1);
        JScrollPane scroll = new JScrollPane(dataTable);
        scroll.setBounds(50, 60, 480, 220);
        panel.add(scroll);

        JButton store = new JButton("Store Data");
        store.setBounds(50, 300, 120, 30);
        panel.add(store);

  

        JButton delete = new JButton("Delete Data");
        delete.setBounds(440, 300, 120, 30);
        panel.add(delete);
    }
}
