package day_3;

public class Fan {
//    khai báo 3 hằng số Slow, Medium, Fast
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
//    khai báo trường speed đề xác định tốc độ quạt, mặc định là slow
    private int speed = SLOW;

// khai báo trường on có kiểu private boolean để xác định quạt bật hay tăt mặc định là false.
    private boolean on = false;

//    khai báo radius có kiểu private double để xđịnh bán kính quạt(mặc định = 5)
    private double radius = 5;

    //    khai báo color kiểu private string, mặc định là blue
    private String color = "blue";

//    khai báo phương thức getter, setter

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Fan Fan1 = new Fan();

        Fan1.setColor("yellow");
        Fan1.setSpeed(3);
        Fan1.setRadius(10);
        Fan1.setOn(true);

        Fan Fan2 = new Fan();

        Fan2.setColor("red");
        Fan2.setSpeed(2);
        Fan2.setRadius(6);
        Fan2.setOn(false);

        System.out.println("Fan1 " + " màu " + Fan1.getColor() + " bán kính " + Fan1.getRadius() + " Tốc độ " + Fan1.getSpeed());

        System.out.println("Fan2 " + " màu " + Fan2.getColor() + " bán kính " + Fan2.getRadius() + " Tốc độ " + Fan2.getSpeed());

    }


//    khởi tạo ko tham số đối tượng fan mặc định


//    phương thức toString() trả về chuỗi chứa thông tin quạt
}
