package bt_sapxepchen1;

public class TestInsert {
    public static void main(String[] args) {
        int[] list = {98,2,3,45,67,89,76,54,32};
        InsertSort.insert(list);
        for (int i: list) {
            System.out.print(i + " ");

        }
    }
}
