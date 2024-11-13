package Question1;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();

        // Adding elements
        for (int i = 0; i < 150; i++) {
            myList.add(i);
        }

        // Retrieving elements
        System.out.println("Element at index 10: " + myList.get(10));

        // Deleting by index
        myList.deleteAtIndex(10);
        System.out.println("After deletion, element at index 10: " + myList.get(10));

        // Deleting by value
        myList.deleteByValue(25);
        System.out.println("Size after deletion: " + myList.getSize());
    }
}
