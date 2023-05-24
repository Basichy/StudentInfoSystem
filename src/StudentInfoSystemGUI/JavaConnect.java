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

/*public void dbsetup() {
        try {
            conn = DriverManager.getConnection(url, dbusername, dbpassword);
            Statement statement = conn.createStatement();
            String tableName = "UserInfo";

            if (!checkTableExisting(tableName)) {
                statement.executeUpdate("CREATE TABLE " + tableName + " (userid VARCHAR(12), password VARCHAR(12), score INT)");
            }
            //statement.executeUpdate("INSERT INTO " + tableName + " VALUES('Fiction',0),('Non-fiction',10),('Textbook',20)");
            statement.close();

        } catch (Throwable e) {
            System.out.println("error");

        }
    }
*/

/* private boolean checkTableExisting(String newTableName) {
        boolean flag = false;
        try {

            System.out.println("check existing tables.... ");
            String[] types = {"TABLE"};
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rsDBMeta = dbmd.getTables(null, null, null, null);//types);
            //Statement dropStatement=null;
            while (rsDBMeta.next()) {
                String tableName = rsDBMeta.getString("TABLE_NAME");
                if (tableName.compareToIgnoreCase(newTableName) == 0) {
                    System.out.println(tableName + "  is there");
                    flag = true;
                }
            }
            if (rsDBMeta != null) {
                rsDBMeta.close();
            }
        } catch (SQLException ex) {
        }
        return flag;
    }
*/

/*
    CREATE TABLE CLASSINFO 
    (
        CLASSID INT GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
        CLASSNAME VARCHAR(255),
        SECTION VARCHAR(255)
    );

    CREATE TABLE SUBJECTINFO
    (
    SUBJECTID INT GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
    SUBJECTNAME VARCHAR(255)
    );
*/
