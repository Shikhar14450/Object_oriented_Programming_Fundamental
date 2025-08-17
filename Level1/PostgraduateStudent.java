
// Access Modifiers - PostgraduateStudent
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int roll, String name, double CGPA, String specialization) {
        super(roll, name, CGPA);
        this.specialization = specialization;
    }

    void display() {
        System.out.println("PG Student: " + name + ", Roll: " + rollNumber + ", CGPA: " + getCGPA() +
                ", Specialization: " + specialization);
    }
}
