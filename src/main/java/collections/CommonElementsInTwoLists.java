package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CommonElementsInTwoLists {
    public static void main(String[] args) {
    	List<Integer> l1 = new LinkedList<>(Arrays.asList(10, 20, 30));
        List<Integer> l2 = new LinkedList<>(Arrays.asList(20, 30, 40, 50));

        // Create a new list to store common elements
        
        LinkedList<Integer> l3 = new LinkedList<>(l1);

        // Retain only common elements
        
        l3.retainAll(l2);

        System.out.println("Common elements: " + l3);
    }
}
