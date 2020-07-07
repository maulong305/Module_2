import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<MotelRoom> motelRoomList = new ArrayList<>();

        System.out.println("            Menu ");
        System.out.println("Enter 1 : RoomManage Menu ");
        System.out.println("///");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n == 1) {
                MenuManagement.menu(motelRoomList);

            }
        }
    }
}
