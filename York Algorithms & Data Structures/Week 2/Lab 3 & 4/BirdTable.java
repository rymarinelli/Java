
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 * 
 * 
 */

import javax.swing.*;
import java.lang.*;

public class BirdTable {


   // main method begins execution of Java application
      //Declare and build an array interactively - see the Temperature Project
	int[] birds = new int[7]; 
	public String hist = "*";    

	   
	   
	   public void interactiveArray()
	     {
	       
	       String strElement;
	       int intElement;
	       
	       //Enter the temperatures using inputDialog and a loop
	       for (int i = 0; i < birds.length; i++)
	       {
	         strElement = JOptionPane.showInputDialog( "Enter the number of birds seen "+(i+1) );
	         intElement = Integer.parseInt(strElement );
	         birds [i] = intElement;
	        }
	       
	       //output all temperatures
	        System.out.println("Number of birds entered");
	        for (int i = 0 ; i < birds.length ; i++)
	        {
	         System.out.println("Number of birds seen at day " + i + " = " + birds[i]);
	        }
	      }
      
      public void printHist()
      {
    	for(int i = 0; i < birds.length; i++)
    	{
      //Display Output using a histogram of '*' - see Histogram Project
	    System.out.println("Day " + (i + 1) + "|" + hist.repeat(birds[i]));
	   }
     }
}
