 import support.LLNode;
 
/*
	What we can do to an LLNode

  public void setInfo(T info){ this.info = info;}
  public T getInfo(){ return info; }
  public void setLink(LLNode<T> link){this.link = link;}
  public LLNode<T> getLink(){ return link;}
    
*/

public class AddValue
{
  
  public void addValue(int value, LLNode<Integer> firstNode)
  {
    	LLNode<Integer> lastNode;
    
		// How to find the last node of our list, given the first node?
    	// * We have to make a loop to see if the link is null
    
        // Now assume that our lastNode variable is set.
        // How do we create a new LLNode, set its content to the given value, add it to the end of lastNode?
    	
        LLNode <Integer>  newNode = new LLNode <Interger> ();
    	newNode.setInfo(value);
 	    
        lastNode.setLink(newNode);		// <-- This is all that's needed to establish the new link.
    
  }

}
