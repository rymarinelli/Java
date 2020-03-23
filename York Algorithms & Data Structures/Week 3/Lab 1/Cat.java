import java.util.Scanner;

public class Cat extends Animal{
	int livesLeft;
	String name;
	
	public Cat(int livesLeft, String name)
	{
		super(name);
		livesLeft = 9;
	}
	
	public void setLivestLeft(int livesLeft)
	{
		this.livesLeft = livesLeft;
	}
	
	public int getLivesLeft()
	{
		return livesLeft;
	}
	
	public void loseLife(int livestLeft)
	{
		if(livesLeft > 0)
		{
			livesLeft = livesLeft--;
		}
		
		else {
			System.out.println("Cat is dead");
		}
	}	
	
	public void setName(String name)
	{
	   super.setName(name);
	   System.out.println("What is the name of the cat");
	   Scanner sc = new Scanner(System.in);
	   this.name = sc.nextLine();
	}
	
	public String getName()
	{
		return name;
	}
	
		
	public String toString()
	{
		return "The name of the cat is\t" + name + "." + " He has\t" + livesLeft + " lives left."; 
	}
		
	

}
