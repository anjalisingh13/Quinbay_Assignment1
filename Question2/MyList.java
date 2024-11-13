package Question2;

public class MyList<T> {
    private T[] arr;         
    private int size;       

    @SuppressWarnings("unchecked")
    public MyList() {
        arr = (T[]) new Object[100];  // Generic array creation
        size = 0;
    }

    // Method to add a new value to the list
    public void add(T value) {
        if (size == arr.length) { 
            resizeArray(arr.length * 2);  
        }
        arr[size] = value;  
        size++;           
    }

    // Method to delete an element based on its index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1]; 
        }
        arr[size - 1] = null; 
        size--;  
        if (size > 0 && size <= arr.length / 4) {
            resizeArray(arr.length / 2); 
        }
    }

    // Method to delete the first occurrence of a specific value
    public void deleteByValue(T value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(value)) { 
                index = i;
                break;
            }
        }
        if (index != -1) { 
            deleteAtIndex(index);
        } else {
            System.out.println("Value not found in list.");
        }
    }

    // Method to retrieve a value at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
    }

    // Private helper method to resize the array
    @SuppressWarnings("unchecked")
    private void resizeArray(int newCapacity) {
        T[] newArr = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // Method to get the current size of the list
    public int getSize() {
        return size;
    }
}

