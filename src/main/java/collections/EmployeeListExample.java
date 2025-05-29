package collections;
import java.util.LinkedList;
import java.util.List;

class Employees {
    private String name;
    private int id;
    private double salary;
    private String country;

    public Employees(String name, int id, double salary, String country) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employees [Name=" + name + ", ID=" + id + ", Salary=" + salary + ", Country=" + country + "]";
    }
}

public class EmployeeListExample {
    public static void main(String[] args) {
        List<Employees> employeeList = new LinkedList<>();

        employeeList.add(new Employees("Alice", 101, 50000.0, "USA"));
        employeeList.add(new Employees("Bob", 102, 60000.0, "Canada"));
        employeeList.add(new Employees("Charlie", 103, 70000.0, "UK"));
        employeeList.add(new Employees("Diana", 104, 80000.0, "India"));

        for (Employees emp : employeeList) {
            System.out.println(emp);
        }
    }
}


