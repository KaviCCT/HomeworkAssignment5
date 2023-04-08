/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkassignment5;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * STUDENT NAME:    Kavi Patak
 * STUDENT ID:      sba22391
 * 
 * KaviCCT/HomeworkAssignment5
 * https://github.com/KaviCCT/HomeworkAssignment5.git 
 * 
 */


public class HomeworkAssignment5 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, IOException {
    // INSTANTIATING A NEW DATABASEIO OBJECT AND CALLING THE createDB METHOD TO ESTABLISH A CONNECTION WITH THE SERVER AND CREATE A DATABASE AND TABLE
    DatabaseIO dbConn = new DatabaseIO();
    dbConn.createDB();
        
    // INSTANTIATING A NEW MyFileReader OBJECT AND CALLING THE readFile METHOD TO READ FROM A CSV FILE
    MyFileReader fR = new MyFileReader();
    fR.readFile();

    
    
        
    }
    
}
