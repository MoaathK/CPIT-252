package builederpatterndemo;

public class MediumNonVegPizza extends NonVegPizza{
    @Override
    public int price() {
        return 200;
    }

    @Override
    public String name() {
        return "Medium Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Medium Size";
    }
}
