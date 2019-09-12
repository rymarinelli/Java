
public class Driver{

public static void main (String [] args){

ExtendedLinkedQueue<String>test = new ExtendedLinkedQueue<String> ();
   test.enqueue("first");
   test.enqueue("second");
   test.enqueue("third");
   test.enqueue("fourth");
   test.enqueue("fifth");
   test.enqueue("sixth");
   
 System.out.print(test.toString());
   
 test.remove(3);
 System.out.print(test);

 System.out.println("Now swaping the first two elements " + test.swapStart());
 System.out.println(test);  
  
 System.out.println("Now swaping the rear and front " + test.swapEnds()); 
 System.out.println(test); 
   
  }
  
  
}