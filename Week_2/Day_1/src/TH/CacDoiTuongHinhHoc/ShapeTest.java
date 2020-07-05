package TH.CacDoiTuongHinhHoc;

public class ShapeTest {
    public static void main(String[] args) {

//        Circle circle = new Circle(2, "yelow", true);
//        double area = circle.getArea();
//        double perimeter = circle.getPerimeter();
//        System.out.println(area);
//        System.out.println(perimeter);
//        String text = circle.toString();
//        System.out.println(text);

//        Rectangle rectangle = new Rectangle(2,2,"red",true);
//        double area = rectangle.getArea();
//        double perimeter = rectangle.getPerimeter();
//        System.out.println(area);
//        System.out.println(perimeter);
//        System.out.println(rectangle.toString());
//        String color = rectangle.getColor();
//        boolean filled = rectangle.isFilled();
//        System.out.println(color);
//        System.out.println(filled);
        Square square = new Square();
        double area = square.getArea();
        double perimeter = square.getPerimeter();
        square.howToColor();
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(square.toString());

    }
}
