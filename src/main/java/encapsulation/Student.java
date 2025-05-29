package encapsulation;

public class Student {
	
	
	int rollNumber;
	String name;
	boolean isAttended;
	
	public Student(int rollNumber) {
		
		this.rollNumber = rollNumber;
		
	}
	
	public void setStudentAttendence(boolean flag) {
		this.isAttended = flag;
		System.out.println("teacher assigned attendence to student");
	}
	
	public boolean getStudentAttendence() {
		System.out.println("teacher accessed attendence to student");
		return isAttended;
	}
	
}
