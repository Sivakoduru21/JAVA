package collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		
		Vector v1 = new Vector(); // increase capacity 100 percent
		v1.add("shiva");
		v1.add("isha");
		v1.add("pratik");

		Vector v2 = new Vector();
		v2.add("karthik");
		v2.add("indhu");
		v2.add("alex");

		v1.addAll(0, v2);
		v1.set(1,"satish");
		v1.set(2,"vamika");

		System.out.println(v1.size());
		System.out.println(v1.capacity());

		System.out.println(v1.get(3));
		System.out.println(v1.remove(0));

		System.out.println(v1.removeAll(v2));
		System.out.println(v1);
		System.out.println(v1.contains("shivam"));
		System.out.println(v1);
		Object arr[]= v1.toArray();
		System.out.println(Arrays.toString(arr));
		Object arr2[]= new Object[] {10,20,30,40,50};   //convert arr to list
		Vector v7 = new Vector(Arrays.asList(arr2));
		System.out.println(v7);
	}

}
