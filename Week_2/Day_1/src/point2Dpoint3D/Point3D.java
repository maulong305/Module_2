package point2Dpoint3D;

public class Point3D extends Point2D{
//    khai báo thuộc tính mở rộng
    private float z = 0.0f;
//    phương thức khởi tạo
    public Point3D() {

    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
//    getter setter

    public float getZ() {
        return z;
    }
    public float[] getXYZ(float x, float y, float z) {
        float[] arrayPlace = new float[3];
        arrayPlace[0] = x;
        arrayPlace[1] = y;
        arrayPlace[2] = z;
        return arrayPlace;
    }

    public void setZ(float z) {
        this.z = z;
    }

//    phương thức toString

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
