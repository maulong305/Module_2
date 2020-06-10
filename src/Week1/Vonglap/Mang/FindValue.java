package Week1.Vonglap.Mang;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"Alison", "Robertson", "Van Dijk", "Arnol", "Fabinho", "Wjinadium", "Henderson", "Mane", "Firmino", "Salah"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String inputName = scanner.nextLine();
        boolean isExist = true;
        for (String student : students) {
            if (student.equals(inputName)) {
                System.out.println(inputName + "in the students");
                isExist = false;
                break;
            }
        }
        if (isExist) {
            System.out.println("This name is not in the list");
        }
    }
}
