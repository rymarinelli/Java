package ch05.collections;


import ch05.collections.LinkedCollection;
import support.LLNode;
import ch04.queues.QueueUnderflowException;
import ch05.collections.SortedArrayCollection;

public class ExtendedLinkedCollections<T> extends LinkedCollection<T>{
	public void removeAll(T Target){

       location = head;
       previous = head;
       
  
        while (location != null){
            if (location.getInfo().equals(Target)){
                if(location == head){
                 head = head.getLink();
  				 location = head;
                 }  
				else{
                  previous.setLink(location.getLink());
	              location = location.getLink();             
                }
            }
            else{
            	previous = location;
            	location = location.getLink(); 
            }
        }
    }

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

    public int count(T target){

        int counter = 0;

        location = head;

        while (location != null){
            if (location.getInfo().equals(target)){
                 counter = counter + 1; 
            }
            location = location.getLink(); 
        }
        return counter;
    }
    
   public LinkedCollection<T> combine(LinkedCollection<T> other)
   {
      location = head;
      LinkedCollection<T> array = new  LinkedCollection<T> (); 
      while(location != null){
           array.add(location.getInfo());
           location = location.getLink();
       }  
      other.location = other.head;
      while(other.location!=null){
      array.add(other.location.getInfo());
      other.location = other.location.getLink();
      }
      return array;
   }
}





















































