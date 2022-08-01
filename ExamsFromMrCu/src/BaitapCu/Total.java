package BaitapCu;

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        int x = sc.nextInt();
        System.out.println("Enter Y");
        int y = sc.nextInt();
        int sumOfSquares = 0;
        // i chay tu x den y, nen gan i = x
        if (y == 0) {
            System.out.println("Sai");
            return;
        }
        if (x > y) {
            System.out.println("Sai");
            return;
        }
        for (int i = x; i <= y; i++) {
            sumOfSquares += Math.pow(i, 2);
        }
        System.out.printf("sum of squares form %d to %d: %d", x, y, sumOfSquares);
    }
}
