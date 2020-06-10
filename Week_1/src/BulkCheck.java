import java.util.Scanner;

public class BulkCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + "is not bulk");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number / 2) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + "is a bulk");

            }
            else {
                System.out.println(number + "is not bulk");
            }

        }
    }
}
