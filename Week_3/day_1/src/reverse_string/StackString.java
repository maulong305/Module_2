package reverse_string;

public class StackString {
//    khai báo thuộc tính
    private String arr[];
    private int size;
    private int index = 0;
//    phương thức khởi tạo
    public StackString(int size) {
        this.size = size;
        arr = new String[size];
    }
//    cài đặt phương thức empty
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
//    cài đặt phương thức full
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
//    cài đặt phương thức push
    public void push(String element) {
        if (isFull()) {
            throw new StackOverflowError("Stack full, can not add element");
        }
        arr[index] = element;
        index++;
    }
//    cài đặt phương thức pop
    public String pop() throws Exception {
        if (isEmpty()) {
            throw new  Exception("Stack is null");
        }
        return arr[--index];
    }
//    cài đặt phương thức size
    public int size() {
        return index;
    }

}
