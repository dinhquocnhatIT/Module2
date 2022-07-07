import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        // tinh phuong trinh bac nhat
        System.out.println("a*x + b = c");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double a = sc.nextDouble();
        System.out.println("Enter b");
        double b = sc.nextDouble();
        System.out.println("Enter c");
        double c = sc.nextDouble();
        if(a != 0) {
            double result = (c-b)/ a;
            System.out.println("Result: " + result);
        } else if (b == c) {
            System.out.println("The solution is all x!");
        }
        else {
            System.out.println("No solution found");
        }
    }
}
