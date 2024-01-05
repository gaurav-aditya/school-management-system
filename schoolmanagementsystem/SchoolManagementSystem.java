 
package schoolmanagementsystem;
import javax.swing.*;
import java.awt.*;


public class SchoolManagementSystem extends JFrame implements Runnable{
    Thread t;
    SchoolManagementSystem(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo2.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);  //JLabel is used to add image on the frame
        add(image);
        t=new Thread(this);
        t.start();
        
        setVisible(true);
        int x=1;
        for (int i=2;i<=600;i+=4,x+=1){
        setLocation(600-((i+x)/2),350-(i/2));
        setSize(i+3*x,i+x/2);
        
        
        try {
            Thread.sleep(5);   //10 is 10 milisecond used to stop the process for 10ms
        } catch (Exception e){}
        }

    }
    public void run(){
        try{
            Thread.sleep(3000);  //7000 ms=7 second
            setVisible(true);
            //Next Frame
            new Login();
        } catch(Exception e){
        
        }
    }
    public static void main(String[] args) {
       new SchoolManagementSystem();
    }
    
}
