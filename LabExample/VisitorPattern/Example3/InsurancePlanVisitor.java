package Example3;

public interface InsurancePlanVisitor {
    void visit(HealthInsurancePlan plan);
    void visit(LifeInsurancePlan plan);
    void visit(AutoInsurancePlan plan);
}
