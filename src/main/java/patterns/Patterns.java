package patterns;

public class Patterns {

	public static void main(String[] args) {

		// 1.sqaure pattern

    /*	for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		} */

		//2.increasing traingle pattern
		
	/*	for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}   */
		
	   //2.decreasing traingle pattern
		
	/*  for (int i = 1; i <=5; i++) {

		for (int j = i; j <= 5; j++) {

			System.out.print("*");
		}

		System.out.println();
	}   */
		
	//3.reverse right angle traingle
		
/*  for (int i = 1; i <= 5; i++) {
		for (int k = 1; k < i; k++) {
			System.out.print(" ");          //5 iterations 5 stars;1 iteration 1 space;
		}
		for (int j = i; j <= 5; j++) {

			System.out.print("*");
		}
		System.out.println();
	}  */

		
		//4. reverse pyramid pattern
 
		for (int i = 1; i <= 9; i++) {
	        for (int k = 1; k < i; k++) {
		       System.out.print(" ");
	           }
	        for (int j = i; j <= 9; j++) {
               System.out.print("* ");
               }
	    System.out.println();
        }   
}

}


