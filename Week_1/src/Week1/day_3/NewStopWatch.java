package day_3;

import java.util.Date;

public class NewStopWatch {
    //    khai báo biến thời gian bắt đầu và kết thúc
    private long startTime, endTime;

    //    khai báo phương thức getter cho 2 biến trên
//getter chỉ lấy giá trị ra ko gán vào.
    public long getStartTime() {

        return startTime;
    }

    public long getEndTime() {

        return endTime;
    }

    //    khởi tạo ko tham số, ko cần contructor
//    khai báo phương thức start()
    public void start() {

        this.startTime = new Date().getTime();
    }

    //    khai báo phương thức stop()
    public void stop() {

        this.endTime = new Date().getTime();
    }

    //    khai báo phương thức getElapsedTime()
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
//        lấy thời gian bắt đầu
        NewStopWatch newStopWatch = new NewStopWatch();
        newStopWatch.start();
//        sắp xếp mảng
//        Arrays.sort(array);
        seLection(array);
//        lấy thời gian kết thúc
        newStopWatch.stop();
//        lấy thời gian sắp xếp
        newStopWatch.getElapsedTime();
        System.out.println(newStopWatch.getElapsedTime());
    }
    public static double[] seLection(double[] array) {
        for (int i=0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
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
