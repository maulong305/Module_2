import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MenuManagement {
    public static void menu(List<MotelRoom> motelRoomList) throws IOException, ClassNotFoundException {
        System.out.println("Enter 1: Add Room ");
        System.out.println("Enter 2: Delete Room ");
        System.out.println("Enter 3: Repair Room ");
        System.out.println("Enter 4: Search ");
        System.out.println("Enter 5: Display ");

        if (motelRoomList.size() != 0) {
            ReadFile.readCounterFile();
            ReadFile.readMotelRoomFile(motelRoomList);
        }

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        switch (m) {
            case 1:
                RoomManage.create();
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
                RoomManage.display(motelRoomList);
                break;

        }

    }
}
