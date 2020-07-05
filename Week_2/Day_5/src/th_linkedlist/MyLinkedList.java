package th_linkedlist;

public class MyLinkedList {
//    khai báo thuộc tính
    private Node head;
    private int numNodes;
//    phương thức khởi tạo
    public MyLinkedList(Object data){
        head = new Node(data);
    }

//    cài đặt PT add
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        // 1. duyệt đến phần tử cần thêm
        for (int i = 0; i< index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;

        //2. gán node mới
        Node newNode = new Node(data);
        temp.next = newNode;

        //3.gán next của node mới sang index cũ.
        newNode.next = holder;
        numNodes++;
    }
//    cài đặt PT addFirst()
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
//    cài đặt PT get()
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
//    cài đặt PT printList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }
    //khai báo lớp Node

    private class Node{
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
    }

}
