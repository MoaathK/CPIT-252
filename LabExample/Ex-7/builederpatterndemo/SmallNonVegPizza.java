package builederpatterndemo;

public class SmallNonVegPizza extends NonVegPizza{
    @Override
    public int price() {
        return 180;
    }

    @Override
    public String name() {
        return "Small Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Small Size";
    }
}
