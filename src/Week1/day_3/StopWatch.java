package day_3;

import java.util.Date;

public class StopWatch {
    private long startTime, endTime;

//    khai báo phương thức
    public void start() {
        this.startTime = new Date().getTime();
    }

    public void stop() {
        this.endTime = new Date().getTime();
    }
//    phương thức trả về

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return this.getEndTime() - this.getStartTime();
    }

    public static void main(String[] args) {
//        khởi tạo mảng 100000 phần tử số
        int size = 100000;
        double[] array = new double[(int)size];

        for (int i = 0; i < size; i++) {
            array[i] = Math.floor(Math.random() * size);
        }
        StopWatch newStopWatch = new StopWatch();
        newStopWatch.start();

        selection(array);

        newStopWatch.stop();

//        lấy thời gian sắp xếp
        newStopWatch.getElapsedTime();
        System.out.println(newStopWatch.getElapsedTime());
    }
//    phương thức sắp xếp mảng
    public static double[] selection(double[] array) {
        int sizeArray = array.length;

        for (int i=0; i < sizeArray; i++) {
            for (int j = i+1; j < sizeArray - 1; j++) {
                if (array[i] > array[j]) {
                    double temp = array[j];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        return array;

    }

}
