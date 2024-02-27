package compositepatterndemo1;

public class CommercialPlan implements Plan{
    private int rate=10;
    private int unit = 600;

    @Override
    public void show() {
        System.out.println("The bill of Commercial Plan: "+unit*rate);
    }
}
