
package schoolmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class AddStudent extends JFrame implements ActionListener {
    JTextField tfname,tffname,tfaddress,tfphone,tfx,tfemail,tflschool,tfaadhar,tfmname;
    JLabel labelrollno;
    JDateChooser dcdob, dcdoa;
    JComboBox cbclass,cbsection;
    JButton submit,cancel;
    
    Random ran = new Random();
    long first4=Math.abs((ran.nextLong()%9000)+1000L);
    
    AddStudent(){
        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        
        JLabel heading =new JLabel("New Student Details");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        
        JLabel lblname =new JLabel("Name");
        lblname.setBounds(50,150,100,30);
        lblname.setFont(new Font("serif",Font.BOLD,25));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        
        JLabel lblfname =new JLabel("Father's Name");
        lblfname.setBounds(400,150,200,30);
        lblfname.setFont(new Font("serif",Font.BOLD,25));
        add(lblfname);
        
        tffname=new JTextField();
        tffname.setBounds(600,150,200,30);
        add(tffname);
        
        JLabel lblrollno =new JLabel("Roll No");
        lblrollno.setBounds(50,200,200,30);
        lblrollno.setFont(new Font("serif",Font.BOLD,25));
        add(lblrollno);
        
        labelrollno =new JLabel("2023"+first4);
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font ("serif",Font.BOLD,25));
        add(labelrollno);
        
        JLabel lbldob=new JLabel("Date of Birth");
        lbldob.setBounds(400,200,200,30);
        lbldob.setFont(new Font ("serif",Font.BOLD,25));
        add(lbldob);
        
        dcdob=new JDateChooser();
        dcdob.setBounds(600,200,200,30);
        add(dcdob);
        
        JLabel lblmname =new JLabel("Mother's Name");
        lblmname.setBounds(50,250,150,30);
        lblmname.setFont(new Font("serif",Font.BOLD,20));
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
        
        JLabel lblemail =new JLabel("Email id");
        lblemail.setBounds(50,300,200,30);
        lblemail.setFont(new Font("serif",Font.BOLD,25));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        JLabel lblx =new JLabel("Last Class(%)");
        lblx.setBounds(400,300,250,30);
        lblx.setFont(new Font("serif",Font.BOLD,25));
        add(lblx);
        
        tfx=new JTextField();
        tfx.setBounds(600,300,200,30);
        add(tfx);
        
        JLabel lbllschool =new JLabel("Last School");
        lbllschool.setBounds(50,350,200,30);
        lbllschool.setFont(new Font("serif",Font.BOLD,25));
        add(lbllschool);
        
        tflschool=new JTextField();
        tflschool.setBounds(200,350,150,30);
        add(tflschool);
        
        JLabel lblaadhar =new JLabel("Aadhar Number");
        lblaadhar.setBounds(400,350,250,30);
        lblaadhar.setFont(new Font("serif",Font.BOLD,25));
        add(lblaadhar);
        
        tfaadhar=new JTextField();
        tfaadhar.setBounds(600,350,200,30);
        add(tfaadhar);
        
        JLabel lblclass =new JLabel("Class");
        lblclass.setBounds(50,400,200,30);
        lblclass.setFont(new Font("serif",Font.BOLD,25));
        add(lblclass);
        
        String cclass[]={"NC","LKG","UKG","1","2","3","4","5","6","7","8","9","10"};
        cbclass=new JComboBox(cclass);
        cbclass.setBounds(200,400,150,30);
        cbclass.setBackground(Color.WHITE);
        add(cbclass);
        
        JLabel lblsection =new JLabel("Section");
        lblsection.setBounds(400,400,200,30);
        lblsection.setFont(new Font("serif",Font.BOLD,25));
        add(lblsection);
        
        String section[]={"A","B","C","D"};
        cbsection=new JComboBox(section);
        cbsection.setBounds(600,400,150,30);
        cbsection.setBackground(Color.WHITE);
        add(cbsection);
        
        JLabel lbladmissiondate=new JLabel("Date of Admission");
        lbladmissiondate.setBounds(50,450,200,30);
        lbladmissiondate.setFont(new Font ("serif",Font.BOLD,18));
        add(lbladmissiondate);
        
        dcdoa=new JDateChooser();
        dcdoa.setBounds(200,450,150,30);
        add(dcdoa);
        
        JLabel lbladdress =new JLabel("Address");
        lbladdress.setBounds(400,450,150,30);
        lbladdress.setFont(new Font("serif",Font.BOLD,25));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(600,450,200,30);
        add(tfaddress);
        
        submit=new JButton("Submit");
        submit.setBounds(250,600,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,16));
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(450,600,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,16));
        add(cancel);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
            if(ae.getSource()==submit){
                String name=tfname.getText();
                String fname=tffname.getText();
                String rollno=labelrollno.getText();
                String dob=((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
                String mname=tfmname.getText();
                String phone=tfphone.getText();
                String email=tfemail.getText();
                String x=tfx.getText();
                String lschool=tflschool.getText();
                String aadhar=tfaadhar.getText();
                String cclass=(String)cbclass.getSelectedItem();
                String section=(String)cbsection.getSelectedItem();
                String doa=((JTextField)dcdoa.getDateEditor().getUiComponent()).getText();
                String address=tfaddress.getText();
                 
                try{
                    String query="insert into student values('"+name+"','"+fname+"','"+rollno+"','"+dob+"','"+mname+"','"+phone+"','"+email+"','"+x+"','"+lschool+"','"+aadhar+"','"+cclass+"','"+section+"','"+doa+"','"+address+"')";
                    Conn con=new Conn();
                    con.s.executeUpdate(query);
                    
                    JOptionPane.showMessageDialog(null,"Student details inserted successfully ");
                    setVisible(false);
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                
            
            
        
        }
            else{
                setVisible(false);
            }
    }
    public static void main(String[] args) {
        new AddStudent();
    }
    
}
