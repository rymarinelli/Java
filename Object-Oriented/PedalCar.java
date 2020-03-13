   import java.util.Random; 
   import java.util.concurrent.ThreadLocalRandom;
   
   public class  PedalCar extends ElectricCar implements Generate,Fitness 
	{ 
    	final double solarPower = 12.5;
      private double pedalPower;
      private long fitness;
      final double averageCommute = 32;
      
      // Models the amount of speed that can be picked up with out the additional energy from a batter
         public long getFitness()
       {   Random rand = new Random();
           fitness = ThreadLocalRandom.current().nextLong(10,15);
           return fitness;
       }
       // base power that is stored in the vechicle
      public double setpedalPower(double pedalPower)
       {
         return this.pedalPower = pedalPower;
       }
       
    
       public double getpedalPower()
       {
         if (fitness <= 12.5){
            return pedalPower;
           }
           
          else{
            return pedalPower + (fitness - pedalPower);
              }
       }
      
      public double generatePower()
       {
        return solarPower + pedalPower;
       }
      
  	   public int getModel()
       {
           return 2018;
       } 
      
      public String getMake()
        {
            return this.make = "Organic Transit Elf";
        }
      
      public double getMaxSpeed()
        {
            return  30;
        }
      
      public double chargeSpeed()
        {
            return  50 + solarPower;
        } 
      
      @Override
      public double getPrice()
        {   super.getPrice();
            return price = 8895;
        }
        
        @Override
        public double compareTo()
        {
           super.compareTo();
               
            if(pedal.getPrice() > solar.getPrice() &&  pedal.getPrice() > hybrid.getPrice() &&
                pedal.getPrice() > wind.getPrice())
            {
              return pedal.getPrice();
            }
            
      @Override  
      public double getDriveTime()
        { 
           super.getDriveTime();
           return  (45/averageCommute);     
        }  
         
   }
   
 }  