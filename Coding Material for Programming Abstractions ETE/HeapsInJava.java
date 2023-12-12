
// task given an array of integers, u need to create a minHeap and maxHeap

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int arr[] = {10,15,12,13,14};
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i < arr.length; i++){
		    minHeap.add(arr[i]);
		    maxHeap.add(arr[i]);
		}
		
		// printing min and max heaps 
		System.out.println("maxHeap : " + maxHeap);
		System.out.println("minHeap : " + minHeap);
	}
}

/* 
maxHeap : [15, 14, 12, 10, 13]
	15
       /  \
      14   12
     / \ 
    10  13
minHeap : [10, 13, 12, 15, 14]
	10
       /  \
      13   12
     / \ 
    15  14
*/
