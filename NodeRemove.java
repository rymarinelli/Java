import support.LLNode;


public class RemoveNode{
public static LLNode<Integer> remove(LLNode<Integer> ls, int val)

{

    // return if the given list is null

   // if node has info equal to val, skip this node and return whatever is returned from its recursive call

    // if node has info NOT equal to val, return this node with its connection to whatever is returned from its recursive call

           if (ls == null)

               return null;

           if (ls.getInfo() == val)

                remove(ls.getLink(), val);

           else if (ls.getInfo() != val) {

                ls.setLink(remove(ls.getLink(), val));

           }

            return ls;

	}

}