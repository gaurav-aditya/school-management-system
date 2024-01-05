
package schoolmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;


public class UpdateTeacher extends JFrame implements ActionListener {
    JTextField tfname,tffname,tfaddress,tfphone,tfx,tfemail,tfquaification,tfaadhar,tfmname  ,tfclass,tfposition;
    JLabel labelempId,lbljoiningdate;
    JButton submit,cancel;
    Choice cEmpId;
  
    UpdateTeacher(){
        setSize(900,650);
        setLocation(350,50);
        setLayout(null);
        
        JLabel heading =new JLabel("Update Teacher Details");
        heading.setBounds(50,10,500,50);
        heading.setFont(new Font("Tahoma",Font.ITALIC,35));
        add(heading);
        
        JLabel lblrollnumber =new JLabel("Select Employee Id");
        lblrollnumber.setBounds(50,100,200,20);
        lblrollnumber.setFont(new Font("serif",Font.PLAIN,20));
        add(lblrollnumber);
        
        cEmpId = new Choice();
        cEmpId.setBounds(250,100,200,20);
        add(cEmpId);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from teacher");
            while(rs.next()){
                cEmpId.add(rs.getString("empId"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblname =new JLabel("Name");
        lblname.setBounds(50,150,100,30);
        lblname.setFont(new Font("serif",Font.BOLD,25));
        add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(200,150,150,30);
        labelname.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelname);
        
        JLabel lblfname =new JLabel("Father's Name");
        lblfname.setBounds(400,150,200,30);
        lblfname.setFont(new Font("serif",Font.BOLD,25));
        add(lblfname);
        
        JLabel labelfname=new JLabel();
        labelfname.setBounds(600,150,200,30);
        labelfname.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelfname);
        
        JLabel lblempId =new JLabel("Employee Id");
        lblempId.setBounds(50,200,200,30);
        lblempId.setFont(new Font("serif",Font.BOLD,25));
        add(lblempId);
        
        labelempId =new JLabel();
        labelempId.setBounds(200,200,200,30);
        labelempId.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelempId);
        
        JLabel lbldob=new JLabel("Date of Birth");
        lbldob.setBounds(400,200,200,30);
        lbldob.setFont(new Font ("serif",Font.BOLD,25));
        add(lbldob);
        
        JLabel labeldob=new JLabel();
        labeldob.setBounds(600,200,200,30);
        labeldob.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labeldob);
        
        JLabel lblmname =new JLabel("Mother's Name");
        lblmname.setBounds(50,250,150,30);
        lblmname.setFont(new Font("serif",Font.BOLD,25));
        add(lblmname);
        
        tfmname=new JTextField();
        tfmname.setBounds(200,250,150,30);
        add(tfmname);
        
        JLabel lblphone =new JLabel("Phone number");
        lblphone.setBounds(400,250,200,30);
        lblphone.setFont(new Font("serif",Font.BOLD,25));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(600,250,200,30);
        add(tfphone);
        
        JLabel lablemail =new JLabel("Email id");
        lablemail.setBounds(50,300,200,30);
        lablemail.setFont(new Font("serif",Font.BOLD,25));
        add(lablemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        JLabel lblx =new JLabel("X Class(%)");
        lblx.setBounds(400,300,250,30);
        lblx.setFont(new Font("serif",Font.BOLD,25));
        add(lblx);
        
        JLabel labelx=new JLabel();
        labelx.setBounds(600,300,200,30);
        labelx.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelx);
        
        JLabel lblxii =new JLabel("XII Class(%)");
        lblxii.setBounds(50,350,200,30);
        lblxii.setFont(new Font("serif",Font.BOLD,25));
        add(lblxii);
        
        JLabel labelxii=new JLabel();
        labelxii.setBounds(200,350,150,30);
        labelxii.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelxii);
        
        JLabel lblaadhar =new JLabel("Aadhar Number");
        lblaadhar.setBounds(400,350,250,30);
        lblaadhar.setFont(new Font("serif",Font.BOLD,25));
        add(lblaadhar);
        
        JLabel labelaadhar=new JLabel();
        labelaadhar.setBounds(600,350,200,30);
        labelaadhar.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelaadhar);
        
        JLabel lblqualification =new JLabel("Qualification");
        lblqualification.setBounds(50,400,200,30);
        lblqualification.setFont(new Font("serif",Font.BOLD,25));
        add(lblqualification);
        
        
        tfquaification=new JTextField();
        tfquaification.setBounds(200,400,150,30);
        tfquaification.setBackground(Color.WHITE);
        add(tfquaification);
        
        JLabel lblposition =new JLabel("Position");
        lblposition.setBounds(400,400,200,30);
        
        add(lblposition);
        
        
        tfposition=new JTextField();
        tfposition.setBounds(600,400,150,30);
        
        add(tfposition);
        
        JLabel lbljoiningdate=new JLabel("Date of Joining");
        lbljoiningdate.setBounds(50,450,200,30);
        lbljoiningdate.setFont(new Font ("serif",Font.BOLD,18));
        add(lbljoiningdate);
        
        JLabel labeldoj=new JLabel();
        labeldoj.setBounds(200,450,150,30);
        labeldoj.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labeldoj);
        
        JLabel lbladdress =new JLabel("Address");
        lbladdress.setBounds(400,450,150,30);
        lbladdress.setFont(new Font("serif",Font.BOLD,30));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(600,450,200,30);
        add(tfaddress);
        
        try{
            Conn c=new Conn();
            String query="select * from teacher where empId='"+cEmpId.getSelectedItem()+"' ";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                labelempId.setText(rs.getString("empId"));
                tfmname.setText(rs.getString("mname"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelaadhar.setText(rs.getString("aadhar"));
                labelxii.setText(rs.getString("clas_xii"));
                tfclass.setText(rs.getString("qualification"));
                tfposition.setText(rs.getString("position"));
                tfaddress.setText(rs.getString("address"));
                labeldoj.setText(rs.getString("doj"));
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        cEmpId.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                try{
            Conn c=new Conn();
            String query="select * from teacher where empId='"+cEmpId.getSelectedItem()+"' ";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                labelempId.setText(rs.getString("empId"));
                tfmname.setText(rs.getString("mname"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelaadhar.setText(rs.getString("aadhar"));
                labelxii.setText(rs.getString("class_xii"));
                tfclass.setText(rs.getString("qualification"));
                tfposition.setText(rs.getString("position"));
                tfaddress.setText(rs.getString("address"));
                labeldoj.setText(rs.getString("doj"));
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            }
        });
        
        submit=new JButton("Update");
        submit.setBounds(250,500,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,16));
        add(submit);
        
        
        cancel=new JButton("Cancel");
        cancel.setBounds(450,500,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,16));
        add(cancel);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
            if(ae.getSource()==submit){
                String empId=labelempId.getText();
                
                String mname=tfmname.getText();
                String phone=tfphone.getText();
                String email=tfemail.getText();
               
                String qualification=tfquaification.getText();
                String position=tfposition.getText();
                
                String address=tfaddress.getText();
                 
                try{
                    String query="update teacher set mname='"+mname+"',phone='"+phone+"',email='"+email+"',qualification='"+qualification+"',position='"+position+"',address='"+address+"' where empId='"+empId+"'";
                    Conn con=new Conn();
                    con.s.executeUpdate(query);
                    
                    JOptionPane.showMessageDialog(null,"Teacher details Updated Successfully ");
                    setVisible(false);
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                
            
            
        
        }
    }
    public static void main(String[] args) {
        new UpdateTeacher();
    }
    
}
