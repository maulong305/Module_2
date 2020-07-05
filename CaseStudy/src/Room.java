import java.io.Serializable;

public class Room implements Serializable {
//    khai báo các thuộc tính
    private int idRoom;
    private String roomName;
    private double roomArea;
    private int roomRates;

    static int count = 0;

//    phương thức khởi tạo

    public Room(String roomName, double roomArea, int roomRates) {

        count++;

        this.idRoom = count;
        this.roomName = roomName;
        this.roomArea = roomArea;
        this.roomRates = roomRates;

    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public int getRoomRates() {
        return roomRates;
    }

    public void setRoomRates(int roomRates) {
        this.roomRates = roomRates;
    }

    @Override
    public String toString() {
        return  "idRoom : " + idRoom +
                ", roomName : " + roomName + '\'' +
                ", roomArea : " + roomArea +
                ", roomRates : " + roomRates + "\n";
    }
}
