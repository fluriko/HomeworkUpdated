package mate.academy.hw4;

public class MyListLinkedTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("first");
        myLinkedList.add("second");
        myLinkedList.add("third");
        myLinkedList.add("fourth");
        myLinkedList.add("fifth");
        System.out.println("My linked list:");
        System.out.println(myLinkedList);

        System.out.println("\nElement of list with index 2:");
        System.out.println(myLinkedList.get(2));

        System.out.println("\nSize of list is:");
        System.out.println(myLinkedList.size());

        System.out.println("\nList is empty:");
        System.out.println(myLinkedList.isEmpty());

        myLinkedList.add("took second place", 1);
        System.out.println("\nMy linked list after adding element with index:");
        System.out.println(myLinkedList);

        myLinkedList.remove("second");
        System.out.println("\nMy linked list after removing element by value:");
        System.out.println(myLinkedList);

        myLinkedList.remove(2);
        System.out.println("\nMy linked list after removing element by index:");
        System.out.println(myLinkedList);

        myLinkedList.set("I'm start", 0);
        System.out.println("\nMy linked list after replacing value on index:");
        System.out.println(myLinkedList);

        List anotherList = new MyLinkedList<>();
        anotherList.add("Hallo");
        anotherList.add("Rain");
        myLinkedList.addAll(anotherList);
        System.out.println("\nMy linked list after appending another linked list:");
        System.out.println(myLinkedList);

        List myArrayList = new MyArrayList<>();
        myArrayList.add("Sunday");
        myArrayList.add("Monday");
        myArrayList.add("Tuesday");
        myArrayList.add("Wednesday");
        myArrayList.add("Friday");
        myLinkedList.addAll(myArrayList);
        System.out.println("\nMy linked list after appending array list:");
        System.out.println(myLinkedList);
    }
}
