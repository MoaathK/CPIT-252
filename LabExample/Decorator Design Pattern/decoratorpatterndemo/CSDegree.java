package decoratorpatterndemo;

public class CSDegree extends ProgDecorator{

    public CSDegree(Program newProgram) {
        super(newProgram);

    }

    @Override
    public double progPrice() {
        return super.progPrice()+16500.0;
    }

    @Override
    public String prepareProg() {
        return super.prepareProg()+" With CS Degree in SAR is: ";
    }

}
