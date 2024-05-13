package facadepatternclient;

public class PLanKeeper { // Facade Class
    private PlanType domesticPLan;
    private PlanType commercialPLan;
    private PlanType institutionalPlan;

    public PLanKeeper(){
        domesticPLan = new DomesticPlan();
        commercialPLan = new CommercialPlan();
        institutionalPlan = new InstitutionPlan();

    }
    public void domesticRate(){
        domesticPLan.getPlan();
        domesticPLan.getRate();
    }
    public void commercialRate(){
        commercialPLan.getPlan();
        commercialPLan.getRate();
    }
    public void institutionalRate(){
        institutionalPlan.getPlan();
        institutionalPlan.getRate();
    }
}
