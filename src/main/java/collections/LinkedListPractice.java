package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Integer> L1 = new LinkedList<Integer>();
		LinkedList<Integer> L2 = new LinkedList<Integer>();
		ArrayList<Integer> AL1 = new ArrayList();
		AL1.add(100);
		AL1.add(200);
		L1.add(10);
		L1.add(20);
		L1.add(30);
		L1.add(3, 40);
		L1.add(1, 60);
		L2.addAll(AL1);
		System.out.println(L1);
		
		L2.add(300);
		System.out.println(L2);

	}

}
