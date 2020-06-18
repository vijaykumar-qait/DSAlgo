package DSAndAlgo;

public class DynamicArray<String> {

    private  Object[] data;
    private  int size;
    private  int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    /**
     * return element at given index in array
     * @param index in array
     * @return
     */
    public String get(int index) {
        return (String)data[index];
    }

    /**
     * set value in array at given index
     * @param index
     * @param value
     */
    public void set(int index, String value) {
        data[index] = value;
    }

    /**
     * insert value at given position in array
     * @param index
     * @param value
     */
    public void insert(int index, String value) {
        //check for size of array
        if(size == initialCapacity) {
            resize();
        }

        //do the insert
        for(int i=size; i>index; i++) {
            data[i] = data[i-1];
        }
        set(index,value);
        size++;

    }

    /**
     * to dynamically double the size of arrya
     */
    private void resize() {
        Object [] newData = new Object[initialCapacity*2];
        for(int i=0; i<initialCapacity; i++) {
            newData[i] = data[i];
        }

        data = newData;
        initialCapacity = initialCapacity*2;
    }

    /**
     * delete element from array at give index
     * @param index
     */
    public void delete(int index) {
        for(int i = index; i<size; i++) {
            data[i] = data[i+1];
        }
        size--;
    }

    /**
     * Check whether array is empty or not
     * @return
     */
    public boolean isEmpty() {
        return size==0;
    }

    public boolean Contains(int value) {
        for(int i=0; i<size; i++) {
            if(data[i].equals(value)) {
                return true;
            }
        }
        return  false;
    }

    /**
     * Print tha array
     */
    public void print() {
        for(int i=0; i<size; i++) {
            System.out.print(data[i] + " ");
        }
    }

    /**
     * Adding an element to the array
     * @param value
     */
    public void add(int value) {
        if(size==initialCapacity) {
            resize();
        }

        data[size] = value;
        size++;
    }

}
