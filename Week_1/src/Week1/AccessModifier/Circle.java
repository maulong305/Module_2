package Week1.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle() {

    }
    Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2);
        System.out.println(circle1.getRadius() + " " + circle1.getArea());
        System.out.println(circle2.getRadius() + " " + circle2.getArea());
        circle1.setRadius(10);
        System.out.println(circle1.getRadius() + " " + circle1.getArea());
    }
}
