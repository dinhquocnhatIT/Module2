package src;

public class Min {
    public static void main(String[] args) {
        int [] arr = {4,12,5,6,8,9,7};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public  static  int minValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr.length) {
                index = i;
            }
        }
        return index;
    }
}
