import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double vnd = 23000;
        double usd;
        System.out.println("Enter USD: ");
        usd = sc.nextDouble();
        double change = usd * vnd;
        System.out.println("Your Money: " + change +"vnd");
    }
}
