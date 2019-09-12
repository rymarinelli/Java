import java.util.Scanner;
import support.LLNode;
import java.util.*; 
/*
* Ryan Marinelli
* Homework 4
* Recieved Help From tutors on Tutor.com
*/

public class Driver<T>{
    public static void main (String args []){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input an integer is that is positive");

        Integer n = sc.nextInt();

        System.out.println(sum(n));

        System.out.println(biPower(n));

        System.out.println(timesFive(n));
  
        LLNode<Integer> list = createList();
  
        System.out.println(numEvens(list));
        System.out.println(contains(5, list));
        System.out.println(contains(0, list));
        printLL(remove(list, 5));


     }
     
// @return Returns the head of the list     
    public static LLNode<Integer>  createList(){
        LLNode<Integer> list= null, node;

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter an integer value (0 to stop): ");
       int value = sc.nextInt();
       LLNode prev = null;
       LLNode head = null;
       
      
      for( int i = 0; i < value ; i++){
       if(i == 0){
         LLNode temp = new LLNode(i);
         head = temp;
         prev = temp;
         }
         
      else{
            LLNode temp = new LLNode(i);
            prev.setLink(temp);
            prev = temp;
         }
      }
      
      return head;
    }

// @return Returns the count of the link list
    public static int numEvens(LLNode<Integer> list){
        int count = 0;
        if ( list == null)
        {
        return count;
        }

        else{
           if (list.getInfo() % 2 == 0){
               count = count +1;
           }

           return count + numEvens(list.getLink());

       }
    }

/*
*@param takes the target and the linked list 
*@return the subset of the linked list 
*/
  public static boolean contains(int target, LLNode<Integer> list){

     if ( list == null) {
         return false;
     }
     else {
         if(list.getInfo() == target){
             return true;
         }
         else {
             return contains(target, list.getLink());
         }
     }
  }

/*
* @param takes the list and the target value
* @return returns a subset of the linked list 
*/
 
public static LLNode<Integer> remove(LLNode<Integer> ls, int val)

{


if (ls == null)
	return null;

if (ls.getInfo() == val)

    return remove(ls.getLink(), val);

 else if (ls.getInfo() != val) {

	 ls.setLink(remove(ls.getLink(), val));
    
 }
	 
   return ls;

	}
   
/*
* @param takes a node to set the head of the linked list 
*/   

public static void printLL(LLNode tmp){
   while(tmp != null){
      System.out.print(tmp.getInfo() + "\t");
      tmp = tmp.getLink();
   }
}

/*
* @param takes an integer to pass through
* @return returns the value per function
*/

  public static int sum(int n){
    if(n == 1)
    {
     return (1);
    }
    else{
     return n + sum(n-1);
    }
    
  }
/*
@param inputs values to be used
@return two to the n power
*/

  public static int biPower(int n){
    if(n==1)
    {
     return (2);
    }
    else{

     return 2*biPower(n-1);
    }
  }

/*
@param n is the value to be used in computation
@return 5*n 
*/ 


  public static int timesFive(int n){
    if(n == 0)
    {
     return 0;
     }
     else{
          return 5 + timesFive(n-1);
       }

    } 


}


