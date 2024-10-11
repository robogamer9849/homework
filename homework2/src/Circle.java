public class Circle extends Shape {

    private double redius;
    private double pi;

    public Circle(int redius, double pi) {
        this.redius = redius;
        this.pi = pi;
    }

    @Override
    public double area(){
        return 2 * pi * redius;
    }

    @Override
    public double perimeter() {
        return redius * redius * pi;
    }

    @Override
    public String getclass() {
        return "Circle";
    }

}
