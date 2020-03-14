/*
 * @author Tommy Yuan
 * The purpose is to practise the use of if statement.
 * 
 * */


import java.util.*;

public class HiLo {
    
     int random;
    
    public void generateNumber() 
    {
       //The following lines generate and output a random number between 1 and 10
        random = (int)(Math.random()*100)+1;
    }
    
   //Write the guess() method below 
   public void guess()
   {
	   //Use scanner to accept a user input 
	   //Create a new scanner object to receive user input
	      Scanner sc = new Scanner(System.in);
	    
	      System.out.println("Enter you guess ");
	      int guess = sc.nextInt();
	      
	      //write your code below
	      if(guess < random) {
	    	  System.out.println("Low");
	    	  
	      }
	      
	      else if(guess > random ) {
	    	  System.out.println("High");
	    	  
	      }
	      
	      else {
	    	  System.out.println("Hit");
	    	  System.out.println("The number is" + random);
	      }
	      
	      System.out.println("The random number is \t" +  random );
   }
   
    public void startGuessing()
    {
    	generateNumber();
    	
    	 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your guess ");
	      int guess = sc.nextInt();
	       
	  if(guess == random)
	  {
		  System.out.println("Hit");
		  
	  }
	      
	    int i = 1;
	    
    	while(guess != random)
    	{
    		
    		 
    		 
    		 //write your code below
  	      if(guess < random) {
  	    	  System.out.println("Low");
  	    	  System.out.println("This is your " +  i + "guess");
  	      }
  	      
  	      else if(guess > random ) {
  	    	  System.out.println("High");
  	    	  System.out.println("This is your " +  i + "guess");
  	      }
  	      
  	      else {
  	    	  System.out.println("Hit, you got it!");
  	    	   System.out.println("This is your " +  i + "guess");
  	      }
  	      
  	     i = i +1; 
  	     int newGuess = sc.nextInt();
	     guess = newGuess;
	     
    	}
    }
}
 
 
 

public class TestHilo {

	public static void main(String[] args) {
		HiLo h=new HiLo();
		h.startGuessing();
        
	}

}
