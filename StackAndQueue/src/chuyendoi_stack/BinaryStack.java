package chuyendoi_stack;

import java.util.Scanner;
import java.util.Stack;

public class BinaryStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackSoDu = new Stack<Integer>();
        System.out.println("\nNhap so nguyen vao tu ban phim");
        int x = scanner.nextInt();
        while (x>0){
            int soDu = x % 2;
            stackSoDu.push(soDu);
            x =  x / 2;
        }
        System.out.println("So nhi phan la: ");
        int n = stackSoDu.size();
        for (int i = 0; i <n; i++) {
            System.out.print(stackSoDu.pop());
        }
    }
}
