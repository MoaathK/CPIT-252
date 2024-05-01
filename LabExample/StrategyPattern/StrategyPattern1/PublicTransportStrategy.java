package StrategyPattern1;

public class PublicTransportStrategy implements RouteStrategy{
    @Override
    public void calculateRoute(String origin, String destination) {
        System.out.println("Calculating Public Transport route from "+origin + " to " + destination+".");
    }
}
