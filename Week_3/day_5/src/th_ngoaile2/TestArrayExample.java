package th_ngoaile2;

import java.util.Scanner;

public class TestArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chỉ số của phần tử ");
        int x = scanner.nextInt();
        try{
            System.out.println("giá trị của phần tử có chỉ số  " + x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("chỉ số vượt quá giới hạn của mảng");
        }
    }
}
