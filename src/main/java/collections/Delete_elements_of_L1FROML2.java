package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Delete_elements_of_L1FROML2 {

	public static void main(String[] args) {
		/*
		 * LinkedList<Integer> list1 = new LinkedList(List.of(4,9,8));
		 * LinkedList<Integer> list2 = new LinkedList(List.of(4,1,9,4,8,0,5,1,8,6)); for
		 * (int i = 0; i < list1.size(); i++) { int currentnumber = list1.get(i); for
		 * (int j = list2.size() - 1; j >= 0; j--) { if(currentnumber==list2.get(j)) {
		 * list2.remove(list2.get(j)); } } } System.out.println(list2);
		 */

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("enter the element");
		 * int n= sc.nextInt(); LinkedList<Integer> list = new
		 * LinkedList(List.of(12,20,30,40,50)); int i = list.indexOf(n);
		 */

		// program to reverse a list
		/*
		 * LinkedList<Integer> list = new LinkedList(List.of(20,3,40,5,60,44,7));
		 * LinkedList<Integer> reversedlist = new LinkedList(); for (int i =
		 * list.size()-1; i>=0; i--) { reversedlist.add(list.get(i)); }
		 * System.out.println(reversedlist);
		 */

		// program to find first non repeating character

		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1, 3, 4, 5));
		int nonRepeatingElement = -1;
		for (int i = 0; i < list.size(); i++) {
			int currentElement = list.get(i);
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == currentElement) {
					count++;
				}
			}
			if (count == 1) {
				nonRepeatingElement = currentElement;
				break;
			}
		}
		if (nonRepeatingElement != -1) {
			System.out.println("First non-repeating element: " + nonRepeatingElement);
		} else {
			System.out.println("No non-repeating element found.");
		}
	}
}