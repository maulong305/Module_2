package pack;

import mypack.D;

public class A {
    public void msg() {
        System.out.println("hello");
    }
    protected void msg2() {
        System.out.println("Bye");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.msg2();

    }
}
