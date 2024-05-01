package StrategyPatter2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;
    PaymentStrategy paymentStrategy;
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    public void removeItem(Item item) {
        this.items.remove(item);
    }
    public int calculateTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
