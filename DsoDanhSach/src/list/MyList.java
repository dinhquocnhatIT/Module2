package list;

import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;

public class MyList<E> {
    private int size =0;
    private static final int DEFAULT_CAPACITY =10;
   private Object elements[];

    public MyList() {
      elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public E get(int i) {
        if (i >= size || i <0){
            throw new IllegalArgumentException("index: " + i + " size: " + size);
        }
        return (E) elements[i];
    }
}
