package demo;

public class InsertSort {
    public static void insertSort(int[] list) {
        int j;
        for (int i = 0; i < list.length; i++) {
            int currenElement = list[i];
            for (j = i -1; j >= 0 && list[j] > currenElement; j--){
                list[j + 1] = list[j];
            }
            list[j+1] = currenElement;
        }
    }
}
