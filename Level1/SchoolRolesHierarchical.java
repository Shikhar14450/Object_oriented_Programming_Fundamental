// Problem 9: School System with Different Roles (Hierarchical Inheritance)
// Base: Person -> Teacher / Student / Staff
class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayRole() {
        System.out.println("Generic Person");
    }
}

class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override public void displayRole() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    @Override public void displayRole() {
        System.out.println("Student: " + name + ", Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    @Override public void displayRole() {
        System.out.println("Staff: " + name + ", Department: " + department);
    }
}

public class SchoolRolesHierarchical {
    public static void main(String[] args) {
        Person[] people = {
            new Teacher("Kiran", 35, "Mathematics"),
            new Student("Asha", 16, "10th"),
            new Staff("Ravi", 40, "Administration")
        };
        for (Person p : people) p.displayRole();
    }
}
