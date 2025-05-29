package stackOverFlow;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.add(1);

	}
	                                   //stack area ha default 1 MB memory;heap area ha 748MB
	
	public void add(int i) {          //to increase stack area use -Xss2m  in vm argumants in run cinfigurations
		System.out.println(i);
		i++;
		add(i);
		
	}

}
