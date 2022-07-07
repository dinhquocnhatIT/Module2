import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        System.out.printf("Hello %s ", name);//prinf %s hien thi chuoi
        System.out.println("Enter your");
    }
}
