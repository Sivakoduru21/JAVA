package Parallel.execution;

public class Student extends Thread {
    String task;

    Student(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(task + " on " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Student t1 = new Student("Writing exam");
        Student t2 = new Student("Participating in competition");
        Student t3 = new Student("Submitting assignment");

        t1.start();
        t2.start();
        t3.start();
    }
}

