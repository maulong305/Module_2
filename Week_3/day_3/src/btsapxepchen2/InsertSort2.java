package btsapxepchen2;

public class InsertSort2 {
    static void insert2( int[] list) {
        int temp;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            for (int j = i - 1; j >= 0 && temp < list[j]; j--) {
                list[j + 1] = list[j];
                list[j] = temp;
            }
        }
    }
}
