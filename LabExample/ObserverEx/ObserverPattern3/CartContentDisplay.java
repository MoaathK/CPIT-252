package ObserverPattern3;

public class CartContentDisplay implements Observer{
    private ShoppingCart cart;


    public CartContentDisplay(ShoppingCart cart){
        this.cart = cart;
        cart.registerObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Cart Content Updated: "+cart.getItems());
    }
}
