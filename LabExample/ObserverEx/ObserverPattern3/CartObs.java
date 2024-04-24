package ObserverPattern3;

public class CartObs {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        new CartContentDisplay(cart);
        new CartSummaryDisplay(cart);
        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.removeItem("Apple");

    }
}
