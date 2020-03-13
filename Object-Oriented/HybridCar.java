 public  class HybridCar extends ElectricCar{
    
      final int averageCommute = 32;
      
     
  	   public int getModel()
       {
           return this.yearModel = 2019;
       } 
      
      public String getMake()
        {
            return this.make = "Chevrolet Malibu";
        }
      
      // Max speed without switching too significantly to only gas power
      public double getMaxSpeed()
        {
            return this.maxSpeed = 49;
        }
      
      public double chargeSpeed()
        {
            return  this.chargeSpeed = 136;
        } 
      
      @Override
      public double getPrice()
        {   super.getPrice();
            return price = 22090;
        }
        
      public double getDriveTime()
        {
           return  this.driveTime = 637/averageCommute;     
        }  
        
         @Override
        public double compareTo()
        {
           super.compareTo();
               
            if(hybrid.getPrice() > solar.getPrice() &&  hybrid.getPrice() > pedal.getPrice() &&
                hybrid.getPrice() > wind.getPrice())
            {
              return pedal.getPrice();
            } 
        
         
   }
   
 }
 
 
   

