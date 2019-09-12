
/*
* Ryan Marinelli
* CIS  112
* Assisted by tutors at tutors.com
*/




package ch05.collections;

public class Driver{
public static void main (String[]args){

 
ExtendedLinkedCollections<String>test = new ExtendedLinkedCollections<String> ();

test.add("first");
test.add("second");
test.add("third");
test.add("four");
test.add("second");
test.add("second");
test.add("four");
test.add("third");

System.out.println(test.toString());
System.out.println(test.count("second"));

test.removeAll("first");

System.out.println(test);

ExtendedLinkedCollections<String>test2 = new ExtendedLinkedCollections<String> ();
test2.add("combinedStringOne");
test2.add("combinedStringTwo");
  
System.out.println(test.combine(test2));

*/
  
SortedLinkedCollection<Integer> test3 = new SortedLinkedCollection<Integer>();
  
 test3.add(1);
 test3.add(2);
 test3.add(7);
 test3.add(3);
 test3.add(5);
 
  
  
 
  
 System.out.println(test3);
 
  



   }

}