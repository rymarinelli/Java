    public class SolarCar  extends ElectricCar implements Generate,Comparable
	{ 
    	final double solarPower = 11;
      final int averageCommute = 32;
      
      
      public double generatePower()
       {  super.generatePower();
          return solarPower;
       }
      
  	   public int getModel()
       {
           return 2019;
       } 
      
      public String getMake()
        {
            return this.make = "solarViSono";
        }
      
      public double getMakeSpeed()
        {
            return  86.992;
        }
      
      public double chargeSpeed()
        {
            return  50 + solarPower;
        } 
      
      @Override
      public double getPrice()
        {   super.getPrice();
            return price = 28823.92;
        }
        
      public double getDriveTime()
        {
           return  158.45/averageCommute;     
        }  
        
        @Override
        public double comapareTo()
        {
           super.compareTo();
              
            if (solar.getPrice() > hybrid.getPrice() && solar.getPrice() > wind.getPrice() &&
                solar.getPrice() > pedal.getPrice() )
            {
              return solar.getPrice();
            }
       
          
         }

           
         
   }