package demo;

public class TestInsert {
    public static void main(String[] args) {
        int[] list = {45,67,89,99,87,65,43};
        InsertSort.insertSort(list);
        for (int i : list) {
            System.out.print(i + "\t");
        }
    }
}
