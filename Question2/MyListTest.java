package Question2;
public class MyListTest {
    public static void main(String[] args) {
        // Integer list
        MyList<Integer> intList = new MyList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("Integer at index 1: " + intList.get(1)); // Outputs: 20
        intList.deleteByValue(20);
        System.out.println("Size after deletion: " + intList.getSize()); // Outputs: 2

        // String list
        MyList<String> stringList = new MyList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("String at index 0: " + stringList.get(0)); // Outputs: Hello
        stringList.deleteAtIndex(1);
        System.out.println("Size after deletion: " + stringList.getSize()); // Outputs: 1

        // Custom class list
        MyList<Person> personList = new MyList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        System.out.println("Person at index 0: " + personList.get(0).getName()); // Outputs: Alice
    }
}



