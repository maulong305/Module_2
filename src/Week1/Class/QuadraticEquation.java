package Week1.Class;

public class QuadraticEquation {
    //khai báo hệ số của pt.
    private double a,b,c;
    //phương thức khởi tạo.
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //lấy giá trị hệ số.

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //tính delta
    double delta;
    public double getDelta(){
        delta = (b*b - 4*a*c);
        return delta;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(delta))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(delta))/(2*a);
    }
//Chạy và in ra kết quả
    public static void main(String[] args) {
        QuadraticEquation nghiem = new QuadraticEquation(1,4,3);
        if (nghiem.getDelta() > 0) {
            System.out.println("pt có 2 nghiệm là: " + nghiem.getRoot1() + " " + nghiem.getRoot2());
        }
        else if (nghiem.getDelta() == 0) {
            System.out.println("pt có nghiệm kép là : " + nghiem.getRoot2());
        }
        else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
