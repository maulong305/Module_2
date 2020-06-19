package day_2.daonguocmang;

import java.util.Scanner;

public class SwingArray {
    public static void main(String[] args) {

//    khai báo biến, nhập kích thước mảng
       int size ;
       int[] array;
       Scanner scanner = new Scanner(System.in);
       do {
           System.out.print("Enter a size: ");
           size = scanner.nextInt();
           if (size > 20) {
               System.out.println("Size does not exceed 20");
           }
       }while (size > 20);

//    nhập giá trị cho các phần tử
       array = new int[size];
       int i = 0;
       while (i < size) {
           System.out.print("Enter element " + (i+1) + ":");
           array[i] = scanner.nextInt();
           i++;
       }
//    in mảng đã nhập
        System.out.printf("%-20s%s", "Elements in array: ", "");
       for (int j = 0; j < size; j++){
           System.out.print(array[j] + "\t");
       }
//    đảo ngược thứ tự
        for (int j = 0; j < size-j; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.println("\t");
//    in mảng mới
        System.out.printf("%-20s%s", "Swing array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }

    }
}
