package ObserverPattern3;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Subject{
    private List<Observer> observers;
    private List<String> items;
    public ShoppingCart(){
        observers = new ArrayList<>();
        items = new ArrayList<>();

    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for( Observer observer: observers){
            observer.update();
        }

    }
    public void addItem(String item){
        items.add(item);
        notifyObserver();
    }
    public void removeItem(String item){
        items.remove(item);
        notifyObserver();
    }
    public List<String> getItems(){
        return items;
    }
}
