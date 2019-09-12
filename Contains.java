 import support.LLNode;
 
  public class Contains{
  
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

}
