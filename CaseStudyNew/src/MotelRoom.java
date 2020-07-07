import java.io.FileWriter;
import java.io.IOException;

public class MotelRoom {
    private int idMotelRoom;
    private String motelRoomName;
    private double motelRoomArea;
    private int rates;

    static int count;

    public MotelRoom(String motelRoomName, double motelRoomArea, int rates) throws IOException {

        count++;
        FileWriter fileWriter = new FileWriter("D:\\Bai_tap\\Module_2\\CaseStudyNew\\src.listId.csv");
        fileWriter.write(count);
        fileWriter.close();

        this.motelRoomName = motelRoomName;
        this.motelRoomArea = motelRoomArea;
        this.rates = rates;
    }

    public int getIdMotelRoom() {
        return idMotelRoom;
    }

    public void setIdMotelRoom(int idMotelRoom) {
        this.idMotelRoom = idMotelRoom;
    }

    public String getMotelRoomName() {
        return motelRoomName;
    }

    public void setMotelRoomName(String motelRoomName) {
        this.motelRoomName = motelRoomName;
    }

    public double getMotelRoomArea() {
        return motelRoomArea;
    }

    public void setMotelRoomArea(double motelRoomArea) {
        this.motelRoomArea = motelRoomArea;
    }

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MotelRoom.count = count;
    }

    @Override
    public String toString() {
        return
                "idMotelRoom=" + idMotelRoom +
                ", motelRoomName='" + motelRoomName + '\'' +
                ", motelRoomArea=" + motelRoomArea +
                ", rates=" + rates ;
    }
}
