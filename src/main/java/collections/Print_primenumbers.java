package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Print_primenumbers {

	public static void main(String[] args) {
		/*
		 * LinkedList<Integer> prime = new LinkedList<Integer>(); for (int n = 1; n <=
		 * 50; n++) { int count = 0; for (int i = 1; i <= n; i++) { if (n % i == 0) {
		 * count++; } } if (count == 2) { prime.add(n); } } System.out.println(prime);
		 */
		
		LinkedList<Integer> list = new LinkedList(Arrays.asList(10,20,30,40,50,60));
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
	}
}
