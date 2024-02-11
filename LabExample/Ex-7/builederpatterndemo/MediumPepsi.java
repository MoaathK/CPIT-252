package builederpatterndemo;

public class MediumPepsi extends Pepsi{
    @Override
    public String name() {
        return "500 ml Pepsi";
    }

    @Override
    public String size() {
        return "Medium Size";
    }

    @Override
    public int price() {
        return 35;
    }
}
