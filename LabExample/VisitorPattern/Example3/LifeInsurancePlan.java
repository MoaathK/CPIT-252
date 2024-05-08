package Example3;

public class LifeInsurancePlan implements InsurancePlan{
    @Override
    public void accept(InsurancePlanVisitor visitor) {
        visitor.visit(this);
    }
}
