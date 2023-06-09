/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package StudentInfoSystemGUI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ETHAN
 */
public class AttendanceTest {
    
    public AttendanceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Load_Subject method, of class Attendance.
     */
    @Test
    public void testLoad_Subject() {
        System.out.println("Load_Subject");
        Attendance instance = new Attendance();
        instance.Load_Subject();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Attendance_Load method, of class Attendance.
     */
    @Test
    public void testAttendance_Load() {
        System.out.println("Attendance_Load");
        Attendance instance = new Attendance();
        instance.Attendance_Load();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Attendance.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Attendance.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
