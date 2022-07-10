import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check prime");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("It's not a prime");
        }
        else {
            int i = 2;
            boolean isPrime = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime ) {
                System.out.println(n + " " +" is a prime number");
            } else {
                System.out.println(n + " " +"is not a prime number");
            }
        }

    }
}
