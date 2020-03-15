import java.util.Scanner;
import java.math.*;
/**
 * To demonstrate boolean.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;
	double BMI;
	
	
	
    public void setHeight(double heightIn)
    {
        cmHeight= heightIn;
    }
       
    public void setWeight(double weightIn)
    {
       kgWeight= weightIn;
    }
    
    public void setPulse(int pulseIn)
    {
        restPulse = pulseIn;
    }
    
    
	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("………Health Profile……");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.print("Abusing Body = " + checkAbuser());
	   System.out.println("Your BMI is" + getBMI(cmHeight, kgWeight));
	   System.out.println(RateBMI(getBMI(cmHeight, kgWeight)));
	}
	
	public void promptInfo()
	{   String isSmoker;
	
		System.out.println("What is your height?");
		Scanner sc = new Scanner(System.in);
		cmHeight = sc.nextDouble();
		
		System.out.println("What is your weight?");
		kgWeight = sc.nextDouble();
		
		System.out.println("Are you a smoker?");
		isSmoker = sc.nextLine();
		
		if( isSmoker == "Yes" || isSmoker == "yes")
		{
			smoker = true;
		}
		else {
			smoker = false; 
		}
		
		sc.nextLine();
		
		System.out.println("How much do you drink?");
		weeklyAlcholUnits = sc.nextInt(); // 1 pint = 2 units, 1 short = 1 unit)
		
		System.out.println("What is your resting pulse?");
		restPulse = sc.nextInt();

	}
	
	
	
	public double getBMI(double cmHeight, double kgWeight)
	{   double BMI;
		BMI = (kgWeight/(cmHeight*cmHeight))*10000;
		return BMI;
	//BMI = Weight in kilograms/(Height in cm * Height in cm) x 10,000
	}	
	
	public String RateBMI(double BMI)
	{
	  if(BMI <= 17.5)
	  {
		  return "Your BMI is Anorexic";
	  }
	  
	  else if(BMI < 19.1 && BMI > 17.5)
	  {
		  return "Your BMI is Under Weight";
	  }
	  
	  else if(BMI >= 19.1 || BMI <= 25.8)
	  {
		  return "Your BMI shows normal weight";
	  }
	  
	  else if (BMI >= 27.4|| BMI >= 32.3)
	  {
		  return "Your BMI shows overweight";
	  }
	  
	  else {
		  
		  return "Your BMI shows very wverweight";
	  }
	}
}
	
