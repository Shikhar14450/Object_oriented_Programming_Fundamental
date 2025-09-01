// Problem 2: Employee Management System (Inheritance + Overriding)
// Inheritance type: Employee -> Manager/Developer/Intern
// Demonstrates: subclass-specific fields + overridden displayDetails().
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override public void displayDetails() {
        System.out.println("Manager: " + name + ", ID: " + id + ", Salary: " + salary + ", Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override public void displayDetails() {
        System.out.println("Developer: " + name + ", ID: " + id + ", Salary: " + salary + ", Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private String duration; // e.g., "6 months"
    public Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }
    @Override public void displayDetails() {
        System.out.println("Intern: " + name + ", ID: " + id + ", Stipend: " + salary + ", Duration: " + duration);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] staff = {
            new Manager("Aman", 1, 90000, 8),
            new Developer("Adarsh", 2, 70000, "Java"),
            new Intern("Riya", 3, 15000, "6 months")
        };
        for (Employee e : staff) e.displayDetails();
    }
}
