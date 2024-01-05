
package schoolmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class EnterMarks extends JFrame implements ActionListener{
    Choice crollno;
    JComboBox cbclass;
    JButton submit,cancel;
    JTextField tfsub1,tfsub2,tfsub3,tfsub4,tfsub5,tfsub6,tfsub7,tfmarks1,tfmarks2,tfmarks3,tfmarks4,tfmarks5,tfmarks6,tfmarks7;
    EnterMarks(){
        setSize(1000,500);
        setLocation(300,150);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpg"));
        Image i2=i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);  
        image.setBounds(500,40,400,300);
        add(image);
        
        JLabel heading =new JLabel("Enter Marks of Student");
        heading.setBounds(50,0,500,50);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(heading);
        
        JLabel lblrollnumber =new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50,70,150,20);
        add(lblrollnumber);
        
        crollno = new Choice();
        crollno.setBounds(200,70,150,20);
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
        JLabel lblclass =new JLabel("Select Class");
        lblclass.setBounds(50,110,150,20);
        add(lblclass);
        
        String cclass[]={"NC","LKG","UKG","1","2","3","4","5","6","7","8","9","10"};
        cbclass = new JComboBox(cclass);
        cbclass.setBounds(200,110,150,20);
        cbclass.setBackground(Color.WHITE);
        add(cbclass);
        
        JLabel lblentersubject =new JLabel("Enter Subject");
        lblentersubject.setBounds(100,150,200,40);
        add(lblentersubject);
        
        JLabel lblentermarks =new JLabel("Enter Marks");
        lblentermarks.setBounds(320,150,200,40);
        add(lblentermarks);
        
        tfsub1=new JTextField();
        tfsub1.setBounds(50,200,200,20);
        add(tfsub1);
        
        tfsub2=new JTextField();
        tfsub2.setBounds(50,230,200,20);
        add(tfsub2);
        
        tfsub3=new JTextField();
        tfsub3.setBounds(50,260,200,20);
        add(tfsub3);
        
        tfsub4=new JTextField();
        tfsub4.setBounds(50,290,200,20);
        add(tfsub4);
        
        tfsub5=new JTextField();
        tfsub5.setBounds(50,320,200,20);
        add(tfsub5);
        
        tfsub6=new JTextField();
        tfsub6.setBounds(50,350,200,20);
        add(tfsub6);
        
        tfsub7=new JTextField();
        tfsub7.setBounds(50,380,200,20);
        add(tfsub7);
        
       
        
        tfmarks1=new JTextField();
        tfmarks1.setBounds(250,200,200,20);
        add(tfmarks1);
        
        tfmarks2=new JTextField();
        tfmarks2.setBounds(250,230,200,20);
        add(tfmarks2);
        
        tfmarks3=new JTextField();
        tfmarks3.setBounds(250,260,200,20);
        add(tfmarks3);
        
        tfmarks4=new JTextField();
        tfmarks4.setBounds(250,290,200,20);
        add(tfmarks4);
        
        tfmarks5=new JTextField();
        tfmarks5.setBounds(250,320,200,20);
        add(tfmarks5);
        
        tfmarks6=new JTextField();
        tfmarks6.setBounds(250,350,200,20);
        add(tfmarks6);
        
        tfmarks7=new JTextField();
        tfmarks7.setBounds(250,380,200,20);
        add(tfmarks7);
        
         
        submit=new JButton("Submit");
        submit.setBounds(70,420,150,25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,16));
        add(submit);
        
        
        cancel=new JButton("Cancel");
        cancel.setBounds(280,420,150,25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,16));
        add(cancel);
        
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
           try{
               Conn c=new Conn();
               
               
               String query1="insert into subject values('"+crollno.getSelectedItem()+"','"+cbclass.getSelectedItem()+" ','"+tfsub1.getText()+"','"+tfsub2.getText()+"','"+tfsub3.getText()+"','"+tfsub4.getText()+"','"+tfsub5.getText()+"','"+tfsub6.getText()+"','"+tfsub7.getText()+"')";
               String query2="insert into marks values('"+crollno.getSelectedItem()+"','"+cbclass.getSelectedItem()+" ','"+tfmarks1.getText()+"','"+tfmarks2.getText()+"','"+tfmarks3.getText()+"','"+tfmarks4.getText()+"','"+tfmarks5.getText()+"','"+tfmarks6.getText()+"','"+tfmarks7.getText()+"')";
               c.s.executeUpdate(query1);
               c.s.executeUpdate(query2);
               JOptionPane.showMessageDialog(null, "Marks Inserted SUccessfully");
               setVisible(false);
           }catch(Exception e){
               e.printStackTrace();
           }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new EnterMarks();
    }
}
