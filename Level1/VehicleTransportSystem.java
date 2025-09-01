// Problem 3: Vehicle and Transport System (Hierarchical subclasses of Vehicle)
// Inheritance type: Vehicle -> Car/Truck/Motorcycle
// Demonstrates: shared + unique attributes, polymorphic displayInfo().
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Vehicle | Max Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override public void displayInfo() {
        System.out.println("Car | Seats: " + seatCapacity + ", Max Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

class Truck extends Vehicle {
    private double loadCapacity; // in tons
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    @Override public void displayInfo() {
        System.out.println("Truck | Load: " + loadCapacity + " tons, Max Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

class Motorcycle extends Vehicle {
    private boolean hasCarrier;
    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }
    @Override public void displayInfo() {
        System.out.println("Motorcycle | Carrier: " + hasCarrier + ", Max Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] garage = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 12.5),
            new Motorcycle(140, "Petrol", true)
        };
        for (Vehicle v : garage) v.displayInfo();
    }
}
