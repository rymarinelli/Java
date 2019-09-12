package week09;

public class SortedLinkedListNode<Integer, V> {
	int key;
	V value;
	
	public SortedLinkedListNode( int key, V value){
		this.key = key;
		this.value = value;
	}
	
	//Method to return the key and value of the list
	public String toString(){
		String ans = "(Key:" + key + " Value:" + value +")\n";
		return ans;
	}
}