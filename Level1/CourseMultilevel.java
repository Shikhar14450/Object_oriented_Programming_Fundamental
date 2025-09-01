// Problem 7: Educational Course Hierarchy (Multilevel Inheritance)
// Chain: Course -> OnlineCourse -> PaidOnlineCourse
class Course {
    protected String courseName;
    protected int duration; // in hours
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    public void info() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + "h");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override public void info() {
        System.out.println("Online Course: " + courseName + " | Duration: " + duration + "h | Platform: " + platform + " | Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // percent
    public PaidOnlineCourse(String name, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(name, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    @Override public void info() {
        System.out.println("Paid Online Course: " + courseName + " | Duration: " + duration + "h | Platform: " + platform + " | Fee: " + fee + " | Discount: " + discount + "%");
    }
}

public class CourseMultilevel {
    public static void main(String[] args) {
        Course c1 = new Course("Basics of OOP", 10);
        Course c2 = new OnlineCourse("Java Foundations", 20, "Coursera", true);
        Course c3 = new PaidOnlineCourse("Advanced Java", 30, "Udemy", true, 4999, 20);

        c1.info();
        c2.info();
        c3.info();
    }
}
