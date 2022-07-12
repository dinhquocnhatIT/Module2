package src;

public class TotalDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 8, 6},
                {5, 8, 9},
        };
        int toltal = 0;
        int total_2 = 0;
        for (int row = 0; row < matrix.length; row++) {
            toltal += matrix[row][row];
            total_2 += matrix[row][matrix.length - 1- row];// lay chi so matrix 3 - 1-1 =1 chi so mot co gia tri la 8
        }
        System.out.println("Tong duong cheo cua matrix = " + toltal);
        System.out.println("Tong duong cheo cua matrix = " + total_2);
    }
}
