package thuc_hanh_stack_linkedlist;

import java.util.LinkedList;

public class MyGenericStack <T>{
    private LinkedList<T> stack;
    public MyGenericStack() {
        stack = new LinkedList<T>();
    }
    public void  push(T element) {
        stack.addFirst(element);
    }
    public T pop() {
        if (isEmpty()){
            throw new IllegalStateException("Stack is emptype");
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }
    public  boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
