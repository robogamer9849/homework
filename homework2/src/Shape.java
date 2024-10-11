public class Shape {

    public double area(){
        return 0;
    }


    public double perimeter(){
        return 0;
    }

    public String getclass() {
        return "shape";
    }

    @Override
    public String toString() {
        String pr = String.valueOf(perimeter());
        String ar = String.valueOf(area());
        String type = getclass();

        return "{{" + type + "}:" +
            "{area: " + ar + "}," +
            "{perimeter:" + pr + "}" +
            "}\n";
    }

}
