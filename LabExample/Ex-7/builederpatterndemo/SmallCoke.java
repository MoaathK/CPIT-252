package builederpatterndemo;

public class SmallCoke extends Coke{
    @Override
    public String name() {
        return "300 ml Coke";
    }

    @Override
    public String size() {
        return "Small Size";
    }

    @Override
    public int price() {
        return 25   ;
    }
}
