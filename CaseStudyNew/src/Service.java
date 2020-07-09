import java.io.FileWriter;
import java.io.IOException;

public class Service {
    int id;
    int electricNumber = 0;
    int waterNumber = 0;
    int electricPrice = 3000;
    int waterPrice = 20000;
    static int count1;
    int room_id;

    public Service() throws IOException {
        count1++;
        FileWriter fileWriter1 = new FileWriter("D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\counterService.csv");
        fileWriter1.write(count1);
        fileWriter1.close();

        this.id = count1;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getElectricNumber() {
        return electricNumber;
    }

    public void setElectricNumber(int electricNumber) {
        this.electricNumber = electricNumber;
    }

    public int getWaterNumber() {
        return waterNumber;
    }

    public void setWaterNumber(int waterNumber) {
        this.waterNumber = waterNumber;
    }

    public int getElectricPrice() {
        return electricPrice;
    }

    public void setElectricPrice(int electricPrice) {
        this.electricPrice = electricPrice;
    }

    public int getWaterPrice() {
        return waterPrice;
    }

    public void setWaterPrice(int waterPrice) {
        this.waterPrice = waterPrice;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }
}
