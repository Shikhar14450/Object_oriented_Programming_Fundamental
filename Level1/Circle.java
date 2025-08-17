
// Constructors Practice - Circle
class Circle {
    double radius;

    Circle() {
        this(1.0); // constructor chaining
    }

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Circle radius: " + radius);
    }
}
