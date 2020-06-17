package point2Dpoint3D;

public class TestPoint2D3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(22,77);
        point2D.setXY(44,99);
        System.out.println(point2D);

        Point3D point3D = new Point3D(22,44,99);
        System.out.println(point3D);

    }
}
