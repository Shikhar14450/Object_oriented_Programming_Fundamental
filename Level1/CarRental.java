
// Constructors Practice - CarRental
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final double COST_PER_DAY = 50.0;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    void displayRental() {
        double totalCost = rentalDays * COST_PER_DAY;
        System.out.println("Car Rental - Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total: " + totalCost);
    }
}
