package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problems2_on_linkedlist {

	public static void main(String[] args) {

		// 4.print repeated and word and number of times it is repeated

		/*
		 * LinkedList<String> l1 = new LinkedList<>( List.of("baby", "soap", "hair",
		 * "baby", "soap", "baby", "hair", "baby")); LinkedList<String> processedWords =
		 * new LinkedList<>(); for (int i = 0; i < l1.size(); i++) { String repeatedWord
		 * = l1.get(i); int count = 0; if (!processedWords.contains(repeatedWord)) { for
		 * (int j = 0; j < l1.size(); j++) { if (repeatedWord.equals(l1.get(j))) {
		 * count++; } } processedWords.add(repeatedWord);
		 * System.out.println("Repeated word is: " + repeatedWord);
		 * System.out.println("Word is repeated for " + count + " times"); } }
		 * System.out.println("processedword: "+ processedWords);
		 */
		
		//5.program to print a highest number of duplicate elements
		LinkedList<Integer> L = new LinkedList<Integer>(Arrays.asList(4,5,3,4,5,8,8,8,0,9,8,10));
		
		int repeatednumber=8;
		int count=0;
		for (int i = 0; i <L.size(); i++) {
			
			if(repeatednumber==L.get(i))
			{
				repeatednumber = L.get(i);
				count++;
			}
		}
		System.out.println("repeated number is: " +repeatednumber);
		System.out.println("number of times is: " +count);
	}
}
