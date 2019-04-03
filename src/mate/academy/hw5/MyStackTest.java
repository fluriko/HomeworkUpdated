package mate.academy.hw5;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("one");
        myStack.push("two");
        myStack.push("three");
        myStack.push("four");
        System.out.println("My stack:");
        System.out.println(myStack);

        System.out.println("Size is:");
        System.out.println(myStack.size());

        myStack.remove();
        System.out.println("My stack after remove:");
        System.out.println(myStack);
        System.out.println(myStack.size());


        System.out.println("My stack bottom:");
        System.out.println(myStack.peek());

        myStack.pop();
        System.out.println("My stack after poll:");
        System.out.println(myStack);

        myStack.clear();
        System.out.println("My stack after clear:");
    }
}
