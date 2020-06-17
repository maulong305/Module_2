package circle_cylinder;

public class Cylinder extends Circle {
//    khai báo thuộc tính mở rộng (chiều cao)
    private double hight = 1;
//    khai báo phương thức khởi tạo
    public Cylinder(){

    }
    public Cylinder(double hight, double radius, String color) {
        super(radius, color);
        this.hight = hight;
    }
//khai báo phương thức mở rông (tính thể tích)
    public double getHight() {
        return hight;
    }
    public double getVolume() {
        return getArea()*hight;
    }

    @Override
    public String toString() {
        return "this is cylinder with " + getVolume() + " which is a subclass Circle";
    }
}
