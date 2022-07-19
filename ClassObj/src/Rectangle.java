public class Rectangle {
        private  double width;
        private double height;
        //constructor
        public Rectangle() {

        }
        public  Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width* height;
        }
        public  double getPerimeters() {
            return (width + height)*2;
        }
        public String  display() {
            return "Rectangle {"+ " width: " + width+" height: "+height+"}" ;
        }
    }

