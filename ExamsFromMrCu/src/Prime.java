import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number");
//        int n = sc.nextInt();
        int n = 30;
        System.out.printf("%d so nguyen to dau tien la: \n",n);
        int count = 0; // dem so nguyen to
        int prime = 2; // so nguyen to bat dau tu 2
        // dem cac so nguyen to khi truyen ham vao
        // prime follow the count de chay 30 so
        while(count < n) {
            if (isPrimeNumber(prime)) {
                System.out.println(prime + "");
                count++;
            }
            prime++;
        }
    }
    // check so nguyen to
    // true la so nguyen to
    //false khong phai la so nguyen to
    // tao ham isPrimeNumber tham so la n de kiem tra so nguyen to
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
