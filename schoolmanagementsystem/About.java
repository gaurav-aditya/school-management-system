package schoolmanagementsystem;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>School<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Aditya Prakash Pandey");
        name.setBounds(70, 220, 550, 40);
        name.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(name);
        
        JLabel portfolio = new JLabel("My Portfolio:-https://gaurav-aditya.github.io");
        portfolio.setBounds(70, 280, 550, 40);
        portfolio.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(portfolio);
        
        JLabel contact = new JLabel("Contact: echoaditya@proton.me");
        contact.setBounds(70, 340, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(contact);
        
        JLabel linktree = new JLabel("Linktree: https://linktr.ee/echoaditya");
        linktree.setBounds(70, 400, 550, 40);
        linktree.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(linktree);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}