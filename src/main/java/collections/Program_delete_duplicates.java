package collections;


import java.util.Arrays;
import java.util.LinkedList;


public class Program_delete_duplicates {

	public static void main(String[] args) {
		LinkedList<Integer> L = new LinkedList<>(Arrays.asList(4, 5, 3, 3, 4, 5, 8, 8, 8, 0, 9, 8, 10));
		LinkedList<Integer> result = new LinkedList<>();
		for (int i = 0; i < L.size(); i++) {		
			int currentNumber = L.get(i);
			int count = 0;
			for (int j = 0; j < L.size(); j++) {
				if (currentNumber == L.get(j)) {
					count++;
				}
			}
			if (count == 1) {
				result.add(currentNumber);
			}
		}
		System.out.println("Unique elements: " + result);
	}
}
