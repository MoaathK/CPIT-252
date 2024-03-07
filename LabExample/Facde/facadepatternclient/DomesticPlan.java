package facadepatternclient;

public class DomesticPlan implements PlanType{
    @Override
    public void getPlan() {
        System.out.println("Domestic Plan");
    }

    @Override
    public void getRate() {
        System.out.println("6000 SAR");

    }
}
