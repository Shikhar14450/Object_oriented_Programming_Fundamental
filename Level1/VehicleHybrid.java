// Problem 11: Vehicle Management System (Hybrid Inheritance via Interface)
// Base class: VehicleBase; Interface: Refuelable; Subclasses: ElectricVehicle, PetrolVehicle
interface Refuelable {
    void refuel(double liters);
}

class VehicleBase {
    protected int maxSpeed;
    protected String model;
    public VehicleBase(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    public void info() {
        System.out.println("Vehicle: " + model + " | Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends VehicleBase {
    private int batteryPercent;
    public ElectricVehicle(int maxSpeed, String model, int batteryPercent) {
        super(maxSpeed, model);
        this.batteryPercent = batteryPercent;
    }
    public void charge(int amount) {
        batteryPercent = Math.min(100, batteryPercent + amount);
        System.out.println(model + " charged to " + batteryPercent + "%");
    }
    @Override public void info() {
        System.out.println("EV: " + model + " | Max Speed: " + maxSpeed + " km/h | Battery: " + batteryPercent + "%");
    }
}

class PetrolVehicle extends VehicleBase implements Refuelable {
    private double fuelLiters;
    public PetrolVehicle(int maxSpeed, String model, double fuelLiters) {
        super(maxSpeed, model);
        this.fuelLiters = fuelLiters;
    }
    @Override public void refuel(double liters) {
        fuelLiters += liters;
        System.out.println(model + " refueled. Tank: " + fuelLiters + " L");
    }
    @Override public void info() {
        System.out.println("Petrol: " + model + " | Max Speed: " + maxSpeed + " km/h | Fuel: " + fuelLiters + " L");
    }
}

public class VehicleHybrid {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(160, "EV-One", 40);
        PetrolVehicle pv = new PetrolVehicle(180, "PetroMax", 15);

        ev.info(); pv.info();
        ev.charge(30);
        pv.refuel(20);
    }
}
