package sequential.execution;

public class Student {

	

	public void writeExam() {
		System.out.println("Writing exam");
	}

	public void participateInCompetition() {
		System.out.println("Participating in competition");
	}

	public void submitAssignment() {
		System.out.println("Submitting assignment");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
	    Student s2 = new Student();
	    
	    
		s1.writeExam();
		s1.participateInCompetition();
		s1.submitAssignment();

		s2.writeExam();
		s2.participateInCompetition();
		s2.submitAssignment();
	}
}
