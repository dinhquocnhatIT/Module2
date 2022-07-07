import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        double width ;
        double height ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        width = sc.nextDouble();
        System.out.println("Enter height");
        height = sc.nextDouble();
        double area = width * height ;
        System.out.println("Area: " + area);
    }
}
