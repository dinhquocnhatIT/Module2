package thuchanhlinkedlist;

import list.MyList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkdedList<Integer> myList = new MyLinkdedList(10);
        myList.addFirst(1);
        myList.add(2,15);
        myList.add(3,9);
        myList.add(4,8);
        myList.printList();
    }
}
