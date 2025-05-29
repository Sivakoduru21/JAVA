package loops;

public class prime {

	public static void main(String[] args) {
	/*	int n;
		int i;
		
		for (n = 50; n <= 150; n++) {
			int count = 0;
			for (i = 1; i <= n; i++) {  //
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(n);
			}

		}   */
	     for (int i = 1; i <= 9; i++) {
	            // Print leading spaces
	            for (int k = 1; k < i; k++) {
	                System.out.print(" ");
	            }

	            // Print stars with spaces in between
	            for (int j = i; j <= 9; j++) {
	                System.out.print("* ");
	            }

	            // Move to the next line
	            System.out.println();
	        }

	}

}
