package bt_timkiem2cm;

public class Search2cm {
    static int search2cm(int[] list, int key) {
        int low = 0;
        int hight = list.length - 1;
        while (hight >= low) {
            int mid = (low + hight)/2;
            if (key == list[mid]) {
                return mid;
            }
            else if (list[mid] > key) {
                hight = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
