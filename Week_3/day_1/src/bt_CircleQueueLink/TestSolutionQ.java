package bt_CircleQueueLink;

public class TestSolutionQ {
    public static void main(String[] args) {
//        khởi tạo Solution
        Solution solution = new Solution();
        Node node = new Node();
        node.data = 1;
        Node node1 = new Node();
        node1.data = 2;
        Node node2 = new Node();
        node2.data = 3;
        Node node3 = new Node();
        node3.data = 4;


        solution.enQueue(node);
        solution.enQueue(node1);
        solution.enQueue(node2);
        solution.enQueue(node3);

        solution.displayQueue();
    }
}
