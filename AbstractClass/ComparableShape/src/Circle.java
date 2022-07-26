public class Circle {
       private String color;
        private boolean filled;
        private double radius = 1;
        public Circle() {

        }
        public Circle(double radius) {
            this.radius = radius;
        }

        Circle(double radius,String color, boolean filled) {
            this.color = color;
            this.filled = filled;
            this.radius = radius;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double getPerimeters() {
            return  2 * radius * Math.PI;
        }
        public  double getArea() {
            return radius * radius * Math.PI;
        }

        @Override
        public String toString() {
            return " A circle with radius= "
                    + getRadius()
                    +"color= " + getColor();
        }
}
