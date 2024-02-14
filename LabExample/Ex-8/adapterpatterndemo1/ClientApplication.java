package adapterpatterndemo1;

public class ClientApplication {
    public static void main(String[] args) {
        ICalculate targetInterface = new CalculateAdapt();
        targetInterface.calHourly();
        System.out.println(targetInterface.show());
    }
}
