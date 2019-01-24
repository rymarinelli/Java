/*
   PresentValue.java
   Ryan Marinelli
   23 October 2018
   Problem 16 on page 315
   Program finds present value. 
*/



/*
   PresentValue.java
   Ryan Marinelli
   23 October 2018
   Problem 16 on page 315
   Class performs calculation of present value  
*/


public class PresentValue
{

/*
   main method calls other methods to perform calculations
   @return method prints the present value

*/
  

   public static void main (String [] args)
   {
      double presentValue, futureValue , annualInterstRate, numberOfYears;
      System.out.printf("$%,.2f",presentValue(10000, 5 , 10));   
   
   }
   
 /*
   main method calls other methods to perform calculations
   @param method takes the amount of money that is wanted in the future, the interest rate, and the number of years needed
   @return method returns the present value

*/  
   
    public static double presentValue(double futureValue, double annualInterstRate, double numberOfYears)
   {
      annualInterstRate = annualInterstRate / 100;
      double presentValue;
     
      presentValue = futureValue / Math.pow( (1 + annualInterstRate),numberOfYears);
      
      return presentValue;
 
  
   }
   
   
} 