package week09;

//Ryan Marinelli
// Week 9
// CIS 112
// UnSorted Linked List Implementation 

import java.util.*;

public class UnsortedLinkedListPQ<K,V>{
	public static void main(String[] args){
		UnsortedLinkedListPQ<Integer,Integer> pq = new UnsortedLinkedListPQ<Integer,Integer>();
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
		System.out.println("List Printed in a Sorted Order: ");
		while(!pq.isEmpty()) {
			System.out.print(pq.dequeue());
		}
	}
	
	LinkedList<UnSortedLLNode> list = new LinkedList<UnSortedLLNode>();
	UnSortedLLNode head;
	int count = 0;
	
	//Enqueue Method
	public UnSortedLLNode enqueue( int key, V value ){
		UnSortedLLNode node = new UnSortedLLNode( key, value);
		list.addFirst(node);
		count++;
		System.out.print("Element with key: " + key + " and value: " + value + " added!\n");
		return list.getFirst();
	}
	
	//Dequeue Method
	public UnSortedLLNode dequeue(){
		if( list.size() == 0 ) {
			System.out.println("Queue is empty");
			return null;
		}
		UnSortedLLNode node = list.remove(getMinIdx());
		count--;
		return node;
	}
	
	public int getMinIdx(){
		int minIdx = 0, idx = 0, temp = 0;;
		int min = list.get(0).key;
		ListIterator<UnSortedLLNode> iter = list.listIterator();
		while( iter.hasNext() ){
			temp = iter.next().key;
			if(min > temp) {
				min = temp;
				minIdx = idx;
			}
			idx++;
		}
		return minIdx;
	}
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
}
