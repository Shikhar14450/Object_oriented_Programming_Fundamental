// Problem 5: Smart Home Devices (Single Inheritance)
// Inheritance: Device -> Thermostat
class Device {
    protected String deviceId;
    protected String status; // e.g., "ON" / "OFF"

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device " + deviceId + " is " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override public void displayStatus() {
        System.out.println("Thermostat " + deviceId + " is " + status + " at " + temperatureSetting + "°C");
    }
}

public class SmartHomeSingleInheritance {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("TH-101", "ON", 24.5);
        t.displayStatus();
    }
}
