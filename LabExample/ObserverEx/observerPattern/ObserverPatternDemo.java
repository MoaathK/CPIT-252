package observerPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(10,"Burhan Rizwan",2000);
        new HumanResourcesObs(employee);
        new HighManagementObs(employee);
        employee.setSalary(2200);
        System.out.println("---------------------");
        employee.setSalary(3300);

    }
}
