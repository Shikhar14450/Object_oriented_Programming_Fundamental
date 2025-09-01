// Problem 10: Restaurant Management System (Hybrid Inheritance via Interface)
// Base class: Person; Interface: Worker; Subclasses: Chef, Waiter (extend Person & implement Worker)
interface Worker {
    void performDuties();
}

class PersonR {
    protected String name;
    protected int id;
    public PersonR(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends PersonR implements Worker {
    public Chef(String name, int id) { super(name, id); }
    @Override public void performDuties() {
        System.out.println("Chef " + name + " cooks dishes and manages the kitchen.");
    }
}

class Waiter extends PersonR implements Worker {
    public Waiter(String name, int id) { super(name, id); }
    @Override public void performDuties() {
        System.out.println("Waiter " + name + " takes orders and serves customers.");
    }
}

public class RestaurantHybrid {
    public static void main(String[] args) {
        Worker[] staff = { new Chef("Lakshmi", 11), new Waiter("Rohan", 12) };
        for (Worker w : staff) w.performDuties();
    }
}
