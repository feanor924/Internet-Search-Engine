/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author canerbakar
 */
public class NewJFrameTest {
    
    public NewJFrameTest() {
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
     * Test of sendRequest method, of class NewJFrame.
     */
    @org.junit.Test
    public void testSendRequest() throws Exception {
        System.out.println("sendRequest");
        String address = "127.0.0.1";
        int result=NewJFrame.sendRequest(address);
        int expResult = 0;
        assertEquals(expResult,result);
    }



    /**
     * Test of toEncode method, of class NewJFrame.
     */
    @org.junit.Test
    public void testToEncode() throws Exception {
        System.out.println("toEncode");
        String str = "dmo";
        NewJFrame instance = new NewJFrame();
        String expResult = "ZG1v";
        String result = instance.toEncode(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of toDecode method, of class NewJFrame.
     */
    @org.junit.Test
    public void testToDecode() throws IOException {
        System.out.println("toDecode");
        String str = "ZG1v";
        NewJFrame instance = new NewJFrame();
        String expResult = "dmo";
        String result = instance.toDecode(str);
        assertEquals(expResult, result);
        
    }


    /**
     * Test of listf method, of class NewJFrame.
     */
    @org.junit.Test
    public void testListf() throws IOException {
        System.out.println("listf");
        String directoryName = "/home/canerbakar/Desktop/filesendtestfolder1";
        ArrayList<File> ff=new ArrayList<File>();
        NewJFrame instance = new NewJFrame();
        int result = instance.listf(directoryName, ff);
        int expectedResult=1;
        assertEquals(result,expectedResult);
        
    }

    
}
