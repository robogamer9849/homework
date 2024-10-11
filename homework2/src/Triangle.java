public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3) {

        try{
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }

            else {
                throw new IllegalArgumentException("the values provided don't make a triangle so all the functions for this 'not triangle' will return 0");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public double area(){
        // calculaltes the area using "heron's formula"
        double semi_perimeter = perimeter() / 2;
        double area = Math.sqrt(semi_perimeter * (semi_perimeter - side1) * (semi_perimeter - side2) * (semi_perimeter - side3));
        return area;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String getclass() {
        return "Triangle";
    }

}
