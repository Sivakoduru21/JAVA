package encapsulation;

public class Teacher {
	
	public static void main(String[] args) {
		
		Student student = new Student(105);
		student.isAttended= true;
		student.setStudentAttendence(true);
		student.getStudentAttendence();
		
		
	}

}
