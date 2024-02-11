package builederpatterndemo;

public class MediumCoke extends Coke{

    @Override
    public String name() {
        return "500 ml Coke";
    }

    @Override
    public String size() {
        return "Medium Size";
    }

    @Override
    public int price() {
        return 35   ;
    }
}
