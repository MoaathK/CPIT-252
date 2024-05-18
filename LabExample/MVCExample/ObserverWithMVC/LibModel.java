package ObserverWithMVC;

import java.util.ArrayList;
import java.util.List;

public class LibModel {
    private List<String> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    public void addBook(String book) {
        books.add(book);
        notifyObserver();
    }
    public List<String> getBooks(){
        return books;
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    private void notifyObserver(){
        for (Observer observer: observers){
            observer.update();
        }

    }
}
