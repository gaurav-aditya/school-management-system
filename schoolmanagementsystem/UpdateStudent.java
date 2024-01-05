
package schoolmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;


public class UpdateStudent extends JFrame implements ActionListener {
    JTextField tfname,tffname,tfaddress,tfphone,tfx,tfemail,tflschool,tfaadhar,tfmname  ,tfclass,tfsection;
    JLabel labelrollno;
    JButton submit,cancel;
    Choice crollno;
  
    UpdateStudent(){
        setSize(900,650);
        setLocation(350,50);
        setLayout(null);
        
        JLabel heading =new JLabel("Update Student Details");
        heading.setBounds(50,10,500,50);
        heading.setFont(new Font("Tahoma",Font.ITALIC,35));
        add(heading);
        
        JLabel lblrollnumber =new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50,100,200,20);
        lblrollnumber.setFont(new Font("serif",Font.PLAIN,20));
        add(lblrollnumber);
        
        crollno = new Choice();
        crollno.setBounds(250,100,200,20);
        add(crollno);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from student");
            while(rs.next()){
                crollno.add(rs.getString("rollno"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblname =new JLabel("Name");
        lblname.setBounds(50,150,100,30);
        lblname.setFont(new Font("serif",Font.BOLD,30));
        add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(200,150,150,30);
        labelname.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelname);
        
        JLabel lblfname =new JLabel("Father's Name");
        lblfname.setBounds(400,150,200,30);
        lblfname.setFont(new Font("serif",Font.BOLD,30));
        add(lblfname);
        
        JLabel labelfname=new JLabel();
        labelfname.setBounds(600,150,200,30);
        labelfname.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelfname);
        
        JLabel lblrollno =new JLabel("Roll No");
        lblrollno.setBounds(50,200,200,30);
        lblrollno.setFont(new Font("serif",Font.BOLD,30));
        add(lblrollno);
        
        labelrollno =new JLabel();
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelrollno);
        
        JLabel lbldob=new JLabel("Date of Birth");
        lbldob.setBounds(400,200,200,30);
        lbldob.setFont(new Font ("serif",Font.BOLD,30));
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
        lblphone.setFont(new Font("serif",Font.BOLD,30));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(600,250,200,30);
        add(tfphone);
        
        JLabel lblemail =new JLabel("Email id");
        lblemail.setBounds(50,300,200,30);
        lblemail.setFont(new Font("serif",Font.BOLD,30));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        JLabel lblx =new JLabel("Last Class(%)");
        lblx.setBounds(400,300,250,30);
        lblx.setFont(new Font("serif",Font.BOLD,30));
        add(lblx);
        
        JLabel labelx=new JLabel();
        labelx.setBounds(600,300,200,30);
        labelx.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelx);
        
        JLabel lbllschool =new JLabel("Last School");
        lbllschool.setBounds(50,350,200,30);
        lbllschool.setFont(new Font("serif",Font.BOLD,25));
        add(lbllschool);
        
        JLabel labellschool=new JLabel();
        labellschool.setBounds(200,350,150,30);
        labellschool.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labellschool);
        
        JLabel lblaadhar =new JLabel("Aadhar Number");
        lblaadhar.setBounds(400,350,250,30);
        lblaadhar.setFont(new Font("serif",Font.BOLD,25));
        add(lblaadhar);
        
        JLabel labelaadhar=new JLabel();
        labelaadhar.setBounds(600,350,200,30);
        labelaadhar.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelaadhar);
        
        JLabel lblclass =new JLabel("Class");
        lblclass.setBounds(50,400,200,30);
        lblclass.setFont(new Font("serif",Font.BOLD,30));
        add(lblclass);
        
        
        tfclass=new JTextField();
        tfclass.setBounds(200,400,150,30);
        tfclass.setBackground(Color.WHITE);
        add(tfclass);
        
        JLabel lblsection =new JLabel("Section");
        lblsection.setBounds(400,400,200,30);
        
        add(lblsection);
        
        
        tfsection=new JTextField();
        tfsection.setBounds(600,400,150,30);
        
        add(tfsection);
        
        JLabel lbladmissiondate=new JLabel("Date of Admission");
        lbladmissiondate.setBounds(50,450,200,30);
        lbladmissiondate.setFont(new Font ("serif",Font.BOLD,18));
        add(lbladmissiondate);
        
        JLabel labeldoa=new JLabel();
        labeldoa.setBounds(200,450,150,30);
        labeldoa.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labeldoa);
        
        JLabel lbladdress =new JLabel("Address");
        lbladdress.setBounds(400,450,150,30);
        lbladdress.setFont(new Font("serif",Font.BOLD,30));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(600,450,200,30);
        add(tfaddress);
        
        try{
            Conn c=new Conn();
            String query="select * from student where rollno='"+crollno.getSelectedItem()+"' ";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                labelrollno.setText(rs.getString("rollno"));
                tfmname.setText(rs.getString("mname"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelaadhar.setText(rs.getString("aadhar"));
                labellschool.setText(rs.getString("lschool"));
                tfclass.setText(rs.getString("cclass"));
                tfsection.setText(rs.getString("section"));
                tfaddress.setText(rs.getString("address"));
                labeldoa.setText(rs.getString("doa"));
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        crollno.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                try{
            Conn c=new Conn();
            String query="select * from student where rollno='"+crollno.getSelectedItem()+"' ";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                labelrollno.setText(rs.getString("rollno"));
                tfmname.setText(rs.getString("mname"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelaadhar.setText(rs.getString("aadhar"));
                labellschool.setText(rs.getString("lschool"));
                tfclass.setText(rs.getString("cclass"));
                tfsection.setText(rs.getString("section"));
                tfaddress.setText(rs.getString("address"));
                labeldoa.setText(rs.getString("doa"));
                
                
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
                String rollno=labelrollno.getText();
                
                String mname=tfmname.getText();
                String phone=tfphone.getText();
                String email=tfemail.getText();
               
                String cclass=tfclass.getText();
                String section=tfsection.getText();
                
                String address=tfaddress.getText();
                 
                try{
                    String query="update student set mname='"+mname+"',phone='"+phone+"',email='"+email+"',cclass='"+cclass+"',section='"+section+"',address='"+address+"' where rollno='"+rollno+"'";
                    Conn con=new Conn();
                    con.s.executeUpdate(query);
                    
                    JOptionPane.showMessageDialog(null,"Student details Updated Successfully ");
                    setVisible(false);
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                
            
            
        
        }
    }
    public static void main(String[] args) {
        new UpdateStudent();
    }
    
}
