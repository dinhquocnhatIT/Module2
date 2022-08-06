package linkedlist;

public class MyLinkedList<E> {
    //phần tử đầu tiên của danh sach liên kết
    private Node head;
    //số lượng phần tử
    private  int numOfNode =0;

    public MyLinkedList() {
        this.head = head;
    }

    public void addFirst(E data) {
//        if (head == null) {
//            head = new Node(data);
//
//        }else {
            //khai báo biến temp tror đến giá trị của head
            Node temp = head;
            //biến head nhận giá trí là node mới
            head = new Node(data);
            //head.next tror đến temp
            head.next = temp;
            //tăng size lên
            numOfNode++;
//        }
    }
    public void addByIndex(int index,E data) {
        //khai báo temp tro đến head
       Node temp = head;
        for (int i = 0; i < index -1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //khai báo 1 node là holder gán cho temp.next
        Node holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numOfNode++;
    }
    public void addLast(E data) {
        if (head == null) {
            addFirst(data);
        }else {
            //khai báo temp trỏ đến head
            Node temp = head;
            //cho temp chạy đến phần tủ cuối cùng của danh sách
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
            numOfNode++;
        }
    }
    public E get(int index) {
        //khai bao bien temp bang head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public int size() {
        return numOfNode;
    }
    public E remove(int index) {
        if (index < 0 || index > numOfNode) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        //khai bao bien temp tro den head
        Node temp = head;
        Object data;
        //neu index =0 thi tra ve data hien tai
        if (index ==0){
            data = temp.data;
            head = head.next;
            numOfNode--;
        }else {
            for (int i =0; i < index -1 && temp.next != null; i++){
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numOfNode--;
        }
        return (E) data;
    }
    public boolean removeE(E element){
        //remove doi tuong neu la element head
        if (head.data.equals(element)){
            remove(0);
            return true;
        }else {
            //khai bao temp tro len head
            Node temp = head;
            while (temp.next != null){
                //neu nhu ton tai 1 phan tu cua data truyen vao thi bi remove
                if (temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numOfNode--;
                    return true;
                }
            }
        }
        return false;
    }
    public MyLinkedList<E> clone() {
        if (numOfNode == 0){
            throw new IllegalStateException("Cloning is not allowed" );
        }
        //khai bao linked list tra ve
        MyLinkedList<E> returnLinkedList = new MyLinkedList<E>();
        //khai bao 1 temp tro den head
        Node temp = head;
        //add temp lam danh sach tra ve de lam head
        returnLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }
    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numOfNode;i++) {
            if (temp.getData().equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
}
