package builederpatterndemo;

public class LargePepsi extends Pepsi{
    @Override
    public String name() {
        return "750 ml Pepsi";
    }

    @Override
    public String size() {
        return "Large Pepsi";
    }

    @Override
    public int price() {
        return 50;
    }
}
