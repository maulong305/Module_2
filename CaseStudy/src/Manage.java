
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        tạo danh sách chứa phòng
        List<Room> listRoom = new ArrayList<>();
        List<Renter> listRenter = new ArrayList<>();
//    tạo menu cho người dùng
        System.out.println("Menu : ");
        System.out.println("Enter 1: Room Manager ");
        System.out.println("Enter 2: Renter Manager ");
        System.out.println("Enter 3: Break ");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n == 1) { //Quản lý Phòng
                RoomManagement.menu(listRoom);
            }

             else if ( n==2 ) { //quản lý danh sách khách thuê.

             }
        }


    }
}
