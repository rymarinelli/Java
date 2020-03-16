// File: Test_YorDate.java
/**
 * Test harness for YorDate class
 *
 * @author	Tommy Yuan
 * @version	24 January 2019 */
 
public class Test_YorDate
{
	public static void main(String args[])
	{
		//Create a reference to a YorDate object
		YorDate date1;
			
	    // This creates an object which sets the date to the current date
		 date1 = new YorDate();
		
		//Using the appropriate methods set, set date1 to your birthdate
	     date1.setDay(24);
	     date1.setMonth(06);
	     date1.setYear(1996);
	     int value = 0;
	     
	     System.out.println(date1.getYear() + "/" + value + date1.getMonth() + "/" +  date1.getDay());
	     
		//Using appropriate date1 method(s) display your birthday
		
		
	}
}
