
import support.LLNode;

public class EvenNumber{

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
}   