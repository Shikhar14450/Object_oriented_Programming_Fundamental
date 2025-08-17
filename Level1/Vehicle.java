
// Instance vs. Class Variables - Vehicle
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}
