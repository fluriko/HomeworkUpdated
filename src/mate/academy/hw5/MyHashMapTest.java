package mate.academy.hw5;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("Freya", 5);
        myHashMap.put("Sol", 7);
        myHashMap.put("Odin", 3);

        System.out.println("My hash map:");
        System.out.println(myHashMap);

        System.out.println("\nSize is: ");
        System.out.println(myHashMap.size());

        System.out.println("\nValue of key Sol:");
        System.out.println(myHashMap.get("Sol"));

        myHashMap.put("Odin", 9);
        System.out.println("\nMy hash map after putting new Odin");
        System.out.println(myHashMap);

        myHashMap.remove("Odin");
        System.out.println("\nMy hash map after removing Odin");
        System.out.println(myHashMap);

        myHashMap.clear();
        System.out.println("\nMy hash map after clearing:");
        System.out.println(myHashMap);
    }
}
