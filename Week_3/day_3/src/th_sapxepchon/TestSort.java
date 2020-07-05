package th_sapxepchon;

public class TestSort {
    public static void main(String[] args) {
        //    khai báo mảng số thực chưa được sắp xếp.
        double[] list = new double[] {34, 56, 78, 98, 76, 54};
        SelectionSort.selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }
}
