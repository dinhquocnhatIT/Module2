package linkedlist;

import arraylist.MyArrayList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> listArray = new MyLinkedList<>();
        listArray.addFirst(1);
        listArray.addLast(2);
        listArray.addByIndex(0,3);
        System.out.println("size cua mang la: " + listArray.size());
        System.out.println("gia tri cua phan tu trong mang la: ");
        for (int i = 0; i < listArray.size(); i++) {
            System.out.println(listArray.get(i));
        }
        listArray.removeE(3);
        System.out.println("list sau khi remove");
        for (int i = 0; i < listArray.size(); i++) {
            System.out.println(listArray.get(i));
        }
        System.out.println(listArray.indexOf(2));
    }
}
