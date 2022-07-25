package shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("blue",false);
        System.out.println(shape);

        //circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3);
        System.out.println(circle);

        circle = new Circle(3.5,"black",false);
        System.out.println(circle);

        //Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2,4);
        System.out.println(rectangle);

        rectangle = new Rectangle("White",true,8,3);
        System.out.println(rectangle);

        //Square
        Square square = new Square();
        System.out.println(square);

        square = new Square(4);
        System.out.println(square);

        square = new Square(4.5,"yellow",false);
        System.out.println(square);
    }


}
