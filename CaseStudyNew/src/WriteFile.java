import java.io.*;
import java.util.List;

public class WriteFile {

    public static void writeFileCounter() throws IOException {
//        FileOutputStream fos = new FileOutputStream(
//                "D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\counterList.csv");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        bos.close();
        FileWriter fwCounter = new FileWriter(
                "D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\counterList.csv");
        fwCounter.close();
    }

    public static void writerMotelRoomFile() throws IOException {
        FileOutputStream fos = new FileOutputStream(
                "D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\motelRoomList.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        for (MotelRoom m : MenuManagement.motelRoomList) {
            oos.writeObject(m);

        }
        fos.close();
        bos.close();
        oos.close();
    }
}
