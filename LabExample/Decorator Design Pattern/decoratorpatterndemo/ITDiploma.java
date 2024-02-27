package decoratorpatterndemo;

public class ITDiploma implements Program{
    @Override
    public String prepareProg() {
        return "IT Diploma fee";
    }

    @Override
    public double progPrice() {
        return 5000.0;
    }
}
