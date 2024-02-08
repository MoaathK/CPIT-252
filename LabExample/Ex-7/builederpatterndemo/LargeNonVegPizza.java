package builederpatterndemo;

public class LargeNonVegPizza extends NonVegPizza{
    @Override
    public int price() {
        return 200;
    }

    @Override
    public String name() {
        return "Large Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Large Size";
    }
}
