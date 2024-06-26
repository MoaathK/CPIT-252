package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    String name;
    int salary;
    private List<Observer> observers = new ArrayList<>();
    public Employee(int id,String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        notifyAllObservers();
    }
    public void notifyAllObservers(){
        for (Observer observer : observers ){
            observer.sendMessage();
        }

    }
    public void adObserver(Observer observer){
        observers.add(observer);
    }
}
