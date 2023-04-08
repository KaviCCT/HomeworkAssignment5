/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkassignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 *
 * @author kavip
 */
public class DatabaseIO {
    
    
        //Dcelaring ANSI_RESET so we can reset the colour
    public static final String ANSI_RESET = "\u001B[30m";
    //Dcelaring ANSI colours for console message use
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    private final String DB_URL = "jdbc:mysql://localhost";
    private final String USER = "pooa";
    private final String PASSWD = "pooa";
    private final String DB_NAME = "homework";
    
    public void createDB() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection conn = null; 
        Statement stmt = null;
        
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWD);
            stmt = conn.createStatement();
            stmt.execute("CREATE DATABASE IF NOT EXISTS " + DB_NAME + ";");

            System.out.println(ANSI_GREEN + "Database Created..." + ANSI_RESET);

            stmt.execute("USE homework;");
            stmt.execute("CREATE TABLE IF NOT EXISTS miniHomework5 ("
                            + "entryID INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,"
                            + "invoice INT(10) NOT NULL,"
                            + "stockCode INT(10) NOT NULL,"
                            + "description VARCHAR(255) NOT NULL,"
                            + "quantity INT(10) NOT NULL,"
                            + "invoiceDate VARCHAR(40) NOT NULL,"
                            + "price double(10,2) NOT NULL,"
                            + "customerID INT(10) NOT NULL,"
                            + "country VARCHAR(50)"
                            + ");");

            System.out.println(ANSI_GREEN + "miniHomework5 table Created...." + ANSI_RESET);

            
            
            
         
     

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(conn != null) conn.close();
            if(stmt !=null) stmt.close();
        }
    }
    
//    public void addPatient( int patientID, String name, String[] complaints) throws SQLException{
//        Connection conn = DriverManager.getConnection(DB_URL + "/" + DB_NAME, USER, PASSWD);
//        Statement stmt = conn.createStatement();
//        stmt.execute(String.format("INSERT INTO patients ( patientID, name, complaints) VALUES ('%d', %s, %s)", patientID, name,  complaints));
//        System.out.println("Patient stored.");
//    }
    
    public void addEntry(int invoice, int stockCode, String description, int quantity, String invoiceDate, double price, int customerID, String country) throws SQLException{
        Connection conn = DriverManager.getConnection(DB_URL + "/" + DB_NAME, USER, PASSWD);
        Statement stmt = conn.createStatement();
        stmt.execute(String.format("INSERT INTO miniHomework5 ( invoice, stockCode, description, quantity, invoiceDate, price, customerID, country) VALUES (%d, %d, '%s', %d, '%s', %f, %d, '%s')", invoice, stockCode, description, quantity, invoiceDate, price, customerID, country));
        System.out.println(ANSI_RED + "Patient data stored." + ANSI_RESET);
    }
    
     
   
}
