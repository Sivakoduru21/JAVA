package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Problems_on_linkedlist {

	public static void main(String[] args) {

		// 1.print sum and average of elements in a list
		LinkedList<Integer> l1 = new LinkedList();
		/*
		 * l1.add(4); l1.add(5); l1.add(0); l1.add(9); l1.add(8); l1.add(10); int sum
		 * =0; int average=0; System.out.println("elemenst in the list are: "+ l1); for
		 * (int i = 0; i < l1.size(); i++) { sum += l1.get(i); } average =
		 * sum/l1.size(); System.out.println("sum of elements: " + sum);
		 * System.out.println("avearage of elemenst: " + average);
		 */

		// 2.sum of even numbers at even positions in a list

		/*
		 * LinkedList<Integer> l2 = new LinkedList<Integer>(List.of(4,5,0,9,8,10)); int
		 * sum=0; for(int i=1;i<l2.size();i+=2) { sum += l2.get(i); }
		 * System.out.println("sum of even numbers: "+ sum);
		 */

		// 3.sum of even numbers
		/*
		 * LinkedList<Integer> l2 = new LinkedList<Integer>(List.of(4, 5, 0, 9, 8, 10));
		 * 
		 * int sum = 0; for (int i = 0; i < l2.size(); i++) { if(l2.get(i)%2==0) { sum
		 * += l2.get(i); }
		 * 
		 * } System.out.println("sum of even numbers: " + sum);
		 */

		// 4.split list into 2 lists
		
		LinkedList<Integer> L = new LinkedList(Arrays.asList(4, 5, 0, 9, 8, 10));
		int middle = L.size()/2;
		LinkedList<Integer> L1 = new LinkedList<Integer>(L.subList(0, middle));
		LinkedList<Integer> L2 = new LinkedList<Integer>(L.subList(middle,L.size()));
		System.out.println("list one: " + L1);
		System.out.println("list two: " + L2);
		
		LinkedList<Integer> myL = new LinkedList<Integer>();
		myL.addAll(L1);
		myL.addAll(L2);
		System.out.println("merging 2 lists: "+ myL);
				
		

	}

}
