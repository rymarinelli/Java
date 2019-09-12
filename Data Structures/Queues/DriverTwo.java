 public class DriverTwo{
 
 public static void main (String args []){
 
 ExtendedCircularQueue<String> testTwo = new ExtendedCircularQueue<String> (); 
  
   testTwo.enqueue("first");
   testTwo.enqueue("second");
   testTwo.enqueue("third");
   testTwo.enqueue("fourth");
   testTwo.enqueue("fifth");
   testTwo.enqueue("sixth");
 
 System.out.println(testTwo);
  
 testTwo.dequeue();
 testTwo.dequeue();
 
 System.out.println(testTwo);
 
 }
 
} 
