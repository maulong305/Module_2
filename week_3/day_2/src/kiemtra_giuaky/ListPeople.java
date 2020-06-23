package kiemtra_giuaky;

public class ListPeople<S> {
//    khai báo thuộc tính tên, tuổi
    private String name;
    private int age;
    private int id =0;
    static int count = 0;

//    phương thức khởi tạo có tham số
    public ListPeople(String name, int age) {
        this.age = age;
        this.name = name;
        this.id = count;
        count++;

    }

    public ListPeople() {

    }
//    Cài đặt phương thức


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getId() { return id; }

    @Override
    public String toString() {
        return  " id: " + getId() +
                " name: " + getName() +
                " , age: " + getAge();
    }
}
