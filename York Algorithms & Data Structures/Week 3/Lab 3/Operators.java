
public class Operators {
	
	
	
	public static void main(String[] args)
	{
		String command;
		command = args[0];
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		
		switch(command) {
		
		case "add":
				int total = a + b;
				System.out.print(total);
				break;
			
		case "substract":
			int subTotal = a - b;
			System.out.print(subTotal);
			break;
			
		case "multiply":
			int mulTotal = a*b;
			System.out.print(mulTotal);
			break;
			
		case "divide":
			int divTotal = a/b;
			System.out.print(divTotal);
			break;
			
		default:
			System.out.print("Error");
		}
		
			
	}

}
