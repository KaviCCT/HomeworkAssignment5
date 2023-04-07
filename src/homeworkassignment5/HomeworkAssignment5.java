/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkassignment5;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author kavip
 */
public class HomeworkAssignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, IOException {

       DatabaseIO dbConn = new DatabaseIO();
       dbConn.createDB();
        

    MyFileReader fR = new MyFileReader();
    fR.readFile();

        
    }
    
}
