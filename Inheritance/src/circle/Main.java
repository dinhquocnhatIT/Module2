package circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3,"pink");
        System.out.println(circle);
        //cylinder
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3,"grey",6);
        System.out.println(cylinder);
    }
}
