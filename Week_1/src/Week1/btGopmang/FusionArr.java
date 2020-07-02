package Week1.btGopmang;

public class FusionArr {
    public static void main(String[] args) {
        int[] arr1 = {97, 89, 76, 32, 14};
        int[] arr2 = {7, 9, 6, 2, 1, 4, 8};
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            arr3[(arr1.length) +j] = arr2[j];
        }
        for (int k : arr3) {
            System.out.print(k + " ");
        }

    }
}
