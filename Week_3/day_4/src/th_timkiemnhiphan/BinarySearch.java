package th_timkiemnhiphan;

public class BinarySearch {
//    cài đặt phương thức binarySearch(int[], int key)
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int hight = list.length-1;
        while (hight >= low) {
            int mid = (low + hight)/2;
            if (list[mid] == key) {
                return mid;
            }else if (list[mid] > key) {
                hight = mid - 1;
            }else {
                low = mid + 1;
            }
        }return -1;
    }
}
