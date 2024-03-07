package facadepatternclient;

public class InstitutionPlan implements PlanType{
    @Override
    public void getPlan() {
        System.out.println("Institutional Plan");
    }

    @Override
    public void getRate() {
        System.out.println("8000 SAR");
    }
}
