/* 
   MultipleStocksSales.java
   Ryan Marinelli
   23 October 2018
   Problem 11 on page 314
   Program finds the profit of stocks. 
*/

import java.util.Scanner;

/* 
   MultipleStocksSales.java
   Ryan Marinelli
   23 October 2018
   Problem 11 on page 314
   Class performs calculations to find the profit for stocks. 
*/

public class MultipleStockSales
{
/*
   profitCalculator method 
   @param method takes the number of shares, the price of the shares, the costs in commissions and sales price as parameters
   @return the method returns profit 
*/   
   public static  double profitCalculator ( double numberOfShares, double purchasePrice, double purchaseCommission, double salePrice, double saleCommission)
   {
      double profit;
      
      profit = ( (numberOfShares*salePrice) - saleCommission) - ( (numberOfShares* purchasePrice) + purchaseCommission);
      
      return profit;
      
   }
/*
   main method calls profit and performs a series of iterations to find profit for multiple stock 
*/      
   
   public static void main (String args [])
   {
   
      Scanner scanner = new Scanner (System.in); 
   
      double numberOfShares, purchasePrice, purchaseCommission, salePrice, saleCommission, profit,total;
      int numberOfTracks; 
      total = 0;
      
      System.out.println("Please enter the number of stocks you want to keep track of:");
      numberOfTracks = scanner.nextInt();
   
   
      for (int currentTrack = 1; currentTrack <= numberOfTracks; currentTrack++)  
      {
         System.out.println("Please enter the number of shares stock " + currentTrack + ":" );
         numberOfShares = scanner.nextDouble();
   
         System.out.println("Please enter the purchase price for stock " + currentTrack + ":");
         purchasePrice = scanner.nextDouble();
                   
         System.out.println("Please enter the commission for the purchase for stock " + currentTrack + ":");
         purchaseCommission = scanner.nextDouble();
   
         System.out.println("Please enter the sale's price for stock " + currentTrack + ":");
         salePrice = scanner.nextDouble();
   
         System.out.println("Please enter the commission for the sale for stock " + currentTrack + ":" );
         saleCommission = scanner.nextDouble();

         profit = profitCalculator(numberOfShares, purchasePrice, purchaseCommission, salePrice, saleCommission);
         total = total + profit;
         }
                  
         if (total < 0)
         {
            System.out.printf ("Unfortuately, you have made a loss. You made a loss of $%.2f. \n", total);
         }
      
         else 
         {
         
         System.out.printf ("It seems like you have invested wisely.You have made a gain of $%.2f", total);
         }
      }  
   }

