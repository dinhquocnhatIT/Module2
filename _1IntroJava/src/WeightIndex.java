import java.util.Arrays;
import java.util.Scanner;

public class WeightIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Enter your weight ");
        weight = sc.nextDouble();
        System.out.println("Enter your height ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height,2);
        System.out.printf("%-30s%s","bmi","Interpretation\n");// %-30s tao khoang trang giua bmi va inter

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");// tao khoang trang bmi vs under, .2f lay 2 chu so thap phan
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f %s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
