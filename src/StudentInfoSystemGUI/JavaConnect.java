package StudentInfoSystemGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ETHAN
 */

public class JavaConnect {
    public static Connection connectdb()
    {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentInfoSystem", "login", "login");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(JavaConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
