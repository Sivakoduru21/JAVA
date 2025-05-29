package strings;

public class reverseEachwordOFString {

	public static void main(String[] args) {
		   String name = "Koduru Siva Prasad Reddy";
		    String unique ="";
		    int count =name.length();
		    System.out.println(count);
		    String[] arr = name.split(" ");
		    for(int i=0; i<=arr.length-1;i++)
		       {
		        for(int j = arr[i].length()-1;j>=0;j--){
		            
		         unique += arr[i].charAt(j);

		       }
		        unique +=" ";
		}
		    
		System.out.println("uniqueString: " + unique );
	}

}
