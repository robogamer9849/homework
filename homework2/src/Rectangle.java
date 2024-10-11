public class Rectangle extends Shape{
    private double hight;
    private double width;


    public Rectangle(double hight, double width) {
        this.hight = hight;
        this.width = width;
    }


    public Rectangle(double side) {
        this.hight = side;
        this.width = side;
    }

    @Override
    public double area(){
        return hight + width * 2;
    }

    @Override
    public double perimeter(){
        return hight * width;
    }

    @Override
    public String getclass() {
        return "Rectangle";
    }



}
