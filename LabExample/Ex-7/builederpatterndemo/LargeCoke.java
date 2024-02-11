package builederpatterndemo;

public class LargeCoke extends Coke{
    @Override
    public String name() {
        return "750 ml Coke";
    }

    @Override
    public String size() {
        return "Large Size";
    }

    @Override
    public int price() {
        return 50;
    }
}
