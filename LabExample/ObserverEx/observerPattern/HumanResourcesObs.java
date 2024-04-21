package observerPattern;

public class HumanResourcesObs implements Observer{
    private Employee emp;
    public HumanResourcesObs(Employee employee){
        this.emp = employee;
        this.emp.adObserver(this);
    }
    @Override
    public void sendMessage() {
        System.out.println("Human Resources are informed about the new salary ("+emp.getSalary()+") of Mr. "+emp.getName());
    }
}
