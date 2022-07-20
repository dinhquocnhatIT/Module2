package circle;

public class Circle {
    private  double radius = 1;
    private String color = "red";

    public Circle() {

    }
    public  Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return  Math.pow(radius, 2.0) * 3.14;
    }
}
