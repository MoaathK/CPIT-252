package StrategyPatter2;

public class StrategyPaymentDemo {
    public static void main(String[] args) {

        ShoppingCart cart =new ShoppingCart();
        cart.addItem(new Item("1234",110));
        cart.addItem(new Item("5678",210));

        cart.setPaymentStrategy(new PaypalPaymentStrategy("myemail@gmail.com","password"));
        cart.checkout();

        cart.setPaymentStrategy(new CreditCardPaymentStrategy("Moath Khalid ","27387833468823","786","12/24"));
        cart.checkout();

    }
}
