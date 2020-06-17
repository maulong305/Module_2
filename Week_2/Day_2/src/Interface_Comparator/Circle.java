package Interface_Comparator;

//khai báo lớp
public class Circle extends Shape {
    //    khai báo thuộc tính
    private double radius = 1.0;
    //    PT khởi tạo không tham số
    public Circle() {

    }
    //   phương thức khởi tạo có tham số
    public Circle(double radius) {
        super("red",false);
        this.radius = radius;

    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    //getter
    public double getRadius() {
        return radius;
    }
    public  double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+ radius +", which is a subclass of Shape";
    }
}
