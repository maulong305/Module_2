import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuManagement {
    static List<MotelRoom> motelRoomList = new ArrayList<>();

    public static void menu() throws Exception {

        if (motelRoomList.size() == 0) {
            ReadFile.readCounterFile();
            ReadFile.readMotelRoomFile(motelRoomList);
        }

        System.out.println("Enter 1: Add Room ");
        System.out.println("Enter 2: Delete Room ");
        System.out.println("Enter 3: Edit Room ");
        System.out.println("Enter 4: Search ");
        System.out.println("Enter 5: Display ");



        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        switch (m) {
            case 1:
                MotelRoom newRoom = RoomManage.create();
                motelRoomList.add(newRoom);
                WriteFile.writerMotelRoomFile(motelRoomList);
                break;
            case 2:
                RoomManage.delete(motelRoomList);
                WriteFile.writerMotelRoomFile(motelRoomList);

                break;

            case 3:
                RoomManage.repair(motelRoomList);
                WriteFile.writerMotelRoomFile(motelRoomList);

                break;
            case 4:
                RoomManage.searchRoom(motelRoomList);
                break;
            case 5:
//                System.out.println(motelRoomList.size());
                RoomManage.display(motelRoomList);
                break;
            case 6:

        }

    }
}
