package Week1.Vonglap;

import java.util.Scanner;

public class TwentyBulk {
    public static void main(String[] args) {
        int numbers;
        Scanner scanner = new Scanner(System.in);
        numbers = scanner.nextInt();
        int count = 0;
        int n = 2;

       while (count < numbers) {
           boolean check = true;
           for (int i = 2; i <= n/2; i++) {
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
