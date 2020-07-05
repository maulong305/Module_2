package th_timkiemnhiphan;

public class TestBinary {
    public static void main(String[] args) {
        int[] list = {2, 4, 8, 9, 45, 56, 76, 87, 94};
        System.out.println(BinarySearch.binarySearch(list, 3));
        System.out.println(BinarySearch.binarySearch(list, 45));
        System.out.println(BinarySearch.binarySearch(list, 56));
        System.out.println(BinarySearch.binarySearch(list, 87));
    }

}
