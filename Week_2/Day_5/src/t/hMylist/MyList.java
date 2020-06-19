package Day_5;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
//    tăng kích thước mảng
    private void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
//    phương thức add()
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
//    phương thức get()
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("index : " + i + ", size " + i);

        }
        return (E) elements[i];
    }
}
