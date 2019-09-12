import ch04.queues.LinkedQueue;
import support.LLNode;
import ch04.queues.QueueUnderflowException;

/*
* @author Ryan Marinelli
* @since  14 July 2019
* CIS 112
* Received assistance from tutors at Tutor.com
*/


public class ExtendedCircularQueue<T> extends LinkedQueue<T>
{
  	// protected LLNode<T> front;     // reference to the front of this queue
  	// protected LLNode<T> rear;      // reference to the rear of this queue
    // protected int numElements = 0; // number of elements in this queue  
/*
* @param takes a generic element from the linked list
* Method calls the super class and re-implements through assigning rear to the link of front
*/
    public void enqueue(T element)
    {
  		super.enqueue(element);
        rear.setLink(front);
    }  
  
/*
*@return returns the element that is to be dequeued to the end of the queue as it is using a circular linked list
*/  
    public T dequeue()
    {
        if (isEmpty())
          throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        else
        {
          T element;
          element = front.getInfo();
          front = front.getLink();
          
          if (front == null)
            rear = null;
          
          numElements--;
          return element;
        }
    }
/*
*@return returns a string to verify that the methods of the queue are being done properly
*/	
	public String toString(){
        String start = " ";
        LLNode current = front;
        while ( current != null ) {
            start += current.getInfo() + ", ";
            current = current.getLink();
            if(current == front)
            	break;
        }
        return start;
    }
}