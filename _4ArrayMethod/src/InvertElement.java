import java.util.Scanner;

public class InvertElement {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        }
            while (size > 20);

        int i = 0;
        array = new int[size];
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + ":");
            array [i] = scanner.nextInt();
            i ++;
        }
        System.out.printf("\n%-20s%s","Elements in array","");
        for (int j = 0; j < array.length; j ++) {
            System.out.println(array[j]);
        }
        for(int j = 0; j < array.length/2; j ++) {
            int temp = array[j];
            array[j] = array[size - 1 -j];
            array[size - 1 -j] = temp;
        }
        System.out.printf("\n%-20s%s", "Revers array", "");
        for(int j = 0; j < array.length; j ++) {
            System.out.println(array[j]);
        }
    }
}
