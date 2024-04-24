package ObserverPattern3;

public class CartSummaryDisplay implements Observer{

    private ShoppingCart cart;

    public CartSummaryDisplay(ShoppingCart cart){
        this.cart = cart;
        cart.registerObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Total Items in Cart: " +cart.getItems().size());
    }
}
