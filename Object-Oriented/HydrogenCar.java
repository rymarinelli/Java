
  abstract class HydrogenCar extends AlternativeEnergyCar{
  
    	 public HydrogenCar()
         {
            super(2019, "Toyota Mirai", 111.85, 5.0, 57000.0, 9.75);
         }
        
      
       public int getModel(int yearModel)
         {
            return this.yearModel = 2019;
         }
     
       public String getMake(String make)
       {
          return this.make = "Toyota Mirai";
       }
       
       public double getMaxSpeed(double maxSpeed)
       {
         return this.maxSpeed = 111.85;
       }
       
       public double getChargeSpeed(double chargeSpeed)
       {
         return this.chargeSpeed = 5.0;
       }
       
       public double getPrice()
       {
         return this.price = 57000.0;
       }
       
       public double getDriveTime(double driveTime)
       {
         return this.driveTime = 9.75;   
       }
		
   }   