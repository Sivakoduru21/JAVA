package strings;

public class Stringbufferbuilders {

	public static void main(String[] args) {

		StringBuilder s3 = new StringBuilder("shiva");    //mutable
		StringBuilder s4 = new StringBuilder("shiva");

		String s1 = "shiva";
		String s2 = "shiva";
		

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);    //immutable

	}

}
