
package schoolmanagementsystem;
import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
            //JDBC 
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolmanagementsystem","root","Pandey@7033");
            s=c.createStatement();
            
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
