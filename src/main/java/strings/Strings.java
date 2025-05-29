package strings;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		//1.count the number of characters in a string
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = input.nextLine();
		System.out.println(name.length());  */
		
		//2.count the number of words in a string
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = input.nextLine();                  //what is \\s+ means?   [doubt]
		String arr[] = name.split(" "); //{siva,prasad,reddy}
		System.out.println(arr.length);   */
		
		
		//3.number of occurences of a charater in a string 
		
	 /*   
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = input.nextLine(); 
		char targetch = 's';
		int count =0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='s')
			{
				count++;
			}
			
		}
		System.out.println(count);  */
		
	  //4.program to reverse a string
		
	  /*Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = input.nextLine(); 
		for(int i=name.length()-1;i>=0;i--)    
		{
			System.out.print(name.charAt(i));
		}  */
		
	  //5.program to remove all starting and ending spaces
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = input.nextLine();
        System.out.println(name.trim());  */
        
      //6.program to reverse each word of a string
        
   /*   Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = input.nextLine();
		String arr[] = name.split(" ");
		for (int i = 0; i < arr.length; i++) {

			String reverseword = "";
			for (int j = arr[i].length()-1; j >= 0; j--) {
				reverseword += arr[i].charAt(j);
			}
			System.out.print(reverseword + " ");
		} */
		
	// 7.change odd words to uppercase reverse even words

/*  Scanner input = new Scanner(System.in);
	System.out.println("Enter the string");
	String name = input.nextLine();
	String arr[] = name.split(" ");

	for (int i = 0; i < arr.length; i++) {

		if (i % 2 == 0) {
			System.out.print(arr[i].toUpperCase() + " ");
		} else {
			String reverseWord = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				reverseWord += arr[i].charAt(j);
			}
			System.out.print(reverseWord + " ");
		}
	}   */
		
		//8.progarm to find the count of uppercase,lowercase and specail characters
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = input.nextLine();
		String newname = name.replaceAll(" ", "");
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		for(int i=0;i<newname.length();i++)
		{
			
			if (Character.isUpperCase(newname.charAt(i)))
			{
				count1++;
			}
			else if(Character.isLowerCase(newname.charAt(i)))
			{
				count2++;
			}
			else if(Character.isDigit(newname.charAt(i)))
			{
				count3++;
			}
			else 
			{
				count4++;
			}
			
			
		}
		System.out.println("uppercases count" + count1);
		System.out.println("Lowercases count" + count2);
		System.out.println("Digits count" + count3);
		System.out.println("special characters count" + count4);  */
		
		//9.first repeated and non repeated characters in a string  [doubt]
		
/*		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = input.nextLine();
		String newname = name.replaceAll(" ", "");  
		char repeated =' ';
		char nonrepeated =' ';
		

		for (int i = 0; i < newname.length(); i++) {

			for (int j = i+1; j < newname.length(); j++) {         
				if (newname.charAt(i) == newname.charAt(j) && repeated == ' ') {
				     repeated = newname.charAt(i);
				     else if(newname.charAt(i) != newname.charAt(j) && nonrepeated == ' ')
			
				     {
				    	 
				     
					
					
				}
			}
		}
		}  */
		
		
		
	  //10.program to create an array using words at even position in string  
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = input.nextLine();
		String arr1[] = name.split(" ");       
		String arr2[] = new String[(arr1.length)/2];
		int index=0;
		for(int i=0;i<arr1.length;i++)   
		{
		  if(i%2!=0)
		  {
			 arr2[index] = arr1[i];
			 index++;
		  }
		}
		 System.out.println(Arrays.toString(arr2));  */
			
	

		
	 //11.find the maximum length word in a string if there are 2 words output will be the 
		//first word of the string
		 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = input.nextLine();
		String arr1[] = name.split(" ");
		String largestword = "";
		String firstword = "";
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].length() > largestword.length()) {
				largestword = arr1[i];
			} else if (arr1[i].length() == largestword.length()) {
				firstword = arr1[0];
			}
		}
		input.close();
		System.out.println("largest word in the string is: " + largestword);
		System.out.println("length of the largest word in the string is: " + largestword.length());
		System.out.println("2 words are of same lenth in the string so first word is: " + firstword);

	}
}
