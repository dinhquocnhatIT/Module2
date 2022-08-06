package stackdemo;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stackDemo = new Stack<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        for (int i = 0; i <s.length() ; i++) {
            stackDemo.push(s.charAt(i) + " ");
        }
        System.out.println("chuoi dao nguoc: ");
        for (int i = 0; i <s.length() ; i++) {
            System.out.print(stackDemo.pop());
        }
        System.out.println();
        //chuyen doi thanh so nhi phan
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so de chuyen doi: ");
        int x = sc.nextInt();
        while (x > 0) {
            int soDu = x%2;
            stack.push(soDu);
            x = x/2;
        }
        System.out.println("so nhi phan la: ");
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }

    }
}
