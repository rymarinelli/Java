import  java.util.ArrayList;
import java.util.Collections;

abstract class ElectricCar extends  AlternativeEnergyCar implements Generate,Comparable
   {
      public ElectricCar()
         {
            super(2019,"default", 10, 15.0, 16.0, 14.0);
         }
     
      
       public int getModel(int yearModel)
         {
            return yearModel;
         }
     
       public String getMake(String make)
       {
          return make;
       }
       
       public double getMaxSpeed(double maxSpeed)
       {
         return maxSpeed;
       }
       
       public double getChargeSpeed(double chargeSpeed)
       {
         return chargeSpeed;
       }
       
       public double getPrice()
       {
         return price;
       }
       
       public double getDriveTime(double driveTime)
       {
         return driveTime;   
       }
		 
       
        
       
       

  }
  
