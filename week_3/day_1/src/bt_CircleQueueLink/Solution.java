package bt_CircleQueueLink;

public class Solution {
    private Queue queue = new Queue();
    public void enQueue(Node node) {
//        kiểm tra Q rỗng hay ko?
        if (queue.front == null && queue.rear == null) {
            queue.front = queue.rear = node;
        }else {
            Node temp = queue.rear;
            queue.rear = node;
            temp.link = queue.rear;
            queue.rear.link = queue.front;
        }
    }
    public void deQueue() {
//        Kiểm tra Q trống hay ko
        if (queue.front == null) {
            System.out.println("Queue is empty");
            return;
        }else {
            if (queue.front == queue.rear){
                queue.front = queue.rear = null;
            }else {
                queue.front = null;
                queue.front = queue.front.link;
                queue.rear.link = queue.front;
            }

        }

    }
    public void displayQueue() {
//        in ra các giá trị trong q
        Node temp = queue.front;
        if (queue.front == null) {
            System.out.println( "No Node");
        }
        if (queue.front==queue.rear) {
            System.out.println(queue.front.data);
        }
        if (queue.rear != queue.front) {

//            System.out.println(queue.front.data);
//            System.out.println(queue.front.link.data);
//            System.out.println(queue.rear.data);
            while (temp.link != queue.front) {
                System.out.println(temp.data);
                temp = temp.link;
            }
            System.out.println(temp.data);
        }

    }
}
