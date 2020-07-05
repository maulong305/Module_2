package Week1.addElement;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arrNumber = {10,4,6,7,8,0,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần thêm");
        int number = scanner.nextInt();
        System.out.println("nhập chỉ số vị trí muốn thêm");
        int index = scanner.nextInt();
        if (index < 0 || index >= arrNumber.length-1){
            System.out.println("Cant not add element");
        }else {
            for (int i = 0; i < arrNumber.length; i++) {
                if (i == index) {
                    for (int j = arrNumber.length-1; j > i; j--) {
                        arrNumber[j] = arrNumber[j-1];
                    }
                    arrNumber[i] = number;
                }
            }
            for (int i : arrNumber) {
                System.out.print(i + " ");
            }

        }
    }
}
