
// Access Modifiers - Manager
class Manager extends Employee {
    int teamSize;

    Manager(int id, String dept, double salary, int teamSize) {
        super(id, dept, salary);
        this.teamSize = teamSize;
    }

    void display() {
        System.out.println("Manager - ID: " + employeeID + ", Department: " + department +
                ", Salary: " + getSalary() + ", Team Size: " + teamSize);
    }
}
