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
}
