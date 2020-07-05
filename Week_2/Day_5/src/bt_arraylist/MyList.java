package bt_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    //region Constructor
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }
    //endregion

    public void ensureCapacity(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);

    }

    public void add(int index, E element){

        for (int i = elements.length; i > index; i--){
            Object temp = elements[i];
            elements[index] = element;
            elements[index + 1] =temp;
        }
    }

    public E get(int index) {
        return null;
    }

    public E remove(int index) {
        return null;
    }

    public boolean add(E e) {
        return true;
    }

    public void clear() {

    }
    public int size() {
        return 0;
    }
    public E clone() {
        return null;
    }
    public boolean contains(E o) {
        return true;
    }
    public int indexOf(E o){
        return 0;
    }
  }
