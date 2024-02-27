package decoratorpatterndemo;

public class ITDegree extends ProgDecorator{

    public ITDegree(Program newProgram) {
        super(newProgram);
    }



    @Override
    public String prepareProg() {
        return super.prepareProg()+"IT Degree fee in SAR is: ";
    }

    @Override
    public double progPrice() {
        return super.progPrice()+15000.0;
    }

}
