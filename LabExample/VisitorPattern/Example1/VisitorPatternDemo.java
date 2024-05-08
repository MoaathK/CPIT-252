package Example1;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Visitable engine = new Engine();
        Visitable fuelTank = new FuelTank();
        bike.addPart(fuelTank);
        bike.addPart(engine);
        bike.accept(new PartChecker());
        bike.accept(new PartsOperator());
    }
}
