import java.util.Scanner;

public class BulkLess100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = 2;
        int count = 0;
        while (n <= number) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n%i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
