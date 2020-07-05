package Week1.findMaxElement;

import java.util.Random;

public class MaxElement {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rd.nextInt(99);
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max = arr[0][0];
        int x = 0;
        int y = 0;
        for ( int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.print("Max is " + max +
                " " +
                "position is " + x + ":" + y);
    }
}
