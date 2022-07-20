package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("radius is: ");
        System.out.println(circle.getRadius());
        System.out.println("area is: ");
        System.out.println(circle.getArea());

        Circle c2 = new Circle(3);
        System.out.println("new darius");
        System.out.println(c2.getRadius());
        System.out.println("new area");
        System.out.println(c2.getArea());
    }
}
