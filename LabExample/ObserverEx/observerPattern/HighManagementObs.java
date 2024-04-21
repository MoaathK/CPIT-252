package observerPattern;

import java.security.PublicKey;

public class HighManagementObs implements Observer{
    private Employee emp;
    public HighManagementObs(Employee employee){
        this.emp = employee;
        this.emp.adObserver(this);
    }

    @Override
    public void sendMessage() {
        System.out.println("High Management is informed about the new salary ("+emp.getSalary()+") of Mr. "+emp.getName());
    }

}
