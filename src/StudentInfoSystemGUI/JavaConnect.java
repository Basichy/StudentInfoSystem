package StudentInfoSystemGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EthanGaylan 21150437
 */

// This class provides a method to establish a connection to the StudentInfoSystem database
public class JavaConnect 
{
    public static Connection connectdb()
    {
        // Establishes a connection to the StudentInfoSystem database
        Connection conn = null;
        try 
        {
            // Establish the database connection using the Derby JDBC driver
            conn = DriverManager.getConnection("jdbc:derby:StudentInfoSystem;create=true");
            return conn;
        } 
        catch (SQLException ex) 
        {
            // Log any SQLException that occurs during the connection proces
            Logger.getLogger(JavaConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}