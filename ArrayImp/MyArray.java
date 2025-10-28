public class MyArray {
    private int[] data;
    private int size;

    // Constructor with initial capacity
    public MyArray(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // Add element at the end
    public void add(int value) {
        ensureCapacity();
        data[size++] = value;
    }

    // Insert element at specific index
    public void insert(int index, int value) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        ensureCapacity();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }

    // Update element at index
    public void update(int index, int value) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        data[index] = value;
    }

    // Delete element at index
    public void delete(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    // Get element at index
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return data[index];
    }

    // Get current size
    public int size() {
        return size;
    }

    // Resize array if needed
    private void ensureCapacity() {
        if (size == data.length) {
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    // Print all elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
  

    public static void main(String[] args) {
        MyArray arr = new MyArray(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.print();
        System.out.println(arr);
        
        
    }
}
