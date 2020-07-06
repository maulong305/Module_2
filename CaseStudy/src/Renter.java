public class Renter {
//    khai báo thuộc tính
    private int idRenter = 0;
    private String nameRenter;
    private String phoneNumber;
    private String idNumber;
    private String roomName;

    static int count = 0;
//    phương thức khởi tạo

    public Renter(String nameRenter, String phoneNumber, String idNumber, String roomName) {
        this.nameRenter = nameRenter;
        this.phoneNumber = phoneNumber;
        this.idNumber = idNumber;
        this.roomName = roomName;
    }

//    getter , setter


    public int getIdRenter() {
        return idRenter;
    }

    public void setIdRenter(int idRenter) {
        this.idRenter = idRenter;
    }

    public String getNameRenter() {
        return nameRenter;
    }

    public void setNameRenter(String nameRenter) {
        this.nameRenter = nameRenter;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return
                "idRenter=" + idRenter +
                ", nameRenter='" + nameRenter + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", roomName=" + roomName + " ";
    }
}
