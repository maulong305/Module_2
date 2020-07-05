package noibot2;

public class TestBubble {
    public static void main(String[] args) {
        int[] list = {7,4,3,5,6,9};
        BubbleSort2.bubbleSort2(list);
        for (int a:list) {
            System.out.print(a + " ");
        }
    }
}
