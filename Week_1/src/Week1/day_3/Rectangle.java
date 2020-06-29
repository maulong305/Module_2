package day_3;

public class Rectangle {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {

        return this.height*this.width;
    }
    public double getPerimeter() {
        return (this.height+this.width)*2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Area is:" + rectangle.getArea());
        System.out.println("Perimeter í : " + rectangle.getPerimeter());
    }
}
