import java.io.*;
import java.util.List;

public class WriteFile {

    public static void writerMotelRoomFile(List<MotelRoom> motelRoomList) throws IOException {
        FileOutputStream fos = new FileOutputStream(
                "D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\motelRoomList.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(motelRoomList);

//        for (MotelRoom m : MenuManagement.motelRoomList) {
//            oos.writeObject(m);

//        }
        bos.flush();
        bos.close();
        fos.close();
    }
}
