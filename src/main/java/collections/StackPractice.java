package collections;

import java.util.Stack;

public class StackPractice {
	public static void main(String[] args) {
		Stack<String> books = new Stack();
		books.add("english");
		books.add("maths");
		books.push("biology");
		books.add("search");
		books.add(3, "meena");
		System.out.println(books);
		System.out.println(books.pop());
		System.out.println(books.peek());
		System.out.println(books.isEmpty());
		System.out.println(books.capacity());
		System.out.println(books.search("maths"));
	}
}
