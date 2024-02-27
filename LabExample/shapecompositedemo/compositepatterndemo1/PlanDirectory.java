package compositepatterndemo1;

public class PlanDirectory implements Plan{
    public void add(Plan p){
        p.show();
    }
    @Override
    public void show() {
        System.out.print("PlanDirectiory is a COMPOSITE Class \nDomestic Plan and Commercial Plan are examples of Leaf Classes\n");
    }
}
