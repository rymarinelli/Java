import  java.util.ArrayList;
import java.util.Collections;

public class Driver{

   public static void main(String args[]){
     
    
       
  
        AlternativeEnergyCar solar = new SolarCar();
        
         
        AlternativeEnergyCar wind = new WindCar();
        
  
        AlternativeEnergyCar  pedal = new PedalCar();
        
        
        AlternativeEnergyCar hybrid = new HybridCar();
        
       
       System.out.print(solar.compareTo(hybrid));
     
 

   }
   
 }    