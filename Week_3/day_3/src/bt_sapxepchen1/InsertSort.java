package bt_sapxepchen1;

public class InsertSort {
    static void insert(int[] list) {
        int temp;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            for (int j = i - 1; j > 0 && temp < list[j]; j--) {
                list[j+1] =  list[j];
                list[j] = temp;
            }
        }
    }
}
