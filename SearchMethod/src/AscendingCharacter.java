import java.util.LinkedList;
import java.util.Scanner;

public class AscendingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi");
        String str = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        // tim chuoi tang dan co do dai lon nhat
        for (int i = 0; i < str.length(); i++) {
            //khai bao 1 linked list trung gian cac ki tu cua chuoi tang da
            LinkedList<Character> list = new LinkedList<>();
            //them ki tu i vao trong list
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                //kiem tra ki tu tiep theo co lon hon ki tu cuoi cung trong list hay khong
                if (str.charAt(j) > list.getLast()) {
                    //neu co thi them vao trong list
                    list.add(str.charAt(j));
                }
            }
            //so sanh kich co cua list trung gian va list chuoi tang dan co kich thuoc lon nhat
            if (list.size() > max.size()) {
                //neu kich co cua list trung gian lon hon kisch co cua list co do dai lon nhat thi gan lai max
                max.clear();
                max.addAll(list);
            }
        }
        //hien thi chuoi tang dan dai nhat
        for (Character ch: max) {
            // 1 vong lap
            System.out.println(ch);//1 cau lenh
        }
        System.out.println();
    }
}
