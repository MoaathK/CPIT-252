package compositepatterndemo1;

public class CompositePatternDemo1 {
    public static void main(String[] args) {
        DomesticPlan DP = new DomesticPlan();
        CommercialPlan CP = new CommercialPlan();
        PlanDirectory Directory = new PlanDirectory();

        Directory.show();
        Directory.add(DP);
        Directory.add(CP);

    }
}
