import java.io.*;
import java.util.List;
import java.util.Scanner;

public class RoomManagement {

    static Room create(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Room Number : ");
        String roomName = scanner.next();
//                System.out.println(roomName);
        System.out.println("Enter Room Are : ");
        double roomArea = scanner.nextDouble();

        System.out.println("Enter Room Rates :");
        int roomRates = scanner.nextInt();

        Room room = new Room(roomName, roomArea, roomRates);

        return room;
    }

    static void delete(List<Room> listRoom) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Room ID : ");
        int roomId = scanner.nextInt();

        for (int i = 0; i < listRoom.size(); i++) {
            if (roomId == listRoom.get(i).getIdRoom()) {
                listRoom.remove(i);

                break;
            }
        }
    }

    static void readFile(List<Room> listRoom) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(
                "D:\\Bai_tap\\Module_2\\CaseStudy\\src\\listRoom.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        List<Room> listData = (List<Room>)ois.readObject();
        for (int i = 0; i < listData.size(); i++) {
            Room room1 = listData.get(i);
            listRoom.add(room1);
        }
//                listRoom = (List<Room>)ois.readObject();
        ois.close();
    }

    public static void menu(List<Room> listRoom) throws IOException, ClassNotFoundException {
        System.out.println("Enter 1: Add Room ");
        System.out.println("Enter 2: Delete Room ");
        System.out.println("Enter 3: Repair Room ");
        System.out.println("Enter 4: Write to file ");
        System.out.println("Enter 5: Show room list ");

        if (listRoom.size() == 0) {
            readFile(listRoom);
        }

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        switch (m) {
            case 1: // thêm phòng vào danh sách
                Room room = create();

                listRoom.add(room);

                break;
            case 2: // xóa phòng khỏi danh sách
                delete(listRoom);

                break;

            case 3: // sửa phòng trong danh sách
                System.out.println("Enter Room ID : ");
                int roomId1 = scanner.nextInt();

                for (int i = 0; i < listRoom.size(); i++) {
                    if (roomId1 == listRoom.get(i).getIdRoom()) {
                        System.out.println("Enter new Name");
                        scanner.next();
                        String newName = scanner.nextLine();

                        System.out.println("Enter new Area");
                        double newArea = scanner.nextDouble();

                        System.out.println("Enter new Rates");
                        int newRates = scanner.nextInt();

                        listRoom.get(i).setRoomName(newName);
                        listRoom.get(i).setRoomArea(newArea);
                        listRoom.get(i).setRoomRates(newRates);
                    }
                }
                break;
            case 4://write to file
                FileOutputStream fos = new FileOutputStream(
                        "D:\\Bai_tap\\Module_2\\CaseStudy\\src\\listRoom.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos);
                oos.writeObject(listRoom);
                oos.close();

                break;
            case 5:// hiển thị
                for (int i = 0; i < listRoom.size(); i++) {
                    System.out.print(listRoom.get(i));
                }
                break;
        }
    }
}
