package TH.CacDoiTuongHinhHoc;

public class Square extends Rectangle implements Colorable {
//    khai báo thuộc tính side
    private double side = 1.0;
//    phương thức khởi tạo
    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }
//    getter, setter

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

//    ghi đè phương thức
    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four side ");
    }

    @Override
    public String toString() {
        return  "A Square with side=" + getSide() + ", which is a subclass of Rectangle";
    }
}
