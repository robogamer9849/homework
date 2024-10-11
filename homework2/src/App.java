import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle(10, Math.PI);
        Circle circle1 = new Circle(10, 3.14);
        Rectangle rectangle = new Rectangle(10.45, 20.53);
        Rectangle squre = new Rectangle( 5);
        Triangle fakeTriangle = new Triangle(410, 5, 6);
        Triangle triangle = new Triangle(4, 5, 6);

        shapes.add(circle);
        shapes.add(circle1);
        shapes.add(rectangle);
        shapes.add(squre);
        shapes.add(triangle);
        shapes.add(fakeTriangle);

        System.out.println(shapes);
    }
}
