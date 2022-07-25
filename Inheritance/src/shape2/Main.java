package shape2;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("blue",false);
        //triangle
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(3,4,5);
        System.out.println(triangle);
        triangle = new Triangle("blue", false,2,6,7);
        System.out.println(triangle);
    }
}
