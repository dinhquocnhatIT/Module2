import java.util.Scanner;

public class TwentyPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        System.out.printf("%d so nguyen to dau tien la: \n", n);
        int count = 0;
        int prime = 2;
        while (count < n) {
            if (isPrimeNumber(prime)) {
                System.out.println(prime);
                count++;
            }
            prime++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for ( int i = 2;
        i <= squareRoot;
        i++ ){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
