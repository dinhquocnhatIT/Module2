package thuc_hanh_stack_linkedlist;

public class GenericStackClient {
    private static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println("Size of stack: " + stack.size());
        System.out.println("Pop element from stack: ");

        while (!stack.isEmpty()){
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("size of stack after pop: " + stack.size());
    }
    private static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("size of stack" + stack.size());
        System.out.println("pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %d",stack.pop());
        }
        System.out.println("size of stack after pop: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("stack of integer: ");
        stackOfInteger();
        System.out.println("stack of String: ");
        stackOfStrings();
    }
}
