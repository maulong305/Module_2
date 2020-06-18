package point_moveablepoint;

public class TestPointMoveablePoint {
    public static void main(String[] args) {
//        khởi tạo đối tượng, gọi phương thức
        Point point = new Point(100,50);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(11,22,30,40);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
