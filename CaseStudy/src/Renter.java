public class Renter {
//    khai báo thuộc tính
    static int idRenter = 0;
    private String nameRenter;
    private String phoneNumber;
    private String idNumber;
    private int roomNumber;
//    phương thức khởi tạo

    public Renter(String nameRenter, String phoneNumber, String idNumber, int roomNumber) {
        this.nameRenter = nameRenter;
        this.phoneNumber = phoneNumber;
        this.idNumber = idNumber;
        this.roomNumber = roomNumber;
    }
}
