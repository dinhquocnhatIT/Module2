public class Circle  extends   Shape   implements  ResizeAble {
    private double  radius;
    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * Math.PI;
    }

    @Override
    public String toString() {
        return "area  = " +
                getArea();
    }

    @Override
    public void resize(double percent) {
        this.radius *= ( percent/200);
    }
}
