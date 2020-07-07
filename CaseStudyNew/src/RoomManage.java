import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RoomManage {

//    Create room
    static MotelRoom create() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter motelRoomName : ");
        String motelRoomName = scanner.nextLine();

        System.out.println("Enter motelRoomArea : ");
        double motelRoomArea = scanner.nextDouble();

        System.out.println("Enter rates : ");
        int rates = scanner.nextInt();

        MotelRoom motelRoom = new MotelRoom(motelRoomName, motelRoomArea, rates);

        return motelRoom;



    }

//    Delete room

    static void delete(List<MotelRoom> motelRoomList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter idMotelRoom : ");
        int idMotelRoom = scanner.nextInt();

        for (int i = 0; i < motelRoomList.size(); i++) {
            if (idMotelRoom == motelRoomList.get(i).getIdMotelRoom()) {
                motelRoomList.remove(i);
                break;
            }
        }
    }

//    Repair room
    static void repair(List<MotelRoom> motelRoomList) {
        Scanner scanner = new Scanner(System.in);
        int idMotelRoom = scanner.nextInt();

        for (int i = 0; i < motelRoomList.size(); i++) {
            if (idMotelRoom == motelRoomList.get(i).getIdMotelRoom()) {
                System.out.println("Enter New Name : ");
                String newName = scanner.nextLine();

                System.out.println("Enter New Area : ");
                double newArea = scanner.nextDouble();

                System.out.println("Enter Rates : ");
                int newRates = scanner.nextInt();

                motelRoomList.get(i).setMotelRoomName(newName);
                motelRoomList.get(i).setMotelRoomArea(newArea);
                motelRoomList.get(i).setRates(newRates);

                break;


            }else {
                System.out.println("Id not found. " +
                        "\n" + "Please try again!");
            }
        }
    }

//    Display motelRoomList

    static void display(List<MotelRoom> motelRoomList) {
        for (int i = 0; i < motelRoomList.size(); i++) {
            System.out.println(motelRoomList.get(i));
        }
    }

//    Search motelRoom

    static void searchRoom(List<MotelRoom> motelRoomList) {
        Scanner scanner = new Scanner(System.in);
        int idRoom = scanner.nextInt();

        for (int i = 0; i < motelRoomList.size(); i++) {
            if (idRoom == motelRoomList.get(i).getIdMotelRoom()) {
                System.out.println(motelRoomList.get(i));
                break;
            }else {
                System.out.println("Id not found. " +
                        "\n" + "Please try again!");
            }
        }

    }

}
