
package schoolmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Marks extends JFrame implements ActionListener{
    String rollno;
    JButton cancel;
    Marks(String rollno){
        this.rollno=rollno;
        setSize(500,600);
        setLocation(500,100);
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading =new JLabel("Subhash Public School");
        heading.setBounds(100,10,500,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(heading);
        
        JLabel subheading =new JLabel("Final Examination Result 2023");
        subheading.setBounds(100,50,500,20);
        subheading.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(subheading);
        
        JLabel lblrollno =new JLabel("Roll Number"+rollno);
        lblrollno.setBounds(60,100,500,20);
        lblrollno.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblrollno);
        
        JLabel lblclass =new JLabel("Class");
        lblclass.setBounds(60,130,500,20);
        lblclass.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblclass);
        
        JLabel sub1 =new JLabel();
        sub1.setBounds(100,200,500,20);
        sub1.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(sub1);
        
        JLabel sub2 =new JLabel();
        sub2.setBounds(100,230,500,20);
        sub2.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(sub2);
        
        JLabel sub3 =new JLabel();
        sub3.setBounds(100,260,500,20);
        sub3.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(sub3);
        
        JLabel sub4 =new JLabel();
        sub4.setBounds(100,290,500,20);
        sub4.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(sub4);
        
        JLabel sub5 =new JLabel();
        sub5.setBounds(100,320,500,20);
        sub5.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(sub5);
        
        JLabel sub6 =new JLabel();
        sub6.setBounds(100,350,500,20);
        sub6.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(sub6);
        
        JLabel sub7 =new JLabel();
        sub7.setBounds(100,380,500,20);
        sub7.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(sub7);
        
        try{
            Conn c=new Conn();
            ResultSet rs1=c.s.executeQuery("select * from subject where rollno = '"+rollno+"'");
            while(rs1.next()){
                sub1.setText(rs1.getString("subject1"));
                sub2.setText(rs1.getString("subject2"));
                sub3.setText(rs1.getString("subject3"));
                sub4.setText(rs1.getString("subject4"));
                sub5.setText(rs1.getString("subject5"));
                sub6.setText(rs1.getString("subject6"));
                sub7.setText(rs1.getString("subject7"));  
                
            }
            
            ResultSet rs2=c.s.executeQuery("select * from marks where rollno = '"+rollno+"'");
            while(rs2.next()){
                sub1.setText(sub1.getText()+ "------------"+rs2.getString("marks1"));
                sub2.setText(sub2.getText()+ "------------"+rs2.getString("marks2"));
                sub3.setText(sub3.getText()+ "------------"+rs2.getString("marks3"));
                sub4.setText(sub4.getText()+ "------------"+rs2.getString("marks4"));
                sub5.setText(sub5.getText()+ "------------"+rs2.getString("marks5"));
                sub6.setText(sub6.getText()+ "------------"+rs2.getString("marks6"));
                sub7.setText(sub7.getText()+ "------------"+rs2.getString("marks7"));
                lblclass.setText("Class "+rs2.getString("class"));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        cancel=new JButton("Back");
        cancel.setBounds(250,500,120,25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,16));
        add(cancel);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args) {
        new Marks("");
    }
    
}
