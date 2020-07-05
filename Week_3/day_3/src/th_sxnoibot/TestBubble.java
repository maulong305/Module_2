package th_sxnoibot;

import java.util.Scanner;

public class TestBubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.print("Enter " + list.length + "value: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        BubbleSort.bubbleSort(list);
        System.out.print("your input list: ");
        for (int i:list) {
            System.out.print(i + "\t");
        }
    }
}
