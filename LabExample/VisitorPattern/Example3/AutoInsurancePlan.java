package Example3;

public class AutoInsurancePlan implements InsurancePlan{
    @Override
    public void accept(InsurancePlanVisitor visitor) {
        visitor.visit(this);
    }
}
