package reverse_element;

public class Stack {
    //    khai báo thuộc tính
    private int arr[];
    private int size;
    private int index = 0;
    //    Phương thức khởi tạo
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }
    //    cài đặt pt isEmpty()
    public boolean isEmpty(){
        if (index == 0){
            return true;
        }
        return false;
    }

    //    cài đặt pt isFull()
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
    //    cài đặt pt Push()
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("stack is full");
        }
        arr[index] = element;
        index++;
    }
    //    cài đặt pt pop()
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    //    cài đặt pt size()
    public int size() {
        return index;

    }
}
