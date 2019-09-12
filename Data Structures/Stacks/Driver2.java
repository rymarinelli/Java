/*
*  @author Ryan Marinelli
*  Homework 2
*  CIS 112 
*  Received assistance on assignment from various tutors at tutor.com 
*/ 

import ch02.*;
import java.util.Scanner;

public class Driver2 {
  
   public static void main (String [] args){
   		ExtendedStack<String> test = new ExtendedStack<String> (); 
         
     	   test.push("first");
   		test.push("second");
   		test.push("third"); 
         test.push("fourth");
         test.push("fifth");
        
        //Confirms the elements were pushed   	
        System.out.println(test);
        test.toString();
        
        //Tests size method
        System.out.println(test.size()); 
        
        //Tests swapStart method
        test.swapStart();
        System.out.println(test); 
        
        //Tests popSome method  
        test.popSome(2);
        System.out.println(test);
        
        //Tests popTop method
        test.poptop();
        System.out.println(test);
          
          
          
     
   }

}