package StrategyPattern1;

public class StrategyTravelDemo {
    public static void main(String[] args) {
        RoutePlanner plan = new RoutePlanner(new DrivingStrategy());
        plan.planRoute("Al Rehab", "Sulemania");

        plan.setRouteStrategy(new BicyclingStrategy());
        plan.planRoute("Al Rehab", "Sulemania");

        plan.setRouteStrategy(new PublicTransportStrategy());
        plan.planRoute("Al Rehab", "Sulemania");
    }
}
