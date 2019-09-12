package ch05.collections;
import support.LLNode;
import ch05.collections.LinkedCollection;

// extending the interface to gain access to comparable objects and not only methods
public class SortedLinkedCollection<T extends Comparable <T>> extends LinkedCollection<T>{

   //@return Returns String for output
    public String toString(){
       String s = "" ;

       location = head;

       if (location == null){	
          s = "The collection is Empty!";
       }
       else 
       {	

           while(location != null)
           {
              s += location.getInfo().toString();

              s += System.lineSeparator();

              location = location.getLink();
           }
       }
       return s;
   
}


//@Override
//@param takes a generic element to compare
//@return confirms that it is implemented
public boolean add(T element)
  // Adds element to this collection.
  {
    LLNode<T> newNode = new LLNode<T>(element);
    // First case, if there is no node already
    if (head == null){
       head = newNode;
    }    
    else {
    	location = head;
    	LLNode<T> parent = null;
    	int notInserted = 1;
      //If there are nodes, find a place to insert new node while in order
     	while(location != null  && notInserted == 1) {
        
	    	if(location.getInfo().compareTo(newNode.getInfo()) == 1)
     		{
          		// found insertion point
           		if (parent == null) {
            	  	newNode.setLink(head);
              		head = newNode;
           		} else {
               		newNode.setLink(location);
               		parent.setLink(newNode);
           		}
           		notInserted = 0;
     		}
           parent = location;
           location = location.getLink();
        }
       // If inserting at the very last node
          if(notInserted == 1)
      {
        parent.setLink(newNode);
      }
    }
    
     numElements++;
     return true;
   		}
    
 
}
