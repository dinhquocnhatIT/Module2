package shape;

public class Rectangle extends Shape{
    private double length = 1;
    private double width = 1;
    Rectangle() {

    }
    Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getPerimeters() {
        return 2 * ( width + this.length );
    }
    public double getArea() {
        return (width + this.length);
    }

    @Override
    public String toString() {
        return " A rectangle with width="
                + getWidth() + ", height="
                + getLength() +
                ", which is a subclass of " + super.toString();
    }
}
