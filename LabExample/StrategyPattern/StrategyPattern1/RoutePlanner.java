package StrategyPattern1;

public class RoutePlanner {
    private RouteStrategy strategy;
    public RoutePlanner(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }
    public void planRoute(String origin, String destination) {
        strategy.calculateRoute(origin, destination);
    }


}
