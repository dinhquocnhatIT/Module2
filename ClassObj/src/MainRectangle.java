import java.util.Scanner;
 public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        double width = scanner.nextDouble();
        System.out.println("Enter height");
        double height = scanner.nextDouble();
        Rectangle rect = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rect.display());
        System.out.println("Perimeter: " + rect.getPerimeters());
        System.out.println("area: " + rect.getArea());
    }
}


