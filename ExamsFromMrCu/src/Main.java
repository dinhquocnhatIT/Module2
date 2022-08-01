import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Chon chuc nang");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("************ USER MANAGER *************");
                    System.out.println("*      1.Them nguoi dung             *");
                    System.out.println("*      2.sua thong tin nguoi dung    *");
                    System.out.println("*      3.hien danh sach nguoi dung   *");
                    System.out.println("*      4.quay lai                    *");
                    System.out.println("**************************************");
                    break;
                case 2:
                    System.out.println("********************** Cake *********************");
                    System.out.println("*      1.Them banh                              *");
                    System.out.println("*      2.thong tin banh                         *");
                    System.out.println("*      3.hien danh sach banh                    *");
                    System.out.println("*      4.quay lai                               *");
                    System.out.println("*************************************************");
                    break;
                case 3:
                    System.out.println("*********************** Order ***************");
                    System.out.println("*      1.Tinh trang don hang                *");
                    System.out.println("*      2.thog tin don hang                  *");
                    System.out.println("*      3.danh sach don hang                 *");
                    System.out.println("*      4.quay lai                           *");
                    System.out.println("**********************************************");
                    break;
                case 4:
                    menu();
                    break;
                default:
                    System.out.println("Khonng co chuc nang!");
                    menu();
            }
        }
    }
    public  static  void   menu () {
        System.out.println("************ Main Menu *************");
        System.out.println("*   1. Quan li nguoi dung    *");
        System.out.println("*   2. Quan li banh          *");
        System.out.println("*   3. Quan li don dat hang  *");
        System.out.println("***********************************");
    }
}