
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class JDBCConnections {
    
    Connection con;

    public JDBCConnections() {
        createConnection();
    }
    
    public void createConnection(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodproject","j2ee","1234");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCConnections.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnections.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public Connection getConnection(){
      return con;
    }
}
