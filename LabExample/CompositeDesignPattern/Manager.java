import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private double salary;
    List<Employee> employees = new ArrayList<Employee>();
    public Manager(String name,double salary){
        this.name = name;
        this.salary = salary;

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Name = "+getName());
        System.out.println("Salary = "+getSalary());
        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.print();
        }

    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

}
