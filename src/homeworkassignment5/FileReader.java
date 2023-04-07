/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkassignment5;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kavip
 */
public class FileReader {
    
            //Dcelaring ANSI_RESET so we can reset the colour
    public static final String ANSI_RESET = "\u001B[30m";
    //Dcelaring ANSI colours for console message use
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    
    
    public void readFile(){
    
        // TRY CATCH FOR ERRORS READING FROM A CSV FILE
         try {
            //Declaring and reading from text file path specified
            Scanner file = new Scanner(new java.io.FileReader("C:\\Users\\kavip\\Desktop\\New folder\\Study\\Applied Software Development\\Java Programming Object Oriented\\newData.csv"));
            // DECLARING REQUIRED VARIABLES 
            int invoice;
            int stockCode;
            String description;
            int quantity;
            String invoiceDate;
            double price;
            int customerID;
            String country;
            
            // CHECKING FOR EMPTY FILE
            if (!file.hasNext()){
                System.out.println(ANSI_RED + "That is an empty file." + ANSI_RESET);
            }
            
            
            //Loop for reading all lines in file
            //Using .hasNext instead of .hasNextLine to avoid throwing errors for empty lines at end of file
            while (file.hasNextLine()){
                
                //Skipp empty lines in input file
                file.skip("[\\s]*");
                // ALLOCATING String fileLine TO THE NEXT FILE LINE .nextLine()
                String fileLine = file.nextLine();
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
                System.out.println(invoice);
                System.out.println(stockCode);
                System.out.println(description);
                System.out.println(quantity);
                System.out.println(invoiceDate);
                System.out.println(price);
                System.out.println(customerID);
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
