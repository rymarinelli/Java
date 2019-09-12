/*
* Ryan Marinelli
* CIS 112
* Homework 3
* Referenced tutors at tutor.com for assistance
*/


public class Driver{

public static void main (String [] args){

ExtendedLinkedStack<String>test = new ExtendedLinkedStack<String> ();
   test.push("first");
   test.push("second");
   test.push("third");
   test.push("fourth");
   test.push("fifth");
   test.push("sixth");
   
 System.out.print(test.toString());
   
 System.out.println("The size of the stack is " + test.size());
 
 test.popSome(3);
 System.out.print("The number popped is " + test);
 
 test.swapStart();
 System.out.println(test);

 test.poptop();
 System.out.println(test);  
   
  }
  
  
}