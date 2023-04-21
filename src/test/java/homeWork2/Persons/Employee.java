package homeWork2.Persons;

public class Employee extends Person {
    private double salary;

    public Employee(String jane, String smith, String s, String cashier) {
        super();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
