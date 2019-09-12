import support.LLNode;


public class removeVal{
	
	
public static LLNode<Integer> remove(LLNode<Integer> ls, int val)

{


if (ls == null)
	return null;

if (ls.getInfo() == val)

remove(ls.getLink(), val);

 else if (ls.getInfo() != val) {

	 ls.setLink(remove(ls.getLink(), val));
	 
 }
	 



return ls;

	}

}
