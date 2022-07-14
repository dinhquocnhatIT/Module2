public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Sorted list");
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
    static  int [] list = {7,3,5,2,1,9,6};
    public static void insertionSort(int [] list) {
        int x,pos;
        for (int i = 0; i < list.length; i++) {
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }
}
