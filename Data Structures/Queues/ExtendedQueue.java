public class ExtendedLinkedQueue extends LinkedQueue{

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

public void remove(int count){
}

public boolean swapStart(){

}

public boolean swapEnds(){
}

}
