package th_ngoaile2;

import java.util.Random;

public class ArrayExample {
//    tạo phương thức CreateRandom trả về mảng số ngẫu nhiên tới 100
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
//        in ra các phần tử của mảng
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
