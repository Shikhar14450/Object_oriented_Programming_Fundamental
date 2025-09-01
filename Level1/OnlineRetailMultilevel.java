// Problem 6: Online Retail Order Management (Multilevel Inheritance)
// Chain: Order -> ShippedOrder -> DeliveredOrder
class Order {
    protected String orderId;
    protected String orderDate;
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderStatus() { return "Order Placed"; }
}

class ShippedOrder extends Order {
    protected String trackingNumber;
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override public String getOrderStatus() { return "Shipped (Tracking: " + trackingNumber + ")"; }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override public String getOrderStatus() { return "Delivered on " + deliveryDate; }
}

public class OnlineRetailMultilevel {
    public static void main(String[] args) {
        Order o1 = new Order("O1", "2025-08-25");
        Order o2 = new ShippedOrder("O2", "2025-08-26", "TRK123");
        Order o3 = new DeliveredOrder("O3", "2025-08-27", "TRK456", "2025-08-30");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
