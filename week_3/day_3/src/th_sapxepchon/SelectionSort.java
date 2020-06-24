package th_sapxepchon;

//tạo lớp SelectionSort
public class SelectionSort {
//    khai báo mảng số thực chưa được sắp xếp.
//    cài đặt phương thức selectionSort
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
//        tìm phần tử bé nhất trong mảng
          double min = list[i];
          int minIndex = i;

          for (int j = i + 1; j < list.length; j++) {
              if (min > list[j]) {
                  min = list[j];
                  minIndex = j;
              }
          }
//          Swap
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
}
