package facadepatternclient;

public class CommercialPlan implements PlanType{
    @Override
    public void getPlan() {
        System.out.println("Commercial Plan");
    }

    @Override
    public void getRate() {
        System.out.println("10000 SAR");

    }
}
