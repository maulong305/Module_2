import java.io.*;
import java.util.List;

public class ReadFile {

    static private String motelRoomListFileLocation = "D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\motelRoomList.csv";
    static private String couterFileLocation = "D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\counterList.csv";


    public static void readMotelRoomFile(List<MotelRoom> motelRoomList) throws IOException, ClassNotFoundException {
        File fileMotelRoomList = new File(motelRoomListFileLocation);

        if (fileMotelRoomList.exists() && fileMotelRoomList.isFile()) {
            FileInputStream fis = new FileInputStream(motelRoomListFileLocation);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            motelRoomList = (List<MotelRoom>)ois.readObject();

            List<MotelRoom> listData = motelRoomList;

            for (int i = 0; i < listData.size(); i++) {
                MotelRoom motelRoom = listData.get(i);

                motelRoomList.add(motelRoom);
            }
            bis.close();
        }
    }
    public static void readCounterFile() throws IOException {
        File fileCouter = new File(couterFileLocation);

        if (fileCouter.exists() && fileCouter.isFile()) {
            FileReader frCounter = new FileReader(couterFileLocation);
            int counter = (int)frCounter.read();
            frCounter.close();

            MotelRoom.count = counter;


        }
    }
}
