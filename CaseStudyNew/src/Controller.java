import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\roomlist.dat");
        FileInputStream fis = new FileInputStream(file);
        if (file.canRead()){
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = null;
            while ((obj = ois.readObject()) != null){
                MenuManagement.motelRoomList.add((MotelRoom) obj);
            }
            fis.close();
            ois.close();
        }
        else {
            System.out.println("khong doc dc file");
        }


        System.out.println("            Menu ");
        System.out.println("Enter 1 : RoomManage Menu ");
        System.out.println("///");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n == 1) {
                MenuManagement.menu();

            }
        }
    }
}
