package week09;

//Ryan Marinelli
// Week 9
// CIS 112
// Unsorted Array Implementation 
import java.util.*;

public class UnsortedArrayPQ{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Priority Queue? ");
		int size = sc.nextInt();
		UnsortedArrayPQ pqi = new UnsortedArrayPQ(size);
		//Size Test
		System.out.println("Size of the queue is " + pqi.size());
		System.out.println("Enter " + size + " elements you want in your PQ: ");
		//Enqueue Test
		for(int i=0; i<size; i++){
			pqi.enqueue(sc.nextInt());
		}
		//isFull Test
		boolean isFull = pqi.isFull();
		if(isFull) {
			System.out.println("Priority Queue is Full");
		}
		//Dequeue Test
		for(int i=0; i<size; i++){
			pqi.dequeue();
		}
	}
	
	private Comparable[] pq;
	private int index;
	
	public UnsortedArrayPQ(int size){
		pq = new Comparable[size];
	}
	
	public int size() {
		return pq.length;
	}
	
	public boolean isFull() {
		return index == pq.length;
	}
	
	//enqueue elements in the queue
	public void enqueue(Comparable item ){
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}
		pq[index] = item;
		index++;
		System.out.println("Element added: "+item);
	}
	
	//Dequeue method
	public Comparable dequeue(){
		if(index == 0){
			System.out.println("Queue is empty");
			return null;
		}
	
		int maxIdx = 0;
		for (int i=1; i<index; i++) {
			if (pq[i].compareTo(pq[maxIdx]) > 0) {
				maxIdx = i;
			}
		}
		Comparable result = pq[maxIdx];
		System.out.println("Removing element: " + result);
		index--;
		pq[maxIdx] = pq[index];
		return result;
	}
}