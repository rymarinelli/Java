import java.util.Scanner;


public class DegreeGrader {
	
	public double modAverage;
	public double ismAverage;
	public int compFailedCredits;
	public int outrightFailedMods;
	
	public double first;
	public double second;
	public int poorGrades;
	
	double[] modGrades = new double [9];
	
	public DegreeGrader(double modAverage, double ismAverage,
			int compFailedCredits, int outrightFailedCredits)
	{
		this.modAverage = modAverage;
		this.ismAverage = ismAverage;
		this.compFailedCredits = compFailedCredits;
		this.outrightFailedMods = outrightFailedMods;; 
	}
	
	public double getModAverage()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your grades for the 9 taught modules");
	    
		double total = 0;
		
		for(int i = 0; i < modGrades.length; i++)	
		{
			modGrades[i] = sc.nextDouble();
			total = total + modGrades[i];
			System.out.println(total);
			modAverage = total/modGrades.length;
			
		}
		   return modAverage;
		   
	}
	
	public int getcompFailedCredits()
	{
		compFailedCredits  = 0;
		
		for(int i = 0; i < modGrades.length; i++)	
		{
			if(modGrades[i] >= 40 && modGrades[i] < 50)	
			{	
				compFailedCredits++;
	        } 
			
		}   
	
		
		if(first >= 40 && first < 50 || second >= 40 && second < 50 )	
		{	
			compFailedCredits++;
        } 
		
		
		return compFailedCredits *= 15;
		
	}
	
	public int getOutRightFailedMods()
	{
		compFailedCredits = 0;
		
		for(int i = 0; i < modGrades.length; i++)	
		{	
			if(modGrades[i] <= 39)	
			{	
				outrightFailedMods++;
	        } 
		}   
	
		
		
		if(first <= 39 || second <= 39)	
		{	
			outrightFailedMods++;
        } 
		
		return outrightFailedMods;
		
	}
	
	
	
	public double getISMAverage()
	{
		System.out.println("Please input your grade for the 1st research module (15 credits)");
		Scanner sc = new Scanner(System.in);

		first = sc.nextDouble();
		
		
		System.out.println("Please input your grade for the 1st research module (30 credits)");
		second = sc.nextDouble();
		//second = second * (30/45);
		
		ismAverage = ((first *.33) + (second*.66));
		
		return ismAverage;
		
	}
	
	public void gradeDegree()
	{
		getModAverage();
		getISMAverage();
		getcompFailedCredits();
		getOutRightFailedMods();
		
		
		if(modAverage >= 70 && modAverage <= 100 &&
		   ismAverage >= 70 && ismAverage <= 100 &&
		   outrightFailedMods == 0 && outrightFailedMods == 0 )
		{
			System.out.println( "Distinction");
		}
		
	
		else if(modAverage >= 60 && modAverage <= 69 &&
				ismAverage <= 60 && ismAverage <= 69 &&
				outrightFailedMods <= 15 )
		{  	
			
			int poorGrades = 0;
			
			for(int i = 0; i < modGrades.length; i++)
			{
				if(modGrades[i] <= 40)
				{
					poorGrades++;
				} 
			}
			
			if(poorGrades == 0 && first >= 40 && second >= 40)
			{
				System.out.println( "Merit");
			}
		}
		
		else if(modAverage >= 50 && modAverage <= 59 &&
				ismAverage >= 50 && ismAverage <= 59 && 
				outrightFailedMods <= 30)
		{
			
			for(int i = 0; i < modGrades.length; i++)
			{
				if(modGrades[i] <= 40)
				{
					poorGrades++;
				}
			}	
		
			
			if(poorGrades == 0 && first >= 40 && second >= 40)
			{
				System.out.println("Pass");
			}
		}
		
		else {
			 System.out.println("No Pass");
		}
	  }
	
	public void unitTest()
	{
		System.out.println("The average of your taught courses is " + modAverage);
		System.out.println("The average of your research couses is " + ismAverage);
		System.out.println(" The number of your failed courses are " + outrightFailedMods);
		System.out.println("The number of your courses that are less than 40 are " 
		                    + poorGrades);		
	}
	
}
	
	
