import java.util.Scanner;

public class DaysOnMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which month that you want to count days?");
        System.out.println("Enter month");
        int month = sc.nextInt();
        String dayInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31 days";
                break;
            case 2:
                dayInMonth = "28 days or 29 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30 days";
                break;
            default:
                dayInMonth = "";
        }
        if (!dayInMonth.equals("")) {System.out.printf("The month '%d' has %s!", month, dayInMonth);}
        else System.out.println("Invalid input");
    }
}
