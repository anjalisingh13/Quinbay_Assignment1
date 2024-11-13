package Question1;

public class MyList {
    private int[] arr;         
    private int size;           

    // Constructor with an initial capacity of 100
    public MyList() {
        arr = new int[100];
        size = 0;
    }

    // Method to add a new value to the list
    public void add(int value) {
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
        size--;  
        if (size > 0 && size <= arr.length / 4) {
            resizeArray(arr.length / 2);  
        }
    }

   
    public void deleteByValue(int value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        if (index != -1) {  // Value found, delete it
            deleteAtIndex(index);
        } else {
            System.out.println("Value not found in list.");
        }
    }

 
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
    }

    // Private helper method to resize the array
    private void resizeArray(int newCapacity) {
        int[] newArr = new int[newCapacity];
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
