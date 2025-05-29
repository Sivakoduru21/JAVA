package numberproblems;

public class Numbersproblems {

	public static void main(String[] args) {
		
		
		//1.check number is prime or not.
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = input.nextInt();
		int count = 0;
		for (int i = 1; i <= number; i++) {
			

			if(number % i == 0) {
				count++;
			}

			
		}
		if (count == 2)
			System.out.println(number +": is a prime number");
			else
			System.out.println(number +": is not a prime number");	 */
		
		
		//2.reverse a number
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		String number = input.nextLine();
		String reversenumber = "";
		for(int i=number.length()-1;i>=0;i--)
		{
			reversenumber += number.charAt(i);
		}
		System.out.println(reversenumber);   */
		
		
		//3.verify palindrome
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		String number = input.nextLine();
		String reversenumber = "";
		for (int i = number.length() - 1; i >= 0; i--) {
			reversenumber += number.charAt(i);
		}
		if (number.equalsIgnoreCase(reversenumber))
			System.out.println("IT IS A PALINDROME");
		else
			System.out.println("IT IS NOT A PALINDROME");   */
		
		
		//4.print fibonacci series
		
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = scanner.nextInt();
		int first = 0;
		int second = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;

		}  */
		
		//5.armstrong number using string
  /*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		String number = scanner.nextLine();
		String arr[] = number.split("");
		int  x1 = 0;  //x1=1
		for (int i = 0; i < arr.length; i++) {
            
			int x = (int) Math.pow(Character.getNumericValue(number.charAt(i)),arr.length);
			
			x1 = x1 + x;

		}
        if(Integer.parseInt(number)==x1)
		System.out.println("it is armstrong number");
        else
        System.out.println("it is not armstrong number");  */
		
		
  /*
    //5.armstrong number  
     
    Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number:");
    int number = scanner.nextInt();
    int originalNumber = number;
    int count = 0;
	while (number != 0) {
		number /= 10;
		count++;
	}

	number = originalNumber;

	int sum = 0;
	while (number != 0) {
		int remain = number % 10;
		sum += Math.pow(remain, count);
		number /= 10;
	}

	if (sum == originalNumber) {
		System.out.println(originalNumber + " is an Armstrong number.");
	} else {
		System.out.println(originalNumber + " is not an Armstrong number.");
	}   */
		
		
		//6.print armstrong number between rangle n1 to n2
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first range :");
		int n1 = scanner.nextInt();
		System.out.println("Enter the second range :");
		int n2 = scanner.nextInt();
		for (int i = n1; i <= n2; i++) {
			int count = 0;
			int number = i;

			while (number != 0) {
				number /= 10;
				count++;
			}

			int sum = 0;
			number = i;
			while (number != 0) {
				int remain = number % 10;
				sum += Math.pow(remain, count);
				number /= 10;
			}

			if (sum == i) {
				System.out.print(i +" ");
			}
		
		} */
		
		
		
		//7.print a number is perfect or not
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number :");
		int number = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {

			if (number % i == 0 && number != i) {
				sum += i;

			}

		}
		if (sum == number)
			System.out.println("number is perfect ");
		else
			System.out.println("number is  not perfect ");  */
		
		
		
		
		
	}

}


