package point_moveablepoint;

public class Point {
//    khai báo thuộc tính
    private float x = 0.0f;
    private float y = 0.0f;
//    Phương thức khởi tạo
    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
//    getter setter

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(float x, float y) {
        float[] arrayLocation = new float[2];
        arrayLocation[0] = x;
        arrayLocation[1] = y;
        return arrayLocation;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

//    Phương thức toString

    @Override
    public String toString() {
        return "this position has the coordinantes of" + "("
                + x + ", " + y + ")";
    }
}
