
/**
 * To demonstrate some methods found in the Math class.
 * 
  */
import java.util.*;
public class MathDemo
{
    public int ballOne;
    public int ballTwo;
    public int ballThree;
	
	public double squareRoot(double rootIn)
	{
	 return  Math.sqrt(rootIn);
	}
	
	public void  rollDice()
	{
	   int score;
	   score = (int) (Math.random() * 6) + 1;
	   System.out.println("You rolled a " + score);
	}
	
	public void findThePower()
	{
	   double base, exponent;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number you wish to raise to the power");
	   base = sc.nextDouble();
	   System.out.println("Enter the power you wish to raise the number to");
	   exponent = sc.nextDouble();
	   System.out.print("The number " + base + " raised to the power " + exponent + " = ");
	   System.out.println(Math.pow(base,exponent));
	}

	public int generateLottoNumber() 
	{
		return (int) (Math.random() * 100);
		
		
	}
	
	public int getMax(int ballOne, int ballTwo, int ballThree)
	{
		if(ballOne > ballTwo && ballOne > ballThree)
		{
			return ballOne;
		}
		
		else if (ballTwo > ballOne && ballTwo > ballThree)
		{
			return ballTwo;
		}
		
		else {
			return ballThree;
		}
		
	}

	public void bestOfThree()
	{
		System.out.println("What is your first guess?");
		Scanner sc = new Scanner(System.in);
		ballOne = sc.nextInt();
		System.out.println("What is your second guess?");
        ballTwo = sc.nextInt();
        System.out.println("What is your third guess?");
        ballThree = sc.nextInt();
        
        System.out.println("The largest is\t" + getMax(ballOne,ballTwo,ballThree));
        sc.close();
	} 
	
	
}	
