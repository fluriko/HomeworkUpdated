package mate.academy.hw5;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("one");
        myQueue.add("two");
        myQueue.add("three");
        myQueue.add("four");
        System.out.println("My queue:");
        System.out.println(myQueue);

        System.out.println("Size is:");
        System.out.println(myQueue.size());

        myQueue.remove();
        System.out.println("My queue after remove:");
        System.out.println(myQueue);
        System.out.println(myQueue.size());


        System.out.println("My queue head:");
        System.out.println(myQueue.peek());

        myQueue.poll();
        System.out.println("My queue after poll:");
        System.out.println(myQueue);

        myQueue.clear();
        System.out.println("My queue after clear:");
    }
}
