package StrategyPattern1;

public class BicyclingStrategy implements RouteStrategy{
    @Override
    public void calculateRoute(String origin, String destination) {
        System.out.println("Calculating bicycle route from "+origin+" to "+destination+".");
    }
}
