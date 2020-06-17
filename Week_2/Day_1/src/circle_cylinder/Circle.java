package circle_cylinder;

public class Circle {
//    khai báo thuộc tính (bán kính, màu sắc)
    private double radius = 1;
    private String color = "pink";
//  Phương thức khởi tạo
    public Circle(){

    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
//    getter, setter

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

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "this is circle, with radius " + radius +
                " and with color " + color ;
    }
}
