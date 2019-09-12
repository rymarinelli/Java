
import ch02.stacks.*;

public class ExtendedStack<T> extends ArrayBoundedStack<T> {
  
  /*
  @param returns string of from the stack 
  */ 
  public String toString()   
   {
       String container = "";
  
  		if (isEmpty() == true) {
  			container = "Stack is empty!";
		}
		else {
          for( int i = 0; i < topIndex + 1 ; i++)
       	  {  
         		container += elements[i].toString() + " " ;
       	  }
       
        }
       
       
     return container;
   }
     
   /*
   @param returns the top of the stack to represent the size of the stack
   */
   public int size()
   {
     return (topIndex + 1);
   }
   
   /*
   @param takes count to deter how many times to iterate 
    */
   public void popSome(int count)
   {
     
     if(count > size()){
       throw new StackUnderflowException("PopSome: Attempt to pop more elements than  in Stack");
     } 
     else
     {	
       	for(int i=0; i < count; i++)
            pop();
     }
   }
   
   /*
   @return returns boolean value to control flow
   */
   public boolean swapStart()
   { 
      if(size() < 2) 
      {
         return false;
      }
      
      else
      {
            T temp = elements[topIndex ];
            elements[topIndex  ] = elements[topIndex -1];
            elements[topIndex-1  ] = temp;
            return true;
      }
   
   }
   
   /*
   @return returns the top of the stack
   */ 
   public T poptop()
   {
      if(isEmpty()){
        	throw new StackUnderflowException("Top attempted on an empty stack.");
      }
      T topElement = elements[topIndex];
     pop();
     return topElement; 
     
      
   }
   
  
   
}

