package mate.academy.hw4;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Sunday");
        myArrayList.add("Monday");
        myArrayList.add("Tuesday");
        myArrayList.add("Wednesday");
        myArrayList.add("Friday");
        System.out.println("My array list:");
        System.out.println(myArrayList);

        System.out.println("\nMy array list is empty:");
        System.out.println(myArrayList.isEmpty());

        System.out.println("\nMy array list size is:");
        System.out.println(myArrayList.size());

        System.out.println("\nElement on index 2");
        System.out.println(myArrayList.get(2));

        myArrayList.add("took Monday place", 1);
        System.out.println("\nMy array list after add element on index 1:");
        System.out.println(myArrayList);

        myArrayList.set("replace Monday place", 1);
        System.out.println("\nMy array list after set element on index 1:");
        System.out.println(myArrayList);

        myArrayList.remove("Monday");
        System.out.println("\nMy array list after remove element \"Monday\":");
        System.out.println(myArrayList);

        myArrayList.remove(1);
        System.out.println("\nMy array list after remove element on index 1:");
        System.out.println(myArrayList);

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("first");
        myLinkedList.add("second");
        myLinkedList.add("third");
        myLinkedList.add("fourth");
        myLinkedList.add("fifth");
        myArrayList.addAll(myLinkedList);
        System.out.println("\nMy array list after adding another list");
        System.out.println(myArrayList);
    }
}
