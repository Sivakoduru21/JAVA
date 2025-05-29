package pojoclass;

public class POJO {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setID(2104);
		e1.name = "shiva";
		e1.salary = 780000.69;

		Employee e2 = new Employee();
		e2.setID(2104);
		e2.name = "sairam";
		e2.salary = 990000;

		Employee e3 = new Employee();
		e3.setID(2104);
		e3.name = "anusha";
		e3.salary = 1110000;

		Employee employees[] = new Employee[] { e1, e2, e3 };

	}
}
