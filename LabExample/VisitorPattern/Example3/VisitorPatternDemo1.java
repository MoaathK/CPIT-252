package Example3;

public class VisitorPatternDemo1 {
    public static void main(String[] args) {
        InsurancePlan healthPlan = new HealthInsurancePlan();
        InsurancePlan lifePlan = new LifeInsurancePlan();
        InsurancePlan autoPlan = new AutoInsurancePlan();

        PremiumCalculatorVisitor premiumVisitor = new PremiumCalculatorVisitor();
        BenefitsDescriptionVisitor BenefitsVisitor = new BenefitsDescriptionVisitor();

        healthPlan.accept(premiumVisitor);
        lifePlan.accept(premiumVisitor);
        autoPlan.accept(premiumVisitor);

        healthPlan.accept(BenefitsVisitor);
        lifePlan.accept(BenefitsVisitor);
        autoPlan.accept(BenefitsVisitor);
    }
}
