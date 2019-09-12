package week09;

//Ryan Marinelli
// Week 9
// CIS 112
// Sorted Linked List Implementation 

import java.util.*;

public class SortedLinkedListPQ<K, V> {
	public static void main(String[] args){
		SortedLinkedListPQ<Integer,Integer> pq = new SortedLinkedListPQ<Integer,Integer>();
		//isEmpty Test
		System.out.println("Check isEmpty function: " + pq.isEmpty());
		//Enqueue Test
		System.out.println("Adding elements with key and value: ");
		pq.enqueue(1, 90);
		pq.enqueue(5, 100);
		pq.enqueue(4, 29);
		pq.enqueue(0, 34);
		pq.enqueue(2, 70);
		pq.enqueue(3, 40);
		//Size Test
		System.out.println("Size of the Priority Queue: " + pq.size());
		//Dequeue Test
		System.out.println("List Printed in a Decreasing Sorted Order: ");
		while(!pq.isEmpty()) {
			System.out.print(pq.dequeue());
		}
	}
	
	LinkedList<SortedLinkedListNode> list = new LinkedList<SortedLinkedListNode>();
	int count = 0;
	
	//Enqueue Method
	public SortedLinkedListNode enqueue( int key, V value ){
		SortedLinkedListNode node = new SortedLinkedListNode(key, value);
		list.addFirst(node);
		count++;
		System.out.print("Element with key: " + key + " and value: " + value + " added!\n");
		Collections.sort(list, new Comparator<SortedLinkedListNode>() {
			@Override
			public int compare(SortedLinkedListNode o1, SortedLinkedListNode o2) {
				return  o2.key - o1.key;
			} } );
		return list.getFirst();
	}
	
	//Dequeue Method
	public SortedLinkedListNode dequeue(){
		if( list.size() == 0 ) {
			System.out.println("Queue is empty");
			return null;
		}
		SortedLinkedListNode node = list.remove(0);
		count--;
		return node;
	}
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
}
