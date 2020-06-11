package Week1.Class;

import java.util.Date;

public class StopWatch {
    //    khai báo thời gian bắt đầu, kết thúc
    private long startTime, endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
//    public long getStatTime() {
//
//        return this.startTime = new Date().getTime();
//    }
//
//    public long getEndTime() {
//
//        return this.endTime = new Date().getTime();
//    }
//    public long getElapsedTime() {
//
//        return this.endTime - this.startTime;
//    }

    public static void main(String[] args) {
//        khởi tạo mảng chứa 100000 phần tử số.
//lấy thời gian bắt đầu
        long startTime = new Date().getTime();

//        System.out.println("StatTime = " + stopWatch.getStatTime());

//    sắp xếp phần tử
//    lấy thời gian kết thúc việc sx.
        long endTime = new Date().getTime();
//        StopWatch stopWatch = new StopWatch(startTime, endTime);
//    lấy thời gian sx
        long elapsedTime = endTime - startTime;
    }
}
