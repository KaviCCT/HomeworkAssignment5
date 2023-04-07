/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkassignment5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author kavip
 */
public class MyFileReader {
    
            //Dcelaring ANSI_RESET so we can reset the colour
    public static final String ANSI_RESET = "\u001B[30m";
    //Dcelaring ANSI colours for console message use
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    
    
    public void readFile() throws IOException{
    
        
         
        
        // TRY CATCH FOR ERRORS READING FROM A CSV FILE
         try {
            //Declaring and reading from text file path specified
//            Scanner file = new Scanner(new java.io.MyFileReader("C:\\Users\\kavip\\Desktop\\New folder\\Study\\Applied Software Development\\Java Programming Object Oriented\\newData.csv"));
            
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\kavip\\Desktop\\New folder\\Study\\Applied Software Development\\Java Programming Object Oriented\\newData.csv"));

            // DECLARING REQUIRED VARIABLES 
            int invoice;
            int stockCode;
            String description;
            int quantity;
            String invoiceDate;
            double price;
            int customerID;
            String country;
            
//            int invoice;
//            int stockCode;
//            String description;
//            int quantity;
//            String invoiceDate;
//            double price;
//            int customerID;
//            String country;
            
            // CHECKING FOR EMPTY FILE
            if (file.readLine() == null){
                System.out.println(ANSI_RED + "That is an empty file." + ANSI_RESET);
            }
            file.readLine();
            
            //Loop for reading all lines in file
            //Using .hasNext instead of .hasNextLine to avoid throwing errors for empty lines at end of file
            while (file.readLine() != null){
                
                //Skipp empty lines in input file
    
                // ALLOCATING String fileLine TO THE NEXT FILE LINE .nextLine()
                String fileLine = file.readLine();
                // SPLITTING filLine INTO AN ARRAY OF SUBSTRING AT "," USING REGEX AND split()
                // STRING IT IN fileLineArray[]
                String fileLineArray[] = fileLine.split(",");
                // BASE ON THE FORMAT OF THE CSV FILE AND EACH LINE, VALUES ARE ALLOCATED TO EACH VARIABLE BASED ON THEIR POSITION
                invoice = Integer.parseInt(fileLineArray[0]);
                stockCode = Integer.parseInt(fileLineArray[1]);
                description = fileLineArray[2];
                quantity = Integer.parseInt(fileLineArray[3]);
                invoiceDate = fileLineArray[4];
                price = Double.parseDouble(fileLineArray[5]);
                customerID = Integer.parseInt(fileLineArray[6]);
                country = fileLineArray[7];
                System.out.println(Integer.toString(invoice));
                System.out.println(Integer.toString(stockCode));
                System.out.println(description);
                System.out.println(Integer.toString(quantity));
                System.out.println(invoiceDate);
                System.out.println(Double.toString(price));
                System.out.println(Integer.toString(customerID));
                System.out.println(country);
            }
            System.out.println(ANSI_GREEN + "File loaded." + ANSI_RESET);
            System.out.println("***********************************");
        }
         catch (FileNotFoundException ex) {
            System.out.println(ANSI_RED + "File not found." + ANSI_RESET);
        }

    } 
    
    
    
}
