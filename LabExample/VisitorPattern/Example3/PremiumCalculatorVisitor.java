package Example3;

public class PremiumCalculatorVisitor implements InsurancePlanVisitor{
    @Override
    public void visit(HealthInsurancePlan plan) {
        System.out.println("Calculating Premium for health insurance ");
    }

    @Override
    public void visit(LifeInsurancePlan plan) {
        System.out.println("Calculating Premium for life insurance ");
    }

    @Override
    public void visit(AutoInsurancePlan plan) {
        System.out.println("Calculating Premium for auto insurance ");
    }
}
