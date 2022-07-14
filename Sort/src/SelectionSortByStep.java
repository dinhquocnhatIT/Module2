import java.util.Scanner;

public class SelectionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr size: ");
        int size = sc.nextInt();
        int [] list = new int[size];
        System.out.println("Enter " + list.length + " values");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        };
        System.out.println("Your input list");
        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i] + "\t");
        };
        System.out.println("\nBegin sort processing...");
        selectionSort(list);
    }
    public  static void selectionSort(int[] list){
        for (int i = 0; i < list.length - i; i++){
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++){
                if (min > list[j]) {
                    System.out.println("Swap " + min + " with " + list[j]);
                    min = list[j];
                    minIndex = j;
                }
            }
            if (min != i){
                list[minIndex] = list[i];
                list[i] = min;
            }
            System.out.println("list after the " + i + "' sort: '");
            for (int j = 0; j < list.length; j ++){
                System.out.println(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
