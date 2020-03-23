
import java.util.*;
public class ModuleGrader {
	
	// grades of students
	private int mark;
	
	/**
	 * @return mark to see the value 
	 * @param mark
	 */
	public ModuleGrader(int mark)
	{
		this.mark = mark;
	}
	
	/**
	 * 
	 * @param mark
	 * @return
	 */
	public int setMark(int mark)
	{  
		return this.mark = mark;
	}
	
	/**
	 * 
	 * @return current value of mark
	 */
	public int getMark()
	{
		return mark;
	}
	
	/**
	 * 
	 * @param mark
	 * @return string for the classification of the module
	 */
	public String gradeModule(int mark)
	{
	 
	 while(mark >= 0 && mark < 100)
	{
		 if(mark >= 0 && mark <= 39)
		 {
			 return "Outright fail";
		 }
	 
		 else if (mark >= 40 && mark < 50)
	 	 {
			 return "Compensatable fail";
	 	 }
	 
		 else if (mark >= 50 && mark < 60)
		 {
			 return "Satisfactory";
		 }
	
		 else if (mark >= 60 && mark < 70)
		 {
			 return "Good";
		 }
	 
		 else if (mark >= 70 && mark <= 100)
		 {
			 return "Excellent";
		 }	
	 
		 else 
		 {
			 System.out.println("Please select a new value");
			 Scanner sc = new Scanner (System.in);
			 mark = sc.nextInt();
			 
		 }
	 
		 
		}
	
	         return "Value updated";
	}	
	
	/**
	 * 
	 * @param mark
	 * @return a boolean value to determine if a mark is valid
	 */
	 public boolean  getValidModuleMark(int mark)
	 {
		 if(mark > 0 && mark <= 100)
		 {
			 System.out.println("Information is valid");
			 return true;
		 }
		 
		 else 
		 {
			 	while(mark > 100 || mark < 0)
			 	{
			 		System.out.println("Please re-input information");
			 		System.out.println("You seem to have input an invalid number");
			 		Scanner sc = new Scanner(System.in);
			 		mark = sc.nextInt();
			 		gradeModule(mark);
			 	}
			 	
			 	System.out.println("New information is valid");
			 	return true;
		 }
		 
	 }
	 
	 
	 public void startModuleGrading()
	 {
		 
		 System.out.println("*********** Module Grading Program *********");
		 
		 //Runs through loop once to input data at leaste once   
		 do{ 
			 System.out.println("Please input marks to grade");
			 Scanner sc = new Scanner(System.in);
			 setMark(sc.nextInt());
			 System.out.println("Your grade is " + gradeModule(getMark()) + ".");
			 
			 System.out.println("Would like to continue grading?");
			 System.out.println("Please input y for 'Yes' or n for 'No'.");
			 
		     if(sc.next().equalsIgnoreCase("N") == true)
		     {
		    	 System.out.println("Finished grading. Thank you.");
		    	 break;
		     }
		    	
		     else
		     {
		    	 System.out.println("Continue grading");
		     }
		    
		 } while(getValidModuleMark(getMark()) == true);
		 
	 }
}
