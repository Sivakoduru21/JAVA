package JAVA.REAL.TIME.EXAMPLE;

public class Employee {
	
	
    String orgName  = "shiva agro industries";
    String ceo = "shiva";
	int orgID =8931;
	int noOfDepts =2;
	static double netWorth = 500.00;
	
	public static void main(String[] args) {
		
		int eid = 102;
		String empName = "vicky";
		double salary = 5000.00;
		
		Employee e1 = new Employee();
		e1.getOrgID();
		System.out.println(Employee.getNetWorth());
		
		Employee e2 = new Employee();
		e2.deleteEmployee(101);
		
	}
	
	public int getOrgID() {
		return orgID;
	}
	
	public static double getNetWorth() {
		return netWorth;
	}
	
	public void deleteEmployee(int empID) {
		
	}
	

}



/*
 * Java Memory Layout for the Provided Code
 * 
 * 1. Method Area (Class Area):
 * Class Metadata: Stores Employee class structure and method definitions.
 * Static Variable: netWorth = 500.00 (Class-level, shared by all objects).
 * Method Definitions: main(), getOrgID(), getNetWorth(), deleteEmployee().
 * 
 * 2. Heap Area (Objects and Instance Variables):
 * e1 Object (Employee) [Address: 0x001]:
 * orgName → Reference to "shiva agro industries" (String Pool)
 * ceo → Reference to "shiva" (String Pool)
 * orgID = 8931 (Primitive, directly stored)
 * noOfDepts = 2 (Primitive, directly stored)
 * 
 * e2 Object (Employee) [Address: 0x002]: Same structure as e1.
 * 
 * 3. String Pool (Part of Heap): Stores string literals shared by all objects.
 * "shiva agro industries"
 * "shiva"
 * "vicky"
 * 
 * 4. Stack Area (Method Call Frames):
 * main() Stack Frame:
 * eid = 102 (local variable)
 * empName → "vicky" (String Pool reference)
 * salary = 5000.00 (local variable)
 * e1 → Heap reference (0x001)
 * e2 → Heap reference (0x002)
 * getOrgID() Stack Frame (for e1): Returns 8931 from e1 object.
 * getNetWorth() Stack Frame: Returns 500.00 from Method Area (static).
 * deleteEmployee() Stack Frame (for e2): Takes empID parameter.
 * 
 * 5. Execution Flow:
 * 
 * Class Loading: JVM loads Employee class and static members into the Method
 * Area.
 * main() Execution: Creates a stack frame in the Stack Area.
 * Object Creation (e1 and e2): Allocates on Heap, stores instance variables and
 * references.
 * Method Calls: Each call creates a stack frame and accesses variables from
 * Heap and Method Area.
 */
