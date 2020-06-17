package TH.CacDoiTuongHinhHoc;

public class Rectangle extends Shape {
//    khai báo thuộc tính width, length
    private double width = 1;
    private double length = 1;
//    phương thức khởi tạo ( 3 pt)
    public Rectangle() {

    }
     public Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
     }
     public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
     }

//    getter, setter

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //    khai báo phương thức getArea, getPerimeter

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*(width+length);
    }

//    cài đè phương thức toString

    @Override
    public String toString() {
        return "A Rectangle with width= "+ getWidth() +" and length= " + getLength() + ", which is a subclass of Shape";
    }

//    có 1 lớp con Square
}
