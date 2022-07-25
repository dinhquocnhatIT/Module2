package circle;

public class Cylinder extends Circle {
    private double height = 1;
    Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getRadius() * super.getRadius() * height * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius= " + super.getRadius() +
                "height= " + height +
                "volume= " + getVolume() +
                '}';
    }
}
