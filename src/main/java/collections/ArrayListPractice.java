package collections;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(); // Declare and initialize the ArrayList
        
        al1.add(5); // Adds 5 to index 0
        al1.add(1, 10); // Adds 10 at index 1
        al1.add(0, 60); // Equivalent to addFirst
        al1.add(80); // Equivalent to addLast

        al1.remove(0); // Equivalent to removeFirst
        al1.remove(al1.size() - 1); // Equivalent to removeLast

        System.out.println("Final List: " + al1);
        System.out.println("Size of List: " + al1.size());
        System.out.println("First element: " + al1.get(0)); // May throw an error if list is empty
    }
}
