import ch02.stacks.LinkedStack;
import support.LLNode;
import ch02.stacks.StackUnderflowException;

/*
* 
*
* 
* 
*/
 
public class ExtendedLinkedStack<T> extends LinkedStack<T>{

//Referenced Lecture "Linked Stack Code Walkthrough" for toString method
public String toString(){

   String s = "" ;

   LLNode<T> temp = top;
  
   if(top == null){	
      s = "Stack is Empty!";
   }else{	
  
       while(temp != null)
       {
          s += temp.getInfo().toString();
  
   	      s += System.lineSeparator();
  
          temp = temp.getLink();
       }
   }
   return s;
} 

/*
@return returns the size of the stack
*/ 
public int size(){

LLNode<T> temp = top; 

int i = 0;

 	while(temp != null)
 	{
   		i = i + 1;
  		temp = temp.getLink();
 	}
 
 	return i; 
}

/*
@param count is the number of pops
*/
public void popSome( int count){
  for( int i= 0; i<count; i++){
    
    	if(top == null){
         	throw new StackUnderflowException("Top attempted on an empty stack.");
        }else{
			top = top.getLink();
      
   }
 }

}
/*
@return shows if there are two more stacks
*/
public boolean swapStart(){
    boolean retValue = false;
	if(top.getLink() != null)
   {
     retValue = true;
     LLNode<T> Node3 = top.getLink();
     LLNode<T> Node2 = Node3.getLink();
     LLNode<T> Node1 = Node2.getLink();

     Node3.setLink(Node1);
     Node2.setLink(Node3);
     top = Node2; 
 
  
	} 
    return retValue;
}

/*
@return return the top of the stack 
*/
public T poptop(){
 LLNode<T> temp = top;
 top = top.getLink(); 
 return (T) temp; 

}


public int numEvens(LLNode<Integer> list){
int count = 0;
if ( list == null)
{
return count;
}

else{
   if(list.getInfo()%2 ==0){
   count = count +1;
   }

   return count + numEvens(list.getLink());

   }
  }
  
  
  public boolean contains(int target, LLNode<Integer> list){

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



public static LLNode<Integer> remove(LLNode<Integer> ls, int val)

{


if (ls == null)
	return null;

if (ls.getInfo() == val)

remove(ls.getLink(), val);

 else if (ls.getInfo() != val) {

	 ls.setLink(remove(ls.getLink(), val));
	 
 }
	 



return ls;

	}

  
  


}
