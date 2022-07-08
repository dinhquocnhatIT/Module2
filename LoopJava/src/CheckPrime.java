import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check prime");
        int n = scanner.nextInt();
        boolean isPrime = true;
        if (n < 2) {
            System.out.println("It's not a prime");
        }
        else {
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    isPrime = false;
                    i++;
                    break;
                }
                isPrime = true;
            }
        }
        if (isPrime) {
            System.out.println(n + " " +" is a prime number");
        } else {
            System.out.println(n + " " +"is not a prime number");
        }
    }
}
