package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s1 = "shiva prasad";      //strings are immutable because when data is changed its address is also get changed
		char[]  c = s1.toCharArray();    //new memory will be craeted for changed data
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		System.out.println("enter the word");
		String word = input.nextLine();
		for (int i = 0; i < word.length() / 2; i++) {
			if (!(word.charAt(i) == word.charAt(word.length() - i - 1))) {
				System.out.println("it is not palindrome");
				return;
			}
			input.close();

		}
		System.out.println("palindrome");
		return;

	}
}
