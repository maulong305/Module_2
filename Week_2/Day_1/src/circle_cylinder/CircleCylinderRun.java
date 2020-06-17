package circle_cylinder;

public class CircleCylinderRun {
    public static void main(String[] args) {
//      Tạo đối tượng hình tròn và gọi các phương thức.
        Circle circle = new Circle(2,"orange");
        double areaCircle = circle.getArea();
        double perimeterCircle = circle.getPerimeter();
        String text = circle.toString();
//        Tạo đối tượng hình trụ và gọi các phương thức
        Cylinder cylinder = new Cylinder(2,2,"red");
        double volume = cylinder.getVolume();
        String word = cylinder.toString();
        System.out.println(text);
        System.out.println(word);
    }
}
