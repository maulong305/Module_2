package staticMethod;

public class Bicycle {
    public static String str = "hello";
    public String str1 = "bye";
    static void msg() {
        System.out.println(str);
        Bicycle viHa = new Bicycle();
        System.out.println(viHa.str1);
    }
    public void msg1(){
        System.out.println(str1);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Bicycle.msg();
        Bicycle thongNhat = new Bicycle();
        thongNhat.msg1();
    }
}
