import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;

public class RenterManagement {
    static Renter Create() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name Renter : ");
        String nameRenter = scanner.nextLine();

        System.out.println("Enter Phone Number : ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter Identification Number : ");
        String idNumber = scanner.nextLine();

        System.out.println("Enter Room Name : ");
        String roomName = scanner.nextLine();

        Renter renter = new Renter(nameRenter, phoneNumber, idNumber, roomName);

        return renter;

    }

    static void delete(List<Renter> listRenter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID Renter : ");
        int idRenter = scanner.nextInt();

        for (int i = 0; i < listRenter.size(); i++) {
            if (idRenter == listRenter.get(i).getIdRenter()) {
                listRenter.remove(i);
                break;
            }
        }
    }

     static void readFile(List<Renter> listRenter) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(
                "D:\\Bai_tap\\Module_2\\CaseStudy\\src\\listRenter.csv");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        listRenter = (List<Renter>) ois.readObject();
        ois.close();
    }
}
