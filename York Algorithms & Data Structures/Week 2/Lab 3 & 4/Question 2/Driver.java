import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Shopping test = new Shopping();
		Scanner sc = new Scanner(System.in);
		String item = sc.nextLine();
		
		//test.setItem(sc.nextLine());
		test.setItem(item);
		test.addItem(item);
		
		
		
		

	}

}
