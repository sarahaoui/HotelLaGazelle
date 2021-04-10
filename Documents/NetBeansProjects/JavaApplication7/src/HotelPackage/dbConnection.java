
package HotelPackage;
import java.sql.*;
import javax.swing.JOptionPane;


public class dbConnection {
    public static Connection con(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            System.err.println("connected :))");
            return cnx;
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;}
    }
    
}
