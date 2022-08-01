public class Rectangle  extends Shape  implements  ResizeAble {
    private  double width;

    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width   *  this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "area=" + getArea() +
                '}';
    }


    @Override
    public void resize(double percent) {
           this.width  *=   percent/200;
           this.height *= percent/200;
    }
}
