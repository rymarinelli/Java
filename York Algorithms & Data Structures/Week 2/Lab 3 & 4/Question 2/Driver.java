import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Shopping test = new Shopping();
		
		
		//test.setItem(sc.nextLine());
		test.addItem("eggs");
		test.addItem("cream");
		test.addItem("fish");
		
		
		System.out.print(test.numberOfItems());
		System.out.println("\n" + test.showItem(2));
		System.out.println("\n" + test.showItem(0));
		
		
		System.out.println("\n\n" + "From the start of the list");
	    test.listItems();

	}

}
