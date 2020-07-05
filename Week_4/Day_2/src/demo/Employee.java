package demo;

import java.io.*;

public class Employee implements Serializable {
    private String name;
    private String addres;

    public static void main(String[] args) throws IOException {
        Employee e = new Employee();
        e.name = "Vinh";
        e.addres = "HN";
        File file = new File("demo.txt");

        System.out.println(file.getAbsoluteFile());
        FileOutputStream fos  = new FileOutputStream("demo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        oos.close();
        fos.close();

    }
}
