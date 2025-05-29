package strings;

public class reverseString {

	public static void main(String[] args) {
		        String name = "Koduru";
		        String reversedString = "";

		        for (int i = name.length() - 1; i >= 0; i--) { // Fix: start from name.length() - 1
		            reversedString += name.charAt(i);
		        }

		        System.out.println("Reversed String: " + reversedString);

	}

}
