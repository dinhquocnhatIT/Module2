package circle;

public class Circle {
    private String color = "black";
    private double radius = 1;
     Circle() {}
    Circle(double radius, String color) {
         this.radius = radius;
         this.color = color;
     }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
         return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius= " + radius +
                "area=" + getArea() +
                '}';
    }
}
