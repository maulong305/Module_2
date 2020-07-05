package btsapxepchen2;

import bt_sapxepchen1.InsertSort;

public class Test {
    public static void main(String[] args) {
        int[] list = { 87,64,54,67,93,22};
        InsertSort2.insert2(list);
        for (int a : list) {
            System.out.print(a + " ");
        }
    }
}
