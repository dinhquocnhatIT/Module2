import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhap size cua mang
        System.out.println("Enter size");
        int size = sc.nextInt();
        //khai bao mang
        int list [] = new int[size];
        //nhap list
        System.out.println("Enter" + list.length + "values");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }
        //in ra list
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }
    public  static  void insertionSortByStep(int [] list) {
        int x,pos;
        for (int i = 0; i < list.length; i++) {
            x = list[i];
            pos = i;
           while(pos > 0 && x < list[pos - 1]) {
               list[pos] = list[pos - 1];
               pos--;
           }
           list[pos] = x;
            System.out.println("list after the " + i + "' sort: '");
            for (int j = 0; j < list.length; j ++){
                System.out.println(list[j] + "\t");
            }
            System.out.println();
        }
    }
}

