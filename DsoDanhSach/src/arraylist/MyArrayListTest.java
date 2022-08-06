package arraylist;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyArrayListTest {
    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("8",2);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println("so luong cac phan tu co trong mang: " +myArrayList.size());
        System.out.println("phan tu nay co vi tri thu:  " + myArrayList.indexOf("8"));
        System.out.println("phan tu nay co trong mang khong: " + myArrayList.contains("8"));
//        MyArrayList<Integer> newMyArrayList = new MyArrayList<>();
//        newMyArrayList = myArrayList.clone();
//        for (int i = 0; i < newMyArrayList.size(); i++) {
//            System.out.println("new my array list: " + newMyArrayList.get(i));
//        }
//        myArrayList.remove(0);
//        System.out.println("after removed: ");
//        for (int i = 0; i < myArrayList.size(); i++) {
//            System.out.println( myArrayList.get(i));
//        }
    }
}
