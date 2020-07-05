package demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ThreadDemo implements Runnable{
    private int budget = 1000;

    @Override
    public synchronized void run() {

    }
    static class Table {
//        void printTable
    }
}
class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sđt vào: ");
        String number = scanner.next();
        boolean isCheck = number.matches("(0|[+])[0-9]{9,11}");
        if (!isCheck) {
            System.out.println("số đt không đúng");
        }else {
            System.out.println("số điện thoại đúng");
        }
    }
}