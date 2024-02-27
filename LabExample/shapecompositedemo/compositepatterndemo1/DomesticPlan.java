package compositepatterndemo1;

public class DomesticPlan implements Plan{
    private int rate =5;
    private int unit = 1000;


    @Override
    public void show() {
        System.out.println("The bill of Domestic Plan: "+unit*rate);
    }
}
