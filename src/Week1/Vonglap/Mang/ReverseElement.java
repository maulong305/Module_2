package Week1.Vonglap.Mang;

import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter Element : " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length - j; j++) {
            int x = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = x;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j : array) {
            System.out.println(j + "\t");
        }

    }

}
