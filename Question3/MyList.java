package Question3;
import java.util.Arrays;

public class MyList<T> {
    private Object[] array;
    private int size;

    // Default constructor to initialize the array with size 100
    public MyList() {
        array = new Object[100]; 
        size = 0; 
    }

    // Add an element to the list
    public void add(T element) {
        if (size == array.length) {
            // If the array is full, double its size
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = element;
        size++;
    }

    // Delete an element based on its index
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < size) {
         
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null; 
            size--;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Delete an element based on its value
    public void deleteByValue(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                deleteAtIndex(i); 
                return;
            }
        }
        System.out.println("Value not found");
    }

  
    @SuppressWarnings("unchecked") 
    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) array[index]; 
        } else {
            System.out.println("Index out of bounds");
            return null;
        }
    }

    // Get the current size of the list
    public int getSize() {
        return size;
    }
}
