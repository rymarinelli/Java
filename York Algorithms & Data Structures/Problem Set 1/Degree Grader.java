import java.util.Scanner;


public class DegreeGrader {
	
	// Average grade of taught courses
	public double modAverage;
	
	// Average grade of research courses
	public double ismAverage;
	
	//Number of failed course
	public int compFailedCredits;
	public int outrightFailedMods;
	
	// Signifies if it is the first or second research course
	public double first;
	public double second;
	
	//Counting variable for loops
	public int poorGrades;
	
	//Array to hold marks from taught modules
	double[] modGrades = new double [9];
	
	/**
	 * Constructor for class
	 * @param modAverage
	 * @param ismAverage
	 * @param compFailedCredits
	 * @param outrightFailedCredits
	 */
	public DegreeGrader(double modAverage, double ismAverage,
			int compFailedCredits, int outrightFailedCredits)
	{
		this.modAverage = modAverage;
		this.ismAverage = ismAverage;
		this.compFailedCredits = compFailedCredits;
		this.outrightFailedMods = outrightFailedMods;; 
	}
	
	/**
	 * 
	 * {@summary} Code sums all values from elements in array and takes the average 
	 * {@summary} for the taught courses
	 * @return the average of taught courses
	 */
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
		
		   getValidDegree();
		   return modAverage;
		   
	}
	
	/**
	 * 
	 * @return The number of failed courses that can be applied to the degree
	 */
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
	
		// If it is the first or second research course
		if(first >= 40 && first < 50 || second >= 40 && second < 50 )	
		{	
			compFailedCredits++;
        } 
		
		
		return compFailedCredits *= 15;
		
	}
	
	/**
	 * 
	 * @return Returns the number of failed courses that cannot be applied
	 */
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
	
	
	/**
	 * 
	 * @return Average of research courses
	 * {@summary} Takes the weighted values of the courses since the second is worth more credit
	 */
	public double getISMAverage()
	{
		System.out.println("Please input your grade for the 1st research module (15 credits)");
		Scanner sc = new Scanner(System.in);

		first = sc.nextDouble();
		
		
		System.out.println("Please input your grade for the 1st research module (30 credits)");
		second = sc.nextDouble();
		//second = second * (30/45);
		
		ismAverage = ((first *.33) + (second*.66));
		
		getValidDegree();
		return ismAverage;
		
	}
	
	/**
	 * {@summary} Calls to other void method for ease of testing 
	 * {@summary} Essentially, you break into intervals and apply the business logic
	 */
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
				ismAverage >= 60 && ismAverage <= 69 &&
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
	
	/**
	 * {@summary} Method just confirms values and aided in debugging
	 */
	public void unitTest()
	{
		System.out.println("The average of your taught courses is " + modAverage + ".");
		System.out.println("The average of your research courses is " + ismAverage + ".");
		System.out.println(" The number of your failed courses are " + outrightFailedMods + ".");
		System.out.println("The number of your courses that have a mark less than 40 are " 
		                    + poorGrades + ".");		
	}
	
	/**
	 * {@summary} This is the most central method 
	 * {@summary} It runs the loop at least once and provides the ranking of the degree
	 * {@summary} and additional information. User input can be used to break the loop
	 * {@summary} Validation of input is baked in from the gradeDegree() method
	 * {@summary} If invalid input is from end-user they are prompted to correct it.
	 */
	
	public void startDegreeGrading()
	 {
		
		 System.out.println("*********** Degree Classification Program *********");
		 
		 do{
			 
			 gradeDegree();
			 unitTest();
			 
			 System.out.println("Please input y for 'Yes' or n for 'No'.");
			 Scanner sc = new Scanner (System.in);
			 
		     if(sc.next().equalsIgnoreCase("N") == true)
		     {
		    	 System.out.println("Complete. Thank you.");
		    	 break;
		     }
		    	
		     else
		     {
		    	 System.out.println("Continue grading");
		     }
		    
		 } while(modGrades.length == 9);
		 
	 }
	
	/**
	 * {@summary} Provides a check on data from input from end-user
	 * {@summary} If invalid, they are prompted to correct it.
	 */
	public void getValidDegree()
	{
		for(int i = 0; i < modGrades.length; i++)
		{
			if(modGrades[i] > 100 || modGrades[i] < 0)
			{
				System.out.println("You seem to be incorrectly input data through inputting " + 
			      modGrades[i] + " Please correct your input");
				Scanner sc = new Scanner(System.in);
						modGrades[i] = sc.nextDouble();
			}
		}	
			
	       if(first > 100 || first < 0 && second > 100 || second < 0)
	       {
	    	   System.out.println("You seem to be incorrectly input data.\n"
						+ "Please correct your input");
	    	   Scanner sc = new Scanner(System.in);
	    	   first = sc.nextDouble();
	    	   second = sc.nextDouble();
	    	   
	       }
	       
		}
	}
	

	
	
