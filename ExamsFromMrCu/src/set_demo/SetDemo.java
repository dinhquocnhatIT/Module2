package set_demo;

import BaitapCu.Animal;

import java.util.HashSet;
import java.util.Set;
/*Set là một interface kế thừa Collection interface trong java. Set trong java là một Collection không thể chứa các phần tử trùng lặp.

Set được triển khai bởi Hashset, LinkedHashset, Treeset hoặc EnumSet.

HashSet lưu trữ các phần tử của nó trong bảng băm, là cách thực hiện tốt nhất, tuy nhiên nó không đảm bảo về thứ tự các phần tử được chèn vào.
TreeSet lưu trữ các phần tử của nó trong một cây, sắp xếp các phần tử của nó dựa trên các giá trị của chúng, về cơ bản là chậm hơn HashSet.
LinkedHashSet được triển khai dưới dạng bảng băm với có cấu trúc dữ liệu danh sách liên kết, sắp xếp các phần tử của nó dựa trên thứ tự chúng được chèn vào tập hợp (thứ tự chèn).
EnumSet là một cài đặt chuyên biệt để sử dụng với các kiểu enum.*/

public class SetDemo {
    public static void main(String[] args) {
        Set<Animal> setA = new HashSet<>();
        Animal a1 = new Animal(1, "Heo");
        Animal a2 = new Animal(1, "Heo");
        System.out.println(a1 == a2);
    }
}
