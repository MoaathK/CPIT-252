package StatePattern3;

public class OrderStateDemo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        order.processOrder();
        order.shipOrder();
        order.processOrder();
        order.cancelOrder();
        order.deliverOrder();
        order.cancelOrder();
    }
}
