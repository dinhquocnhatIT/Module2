import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        double a = sc.nextDouble();
        System.out.println("enter b");
        double b = sc.nextDouble();
        System.out.println("enter c");
        double c = sc.nextDouble();
        QuadraticEquation quad = new QuadraticEquation(a, b, c);
        if (quad.getDiscriminant() < 0) {
            System.out.println("vo nghiem");
            return;
        } if (quad.getDiscriminant() ==0) {
            System.out.println("1 nghiem kep" + quad.getRoots());
            return;
        }
        System.out.println("nghiem r1" + quad.getRoot1());
        System.out.println("nghiem r2" + quad.getRoot2());

    }
}
