package demo_comparator;

public class Student {
//    khai bao thuoc tinh
    private String name;
    private int age;
//    ham khoi tao
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
//getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//ghi de toString

    @Override
    public String toString() {
        return "Studen " + name + " age " + age;
    }
}
