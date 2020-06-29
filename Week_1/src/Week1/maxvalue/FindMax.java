package maxvalue;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
//        khai báo biến,
        int  size;
        int array[];
//        nhập giá trị vào mảng
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20 ) {
                System.out.println("size not exceed 20");
            }
        }while (size>20);

        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element " + (i +1) +":");
            array[i] = scanner.nextInt();
            i++;
        }
//        in ra mảng đã nhập
        System.out.print("asset list: ");
        for ( int j = 0; j < size; j++){
            System.out.print(array[j] + "\t");
        }
        System.out.println("\t");
        int max = array[0];
        int index = 1;
        for (int j = 0; j < size; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.print("Max asset is value :" + max + ", position is " + index);
    }
}
