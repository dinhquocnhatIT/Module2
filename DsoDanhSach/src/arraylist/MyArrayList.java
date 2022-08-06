package arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    //so luong
    private int size = 0;
    //suc chua
    private static final int DEFAULT_CAPACITY = 10;
    //mang
    private Object[] elements;


    //phuong thuc khoi tao khong tham so,lay suc hua mac dinh
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    //phuong thuc khoi tao co tham so co suc hua dc truyen vao
    public MyArrayList(int capacity) {
        if (capacity >=0) {
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity must be greater than zero" + capacity);
        }
    }
    public int size() {
        return  this.size;
    }
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(size*2);
        }
        elements[size] = element;
        size++;
        return  true;
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >=0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }else {
            throw new IllegalArgumentException("minCapacity must be greater than zero" + minCapacity);
        }
    }
    public void add(E element, int index) {
        if (index >= elements.length){
            throw new IllegalArgumentException("index" + index);
        } else if (elements.length==size) {
            this.ensureCapacity((size*2));
        }
        if (elements[index] == null){
            elements[index] = element;
            size++;
        }else {

            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }

    }
    public Object get(int index) {
        return (E)elements[index];
    }
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }
    public boolean contains(E element) {
        return this.indexOf(element)  >= 0;
    }
    public MyArrayList<E> clone() {
        MyArrayList<E> ArrayTwo = new MyArrayList<>();
        ArrayTwo.elements = Arrays.copyOf(this.elements,this.size);
        ArrayTwo.size=this.size;
        return ArrayTwo;
    }
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Index out of range: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
