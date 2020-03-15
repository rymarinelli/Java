
/**
 * AlienShip - Unit 4 exercise.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class KlingonShip
{
	double photonPower = 45;
	int threatFactor = 7;
	double cosmicProximity = 20.6;
	double dangerLevel;
	
	//Put the displayKlingonDetails()and getDangerLeve() methods below.
	
	public void displayKingonDetails()
	{
		System.out.println(photonPower);
		System.out.println(threatFactor);
		System.out.println(cosmicProximity);
	    System.out.println(getDangerLevel(photonPower, threatFactor, cosmicProximity));
	}
	
	public double getDangerLevel(double photonPower, int threatFactor, double cosmicProximity)
	{ 
	    dangerLevel = (photonPower * threatFactor)/cosmicProximity;
	    return dangerLevel;
	
	}
	
	public void promptSettings()
	{
	  System.out.println("What is your photon power?");
	  Scanner sc = new  Scanner(System.in);
	  photonPower =  sc.nextDouble();
	  
	  System.out.println("What is your threat factor?");
	  threatFactor = sc.nextInt();
	  
	  System.out.println("What is your cosmicProximity?");
	  cosmicProximity = sc.nextDouble();
	  
	  sc.close();
	} 
}
