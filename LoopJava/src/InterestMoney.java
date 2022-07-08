import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 1;
        int month = 1;
        double interestRate = 1;
        System.out.println("Enter investment mount: ");
        money = sc.nextDouble();
        System.out.println("Enter number of month: ");
        month = sc.nextInt();
        System.out.println("Enter interest rate: ");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total interest rate: " + totalInterest);
    }
}
