
/**
 * Write a description of class Exciting here.
 * 
 * @author Ryan Marinelli
 * @version 03.08.2020
 */
 
 public class TestExciting {
	
 public static void main (String args[]) {
	 
	 //after 1a) create an Exciting object, and display the details for the object
	 Exciting testOne = new Exciting();
	 testOne.displayDetails();
	 
	//after 1b) create an Exciting object, and display the details for the object
	 Exciting testTwo = new Exciting();
	 testTwo.displayDetailsB();
	 
 }

}

public class Exciting
{
    //Put your declarations for a) beneath here 
     double z ;
     int count = 0;
     double cost = 3.45;
     char choice = 'X';
     boolean goodChoice = true;
     short lowest = 5;

    //Put your declarations and initialisations to b) beneath here 
    double roomTemp = 70;
    int ball = 745;
    long popOfChina = 1300000000;
    boolean gameFinished = true;
    long planetDistance = 153710000;
    char grade = 'A';
    
    
   public void doit()
   {
     double x = 3.0;
     double y = 4.0;
     z = 2.0 * y + x/4.0 - (x + y ) ;
   }    
   
   public void displayDetails() 
   {
	   System.out.print("z= ");
	   System.out.println (z);
	   
	   //display the details for the variables you declared in a)
	   System.out.println(count); 
	   System.out.println(cost);
	   System.out.println(choice);
	   System.out.println(goodChoice);
	   System.out.println(lowest);
	   
	   
	   //display the details for the variables you declared in b)
	  
	   
   }
   
   public void displayDetailsB()
   {
	    System.out.println(roomTemp);
	    System.out.println(ball);
	    System.out.println(popOfChina);
	    System.out.println(gameFinished);
	    System.out.println(planetDistance);
	    System.out.println(grade);
   }
   
  
}

	   
    
