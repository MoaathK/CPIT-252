package shapecompositedemo;

public class ShapeCompositeDemo {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Shape2 circle = new Circle();
        Shape2 rectangle = new Rectangle();

        drawing.draw();
        drawing.add(circle);
        drawing.add(rectangle);

    }
}
