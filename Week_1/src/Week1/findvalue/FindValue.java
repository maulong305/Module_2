package findvalue;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
//        khai báo mảng chứa tên sv
        String arrstudent[] = {"alison", "van dijk", "matip", "robertson", "trent"};
//        khai báo biến lưu tên tìm kiếm và gán với giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String inputName = scanner.nextLine();
//        duyệt mảng tìm giá trị
        boolean isExist = false;
        for (int i = 0; i < arrstudent.length; i++){
            if (inputName.equals(arrstudent[i])) {
                System.out.println(i+1);
                isExist = true;
            }

        }
        if (isExist == false){
            System.out.println("not found");
        }

    }
}

