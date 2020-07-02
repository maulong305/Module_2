package bt_qlsanpham;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        tạo danh sách sản phẩm dùng ArrayList
        List<Product> listProduct = new ArrayList<Product>();
        listProduct.add(new Product( "Nomos", "Metro",2800));
        listProduct.add(new Product( "Nomos", "Tangente",1800));
        listProduct.add(new Product( "Nomos", "Lambda",12000));
//        tạo menu
        System.out.println("Menu : ");
        System.out.println("Enter 1: Hiển thị danh sách");
        System.out.println("Enter 2: Ghi vào file");
        System.out.println("Enter 3: Thêm sản phẩm vào danh sách");
        System.out.println("Enter 4: Tìm kiếm sản phẩm");

//        Đọc file
        FileInputStream fis = new FileInputStream(
                "D:\\Bai_tap\\Module_2\\Week_4\\Day_2\\src\\bt_qlsanpham\\dongho.txt");

        BufferedInputStream bis = new BufferedInputStream(fis); //ghi vào bộ nhớ đệm
        ObjectInputStream ois = new ObjectInputStream(bis); //đọc đối tượng
        listProduct = (List<Product>)ois.readObject();


        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            switch (n) {
                case 1: //Hiển thị danh sách

                    for (int i = 0; i < listProduct.size(); i++) {
                        System.out.println(listProduct.get(i));
                    }

                    break;
                case 2: //Ghi vào file
                    FileOutputStream fos = new FileOutputStream(
                            "D:/Bai_tap/Module_2/Week_4/Day_2/src/bt_qlsanpham/dongho.txt");
                    BufferedOutputStream bos = new BufferedOutputStream(fos);
                    ObjectOutputStream oos = new ObjectOutputStream(bos);
//                    for (int i = 0; i < listProduct.size(); i++) {
//                        oos.writeObject(listProduct.get(i));
//                    }
                    oos.writeObject(listProduct);
                    oos.close();
                    break;

                case 3: // Thêm sản phẩm vào danh sách
                    System.out.println("Enter brand watch : ");
                    String brand = scanner.nextLine();

                    System.out.println("Enter product name : ");
                    String nameProduct = scanner.nextLine();

                    System.out.println("Enter price : ");
                    int price = scanner.nextInt();

                    Product product = new Product(brand, nameProduct, price);
                    listProduct.add(product);
                    break;


                case 4: // Tìm kiếm sản phẩm
                    scanner.nextLine();
                    System.out.println("Enter product name :");
                    String name1 = scanner.nextLine();
                    int index = -1;
                    for (int i = 0; i < listProduct.size(); i++) {
                        if (name1.equals(listProduct.get(i).getProductName()) ){
                            index = i;
                            break;
                        }
                    }
                    if(index == -1){
                        System.out.println("NOT FOUND");
                    }else{
                        System.out.println(listProduct.get(index));
                    }
                    break;

            }
        }


    }


}
