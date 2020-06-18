package point_moveablepoint;

public class MoveablePoint extends Point {
//    khai báo thuộc tính mở rộng
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
//    phương thức khởi tạo
    public MoveablePoint(){

    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

//    getter, setter

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arraySpeed = new float[2];
        arraySpeed[0] = xSpeed;
        arraySpeed[1] = ySpeed;
        return arraySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.ySpeed = xSpeed;
        this.ySpeed = ySpeed;
    }




    public MoveablePoint move(){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+ ySpeed);
        return this;
    }

//    khai báo phương thức toString

        @Override
        public String toString() {
            return "this position has the coordinantes of" + "("
                    + getX() + ", " + getY() +  ")";
        }

}
