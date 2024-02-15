package shapecompositedemo;

public class Drawing implements Shape2 {
    @Override
    public void draw() {
        System.out.println("This is composite class");
    }
    public void add(Shape2 s){
        s.draw();
    }
}
