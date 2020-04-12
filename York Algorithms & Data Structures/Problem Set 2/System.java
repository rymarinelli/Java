
public class System {
	
	private String make;
	private String model;
	private int speed; 
	private int memorySize;  //in MB
	private double hardDiskSize;  //in GB
	private double purchaseCost;
	
	public System(String make,String model, int speed)
	{
		this.make = make;
		this.model = model;
		this.speed = speed;
	}
	
	
	public void setMemory(int memorySize)
	{
		this.memorySize = memorySize;
	}
	
	public void setHardDisk(double hardDiskSize)
	{
		this.hardDiskSize = hardDiskSize;
	}
	
	public void setPurchaseCost(double purchaseCost)
	{
		this.purchaseCost = purchaseCost;
	}
	

	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getProcessorSpeed()
	{
		return speed;
	}
	
	
	public String displayDetails()
	{
		
		return "The make is " + 
				make +  ".\n" + "The model is " +  model + ".\n" +  
				"The speed is " + speed + ".\n" + "The size of the memory is "
						+ memorySize + ".\n" + "The size of the hard desk " +
						hardDiskSize + ".\n" + "The cost of the purchase is " +
						purchaseCost + ".\n";
	}
	
	public String checkHDStatus()
	{
	   if(hardDiskSize  >= 2)
	   {
		  return "OK"; 
	   }
	   
	   else
	   {
		  return "low";
	   }
	
	}
		
	
	
	
	public boolean goodMemorySize()
	{
		if(memorySize >= 128)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	  
	}
	
	
	public String diagnoseSystem()
	{   
		return "Hard disk size = " + checkHDStatus() + "\n" +
				"Memory size OK = " + Boolean.toString(goodMemorySize()) + "\n";
	}
	
	public String displaySystemProperties()
	{
		 String arch = java.lang.System.getProperty("os.arch");
		 String os  = java.lang.System.getProperty("os.version");	
		 String user  = java.lang.System.getProperty("user.name");	
		 String javaVersion  = java.lang.System.getProperty("java.version");	
		 String osName = java.lang.System.getProperty("os.name");	
		 String message;
		 
		 if(osName.equals("Windows 10") == true)
		 {
			 message = osName + " is a good Operating System!";
		 }
		 
		 else if(osName.equals("Linux"))
		 {
			 message = osName + " is not the best Operating System!";
			 
		 }
		 
		 else {
			 message = osName + " is an acceptable operating System!";
		 }
		 
		 
		 return  "The Operating System architecture is " + arch + ".\n" +
		 		 "The Operating System name is " + osName + ".\n" +
		 		 message + "\n" +
		 		 "The Operating System version is " + os + ".\n" +
		 		 "The user account name is " + user + ".\n" +
		 		 "The java version is " + javaVersion + ".\n";
		
	}
	
	public void printMenu()
	{
		java.lang.System.out.println("Please select a choice");
		java.lang.System.out.println("Choice 1 – Print System Details\n" +
		"Choice 2 - Display System Properties\n" +
		"Choice 3 – Diagnose System\n" +
		"Choice 4 – Set Details\n" +
		"Choice 5 – Quit the program\n"); 
	}

	
}	

