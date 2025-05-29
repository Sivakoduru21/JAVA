package strings;

public class duplicatesOfString {

	public static void main(String[] args) {

		int count = 0;
		String name = "KoduruSivaPrasadReddy";
		for (int i = 0; i < name.length(); i++) {
			count =1;
			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(j) == name.charAt(i)) {
					count++;
				}
			}
			if (count > 1) {

				System.out.println("duplicate character is: " + name.charAt(i) + " it repeated " + count + " times");
			}

		}
	}

}
