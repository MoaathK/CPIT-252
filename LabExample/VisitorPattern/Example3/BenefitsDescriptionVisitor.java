package Example3;

public class BenefitsDescriptionVisitor implements InsurancePlanVisitor{
    @Override
    public void visit(HealthInsurancePlan plan) {
        System.out.println("Describing Premium for health insurance ");
    }

    @Override
    public void visit(LifeInsurancePlan plan) {
        System.out.println("Describing Premium for life insurance ");
    }

    @Override
    public void visit(AutoInsurancePlan plan) {
        System.out.println("Describing Premium for auto insurance ");
    }
}
