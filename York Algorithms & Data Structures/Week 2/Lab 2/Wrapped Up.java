import java.util.Scanner;

/**
 * Favourite class to test a string object and it's methods.
 * 
 * @version (a version number or a date)
 */

public class WrappedUp
{
	
	public void guessMyFavouriteThing()
	{
	   String favorite = "Takoyaki";
	   
	   //Create a string object with your favourite animal, car ..whatever
	   //e.g String favMotorBikeManufacturer = "bmw"
	   
	   /* Now prompt for a guess - using the Scanner class
	   ** Using String methods, you should give the length 
	   ** and first letter of your favourite thing in the prompt.
	   */
	   
	   System.out.println("It is this many characters long");
	   System.out.println(favorite.length());
	   
	   System.out.println("It starts with the letter ");
	   System.out.println(favorite.charAt(0));
	   
	   System.out.println("It ends with the letter ");
	   System.out.println(favorite.charAt(favorite.length() -1 ));
	  
	  // Now test if the guess was correct - ignore case 
	   Scanner sc = new Scanner(System.in);
	   String guess = sc.nextLine();
	   
	   while(guess.equals(favorite)!= true)
	   {    
		   System.out.println("Guess again!");
		   String nextGuess = sc.nextLine();
		   guess = nextGuess;
		  
	  
	   }
	   
	   System.out.println("You are correct!");
	   
	}//end guessing


	public static void main(String args[]) {
		//Create WrappedUp object and test the methods
		WrappedUp test = new WrappedUp();
		test.guessMyFavouriteThing();
	}
}
