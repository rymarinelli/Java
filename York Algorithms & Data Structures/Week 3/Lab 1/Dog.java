import java.util.Scanner;

public class Dog extends Animal{
	
	int exerciseTime; 
	String name;
	
	public Dog(int exerciseTime, String name)
	{
		super(name);
		
	}
	
	
	public void setExerciseTime(int exerciseTime)
	{
		this.exerciseTime = exerciseTime;
	}
	
	public int getExcerciseTime()
	{
		return exerciseTime;
	}
	
	public void setName(String name)
	{
	   super.setName(name);
	   System.out.println("What is the name of the dog");
	   Scanner sc = new Scanner(System.in);
	   this.name = sc.nextLine();
	}
	
	public String getName()
	{
		return name;
	}

	public String toString()
	{
		return "The name of the dog is\t" + name + "." + "He walks for " + exerciseTime
				+ "mins.";
	}
	
}
