package builederpatterndemo;

public class MediumVegPizza extends VegPizza{
    @Override
    public int price() {
        return 150;
    }

    @Override
    public String name() {
        return "Medium Veg Pizza";
    }

    @Override
    public String size() {
        return "Medium Size";
    }
}
