package src;

import java.util.Scanner;

public class CountCharOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string");
        String str = sc.nextLine();
        System.out.println("Input a character want to count in string: ");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
          if(str.charAt(i) == c) {
              count++;
          }
        }
        System.out.printf("So lan xuat hien cua ki tu" + c + "trong chuoi" + str + " la " + count);
    }
}
