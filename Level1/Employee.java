
// Access Modifiers - Employee
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dept, double salary) {
        this.employeeID = id;
        this.department = dept;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
