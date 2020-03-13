  public  class WindCar extends ElectricCar{
    
      final int averageCommute = 32;
      
     
  	   public int getModel()
       {
           return this.yearModel = 2012;
       } 
      
      public String getMake()
        {
            return this.make = "Nemesis";
        }
      
      public double getMaxSpeed()
        {
            return this.maxSpeed = 151;
        }
      
      public double chargeSpeed()
        {
            return  this.chargeSpeed = 125;
        } 
      
      @Override
      public  double getPrice()
        {   super.getPrice();
            return price = 989817.75;
        }
        
      public double getDriveTime()
        {
           return  this.driveTime = 150/averageCommute;     
        }  
         
        @Override
        public double compareTo()
        {
           super.compareTo();
               
            if(wind.getPrice() > solar.getPrice() &&  wind.getPrice() > hybrid.getPrice() &&
                wind.getPrice() > pedal.getPrice())
            {
              return wind.getPrice();
            }
              
  }
  
}  
   
   
   
 
 
          
         


