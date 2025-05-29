package loops;

public class Loops {

	public static void main(String[] args) {

		// 1. print 1 to 100 values using while
		/*
		 * int n = 1; while (n <=100) { System.out.println(n); n += 1; }
		 */

		// 2.print even numbers between 200 to 500
		/*
		 * int n = 200; while (n <= 500) {
		 * 
		 * System.out.println(n); n += 2; }
		 */

		// 3.print numbers divisible by 7 between 150 to 200
		/*
		 * int n = 150; while (n <= 200) { if (n % 7 == 0) { System.out.println(n);
		 * 
		 * } n += 1;
		 * 
		 * }
		 */

		// 4.print prime numbers between 50 to 100 {doubt}
		/*
		 * int n = 50;
		 * 
		 * while (n <= 100) { int i = 1; int count = 0;
		 * 
		 * while (i <= n) { if (n % i == 0) { count++; } i++; }
		 * 
		 * if (count == 2) { System.out.println(n); } n++; }
		 */

		// 5.print odd numbers between 200 to 50 in reverse
		/*
		 * int n = 200; while (n >= 25) { if (n % 2 == 1) { System.out.println(n); }
		 * n--;
		 * 
		 * }
		 */

		// 6. print 1 to 100 values using for
		/*
		 * int i; for(i=1;i<=100;i++) { System.out.println(i); }
		 */

		// 7.print even numbers between 200 to 500
		/*
		 * int i; for(i=200;i<=500;i++) { if(i%2==0) { System.out.println(i); } }
		 */

		// 8.print numbers divisible by 7 between 150 to 200 using for
		/*
		 * int i; for(i = 150;i<=200;i++) { if(i%7==0) { System.out.println(i); } }
		 */

		// 9.print prime numbers between 50 to 150  [doubt]
        /*
		int n;
		int i;

		for (n = 50; n <= 150; n++) {
			int count = 0;
			for (i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(n);
			}

		} */
		
		//10. sum of even numbers between 40 to 80
		
		int i;
		int sum = 0;
		for (i = 40; i <= 80; i++) {
			
			if (i % 2 == 0) {
				sum += i;
			}
			
		}
		System.out.println(sum);
		
	}

}
