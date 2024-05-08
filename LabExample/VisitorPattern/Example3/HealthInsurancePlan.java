package Example3;

public class HealthInsurancePlan implements InsurancePlan{
    @Override
    public void accept(InsurancePlanVisitor visitor) {
        visitor.visit(this);
    }
}
