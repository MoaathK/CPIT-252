package Example1;

import java.util.ArrayList;
import java.util.List;

public class Bike implements Visitable{
    private List<Visitable> bikeParts = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Visitable part : bikeParts) {
            part.accept(visitor);
        }
    }
    public void addPart(Visitable part) {
        bikeParts.add(part);
    }
}
