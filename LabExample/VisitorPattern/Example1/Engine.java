package Example1;

public class Engine implements Visitable{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
