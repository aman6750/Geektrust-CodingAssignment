package com.example.geektrust;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	  
    public static void main(String[] args)  {
        /*
        Sample code to read from file passed as command line argument
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
               //Add your code here to process input commands
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
        }
        */
    	
    	
    	List<String> commandLineArguments = new LinkedList<>(Arrays.asList(args));
    	
    	run(commandLineArguments);
	}
    
    public static void run(List<String> commandLineArguments) {
    	
   // 	ApplicationConfig applicationConfig = new ApplicationConfig();
    	
    	
    	
    }
}
