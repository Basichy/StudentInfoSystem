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
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentInfoSystem;create=true", "login", "login");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(JavaConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}


/*
    CREATE TABLE USERINFO
    (
        ID INT GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
        NAME VARCHAR(255),
        PHONE INT,
        ADDRESS VARCHAR(255),
        UNAME VARCHAR(255),
        PASSWORD VARCHAR(255),
        UTYPE VARCHAR(255)
    );

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

    CREATE TABLE EXAMINFO
    (
        EXAMID INT GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
        ENAME VARCHAR(255),
        ESEMESTER VARCHAR(255),
        EDATE VARCHAR(255),
        ECLASS VARCHAR(255),
        ESECTION VARCHAR(255),
        ESUBJECT VARCHAR(255)
    );

    CREATE TABLE STUDENTINFO
    (
        STUDENTID INT GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
        SNAME VARCHAR(255),
        PNAME VARCHAR(255),
        DOB VARCHAR(255),
        GENDER VARCHAR(255),
        PNUMBER INT,
        ADDRESS VARCHAR(255),
        SCLASS VARCHAR(255),
        SSECTION VARCHAR(255)
    );

    CREATE TABLE MARKSINFO
    (
        MARKID INT GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
        MSTUDENTID INT,
        MSTUDENTNAME VARCHAR(255),
        MCLASS VARCHAR(255),
        MSUBJECT VARCHAR(255),
        MARKS INT,
        MSEMESTER VARCHAR(255)
    );

*/
