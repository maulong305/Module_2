package th_ngoaile1;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        int x = scanner.nextInt();
        System.out.println("Enter Y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Tổng x - y = " + b);
            System.out.println("Tổng x * y = " + c);
            System.out.println("Tổng x / y = " + d);
        } catch (ArithmeticException e) {
            System.out.println("xảy ra ngoại lệ : ") ;
            System.out.println(e.getMessage());
        }
    }
}
