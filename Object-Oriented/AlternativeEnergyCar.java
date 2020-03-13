abstract public class AlternativeEnergyCar implements Generate, Comparable{

  protected int      yearModel;
  protected String        make;
  protected double    maxSpeed;
  protected double chargeSpeed;
  protected double       price;
  protected double   driveTime;


  /**
  *<p> Method is a constructor </p>
  * @param Constructor takes the model, make, the max speed of the car, and the charging speed as parameters 
  */
   public AlternativeEnergyCar(int yearModel, String make, double maxSpeed, double chargeSpeed, double price, double driveTime)
  {
        this.yearModel = yearModel;
        this.make = make;
        this.maxSpeed = maxSpeed;
        this.chargeSpeed = chargeSpeed;
        this.price = price;
        this.driveTime = driveTime; 

  }

  /**
  * <p> Method sets the year of the model </p>
     @param takes the year of the model
  */
   public void setyearModel ( int yearModel)
  { 
     this.yearModel = yearModel;
  }

  /** <p> Method gets the year model </p>
  * @return method returns the model of the year
  */
   public int getyearModel(   )
  {
     return yearModel;

  }

  /**<p> Method sets the make of the car </p>
     @param takes the make of the car as a String
     @return returns the make 
  */ 
   public void setMake(String make )
  {
     this.make = make;
  }

  /** <p> Method gets the make of the car </p>
    @return Returns the make of the car 
  */ 
  public String getMake()
  {
        return make;
  }

  /** <p> Method sets the speed of the car </p>
    @param Takes the max speed of the car in mph
    @return returns max speed of the car in mph
  */
  public void setMaxSpeed(double maxSpeed)
  {
     this.maxSpeed = maxSpeed;   
  }

  /** <p> Method gets the max speed of the car </p>
  *  @return Method returns the max speed of the car in mph
  */
  public double getMaxSpeed()
  {
     return maxSpeed;
  }

  /** <p> Method sets the speed of charging for electric cars </p>
     @param Takes the amount of volts per hour
  */
  public void setChargeSpeed(int chargeSpeed)
  {
     this.chargeSpeed = chargeSpeed;
  }

  /** <p> Method gets the charge speed </p>
   @return Returns the volts per hour stored in a car
  */
  public double getChargeSpeed()
  {
     return chargeSpeed;
  }

  /** </p> Method sets the price of a car </p>
     @param Takes the price of a car in USD
  */
  public void setPrice (double price)
  {
     this.price = price;
  }

  /** <p> Method gets the price of a car </p>
  *   @return Returns the price of the car 
  */
  public double getPrice()
  {
     return price;
  }

  public String  toString()
  {
      return "The" + make + "is" + price;
  }
  
  public void setDriveTime(double driveTime)
  {
      this.driveTime = driveTime;
      
  }
  
  public double getDriveTime()
  {
       return driveTime;
  }
  
  public double generatePower(){
   
    return chargeSpeed * driveTime; 
  }
  
  
        AlternativeEnergyCar solar = new SolarCar(); 
        AlternativeEnergyCar wind = new WindCar();
        AlternativeEnergyCar pedal = new PedalCar();
        AlternativeEnergyCar hybrid = new HybridCar();
    
    
 public double compareTo( AlternativeEnergyCar solar,  AlternativeEnergyCar wind, 
                          AlternativeEnergyCar pedal,  AlternativeEnergyCar hybrid){
  
             if(wind.getPrice() > solar.getPrice() &&  wind.getPrice() > hybrid.getPrice() &&
                wind.getPrice() > pedal.getPrice())
            {
              return  wind.getPrice();
            }
       
            if (solar.getPrice() > hybrid.getPrice() && solar.getPrice() > wind.getPrice() &&
                solar.getPrice() > pedal.getPrice() )
            {
              return solar.getPrice();
            }
       
            if ( hybrid.getPrice() > pedal.getPrice() && hybrid.getPrice() > solar.getPrice() &&
                 hybrid.getPrice() > wind.getPrice())
            {
              return hybrid.getPrice();
            }
       
            else{
              return pedal.getPrice();
           }
       

 }
}
