package StrategyPattern1;

public class DrivingStrategy implements RouteStrategy{
    @Override
    public void calculateRoute(String origin, String destination) {
        System.out.println("Calculating driving route from "+origin+" to "+destination+".");
    }
}
