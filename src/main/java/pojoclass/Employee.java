package pojoclass;

public class Employee {
	private int id;
	public String name;
	protected double salary;
	
	
	public Employee() {                           //setser and getters are used when there are pvt
		System.out.println("no arg is called");   //variables
	}
	public Employee(int id) {
		this.id= id;
	}

	public void setID(int id) {
		this.id = id;

	}
	
	public int getID() {             //method to get value of private variable
		return id;
	}


}
