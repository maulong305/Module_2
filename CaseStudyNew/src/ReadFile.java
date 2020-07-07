import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    static private String motelRoomListFileLocation = "D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\motelRoomList.csv";
    static private String couterFileLocation = "D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\counterList.csv";

    public static List<MotelRoom> readMotelRoomFile() throws Exception {
//        File fileMotelRoomList = new File(motelRoomListFileLocation);

//        if (fileMotelRoomList.exists() && fileMotelRoomList.isFile()) {
        FileInputStream fis = new FileInputStream(motelRoomListFileLocation);
//        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<MotelRoom> list = new ArrayList<>();
        Object obj = null;
        while ((obj = ois.readObject()) != null) {
            list.add((MotelRoom)obj);
        }
        fis.close();
//        bis.close();
        ois.close();
return  list;

//        motelRoomList = (List<MotelRoom>) ois.readObject();
//
//        List<MotelRoom> listData = motelRoomList;
//
//        for (int i = 0; i < listData.size(); i++) {
//            MotelRoom motelRoom = listData.get(i);
//
//            motelRoomList.add(motelRoom);
//        }
//        bis.close();
    }

//    public static void readCounterFile() throws IOException {
//        File fileCouter = new File(couterFileLocation);
//
//        if (fileCouter.exists() && fileCouter.isFile()) {
//            FileReader frCounter = new FileReader(couterFileLocation);
//            int counter = (int) frCounter.read();
//            frCounter.close();
//
//            MotelRoom.count = counter;
//
//
//        }
//    }
}
