import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		
		//1.print some of elements in the 2 dimensional array
	/*	
		int arr[][]= {{1,10},{1,20},{1,30}};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length; j++) {
				sum+= arr[i][j];
			}
			
		}
        System.out.println(sum);  */
        
        //2.add the elements in an array and print
        
    /*  int arr1[][] = {{50,10},{60,20},{70,30}};
        int arr2[][] = {{20,10},{30,20},{40,30}};
        int arr3[][] =  new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				
			    arr3[i][j] = arr1[i][j]+arr2[i][j];
			    System.out.print(arr3[i][j] +" ");
				
			}
	        System.out.println();
		}   */

		//3.create an array with squares of the existing array elements
		
/*		int arr1[][] = {{2,1},{3,2},{7,3}};
        int arr2[][] = new int[3][3];
     
        for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				
			    arr2[i][j] = arr1[i][j]*arr1[i][j];
			    System.out.print(arr2[i][j] +" ");
				
			}
	        System.out.println();
		}   */
		
		//4.add two arrays using user input
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = input.nextInt();
		System.out.println("Enter the number of columns");
		int colu = input.nextInt();
		int arr1[][] = new int[rows][colu];
		int arr2[][] = new int[rows][colu];
		int arr3[][] = new int[rows][colu];
		System.out.println("enter the elements for array1");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colu; j++)
				arr1[i][j] = input.nextInt();

		}
		System.out.println("enter the elements for array2");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colu; j++)
				arr2[i][j] = input.nextInt();

		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colu; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];

				System.out.print(arr3[i][j] + " ");
			}

			System.out.println();
		}  */
		
		//5.print the common elements in the 2 arrays  {doubt} no duplicates in the output
		
	/*	int arr1[][] = { { 1, 2, 1 }, { 9, 7, 2 }, { 7, 6, 4 } };
		int arr2[][] = { { 2, 6, 8, 6 }, { 0, 1, 3, 9, 7 }, { 7, 2, 0 }, { 8, 3 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for (int k = 0; k < arr2.length; k++) {

					for (int l = 0; l < arr2[k].length; l++) {
						if (arr1[i][j] == arr2[k][l]) {

							System.out.print(arr1[i][j] + " ");

						}

					}

				}

			}

		} */

		//6.print highest and second highest number in a array
		int arr[] = {-2,-4,-1};
		int highestnumber=Integer.MIN_VALUE;
		int secondhighest =Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>highestnumber)
			{
				secondhighest = highestnumber;
				highestnumber = arr[i];
			}
			else if (arr[i]>secondhighest && arr[i]!=highestnumber)
			{
				secondhighest = arr[i];
			}
			
		}
		System.out.println(highestnumber);
		System.out.println(secondhighest);
		
	}
}
