package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysProblems {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 45, 65, 1000, 23456, 1, 88, 77, 999 };

		/*
		 * //minimum,largest,Second largest values in array Arrays.sort(arr);
		 * System.out.println(Arrays.toString(arr)); int length = arr.length;
		 * System.out.println("minimum number: " + arr[0]);
		 * System.out.println("maximumum number: " + arr[length - 1]);
		 * System.out.println("second largest: " + arr[length - 2]);
		 * 
		 * Set<Integer> uniqvalues = new HashSet<Integer>(); for (int num : arr) {
		 * uniqvalues.add(num); } Integer[] uniqarr = uniqvalues.toArray(new
		 * Integer[uniqvalues.size()]); Arrays.sort(uniqarr);
		 * 
		 * System.out.println(Arrays.toString(uniqarr));
		 * System.out.println("uniqarr minimum number: " + arr[0]);
		 * System.out.println("uniqarr maximumum number: " + arr[length - 1]);
		 * System.out.println("uniqarr second largest: " + arr[length - 2]);
		 */

		/*
		 * //Reverse array int[] reversedarr = new int[arr.length]; for(int i=
		 * arr.length-1;i>=0;i--) { reversedarr[arr.length - 1 - i] = arr[i];
		 * 
		 * } System.out.println(Arrays.toString(reversedarr));
		 */

		int[] arr2 = { 9, 6, 5, 2, 0, 5, 7, 9, 0, 4, 0 };
		int[] arrreverse2 = new int[arr2.length];
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

		for (int i = 0; i < arr2.length; i++) {
			arrreverse2[arrreverse2.length - 1 - i] = arr2[i];

		}
		System.out.println(Arrays.toString(arrreverse2));

	}

}
