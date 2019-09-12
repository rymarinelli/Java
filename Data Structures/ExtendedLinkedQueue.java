import ch04.queues.LinkedQueue;
import support.LLNode;
import ch04.queues.QueueUnderflowException;

/*
* @author Ryan Marinelli
* @since  14 July 2019
* CIS 112
* Received assistance from tutors at Tutor.com
*/

public class ExtendedLinkedQueue<T> extends LinkedQueue<T>{

/*
* @return returns a string to be printed to user
*/
public String toString(){
  String s = "" ;

   LLNode<T> temp = front;
  
   if(front == null){	
      s = "The queue is Empty!";
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
* @param takes the amount of elements to removed
*/
public void remove(int count){

 for( int i= 0; i<count; i++){
    
    	if(front == null){
         	throw new QueueUnderflowException("Remove attempted on an empty queue.");
        }else{
			front = front.getLink();
      
   }
 }


}

/*
* @return returns a bool to see if the method was correctly implemented
* @return if true, it is done correctly
*/
public boolean swapStart(){

boolean retValue = false;
	if(numElements >= 2)
   { 
    LLNode<T> temp, second ;
     
     temp = front;
     second = front.getLink();
     temp.setLink(second.getLink());
     
     second.setLink(temp);
     
     front = second;
     
     retValue = true;
  
	} 
    return retValue;
    
}
/*
@return returns a bool to see if the method was correctly implemented
@return if true, it is done correctly
*/

public boolean swapEnds(){
   if(numElements >= 2)
   {
     LLNode<T> Node1, Node2, Node3;
     
     Node1 = front.getLink();
     Node2 = front;
     Node3 = front;
     front = rear;
     front.setLink(Node1);
     for( int i= 0; i < numElements - 2; i++){
    		Node3 = Node3.getLink();
     }
     Node3.setLink(Node2);
     rear = Node3.getLink();
     rear.setLink(null);
     return true;
   }
    
   return false;
  
   }

}