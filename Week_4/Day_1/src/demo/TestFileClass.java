package demo;

public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/us.gif");
        System.out.println("does it exist ? " + file.exists());
        System.out.println("the file has " + file.length() + "byte");
        
    }
}
