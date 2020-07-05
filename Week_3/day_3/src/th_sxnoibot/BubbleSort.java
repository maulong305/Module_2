package th_sxnoibot;

public class BubbleSort {
    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i -1; j++) {
                if (list[j] > list[j + 1]) {
//                    System.out.print("Swap " + list[j] + " with " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }

//            System.out.print("List after the " + i + " Sort: ");
//            for (int j = 0; j < list.length; j++) {
//                System.out.print(list[j] + "\t");
//            }
//            System.out.println();
        }
    }
}
