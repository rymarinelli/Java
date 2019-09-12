/*
*   @author Ryan Marinelli
*   Homework 2
*   CIS 112 
*   Recieved assistence on assignment from tutors at tutor.com 
*/


public class Driver{
  public static void main(String[] args){
  
    PairInterface<String> myPair = new BasicPair<String>("apple", "peach");
    
    System.out.print(myPair.getFirst() + " ");
    System.out.println(myPair.getSecond()); //prints "apple peach"
    
    PairInterface<Integer> intPair = new BasicPair<Integer>(1,2);
    System.out.println(intPair.getFirst() + " " + intPair.getSecond()); //prints "1 2"
   
  }
}
