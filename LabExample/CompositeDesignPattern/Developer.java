public class Developer implements Employee{
    private String name;
    private double salary;
    public Developer (String name,double salary){
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
    }
    @Override
    public void add(Employee employee) {

    }
    @Override
    public void remove(Employee employee) {

    }
    @Override
    public Employee getChild(int i) {
        return null;
    }
}
