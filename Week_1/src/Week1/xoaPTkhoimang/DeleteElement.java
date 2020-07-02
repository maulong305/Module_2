package Week1.xoaPTkhoimang;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
//        Khai báo và khởi tạo mảng số nguyên gồm N phần tử
        int[] arr = {10, 4, 6, 7, 8, 6};

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số muốn xóa: ");
        int x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arr[i] = 0;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1]=0;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
