package bt_qlsanpham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestProduct {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//       tạo 1 đối tượng, nhập thông tin đầy đủ,
        Product product = new Product( "Nomos","Metro", 2800);
        Product product1 = new Product( "Rolex","DateJust", 15000);
        Product product2 = new Product("Omega","MoonWatch",  4800);
        Product product3 = new Product("Seiko","Padi" , 500);
//        ghi đối tượng đã tạo vào tệp (dùng In/OutputStream)
        FileOutputStream fos = new FileOutputStream("D:/Bai_tap/Module_2/Week_4/Day_2/src/bt_qlsanpham/Watch.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(product);
        oos.writeObject(product1);
        oos.writeObject(product2);
        oos.writeObject(product3);
        bos.close();
        fos.close();
//        Đọc đối tượng vừa ghi trong tệp để hiển thị ra màn hình
//        FileInputStream fis = new FileInputStream("D:/Bai_tap/Module_2/Week_4/Day_2/src/bt_qlsanpham/Watch.csv");
//        BufferedInputStream bis = new BufferedInputStream(fis);
//        ObjectInputStream ois = new ObjectInputStream(bis);
//        Product product1 = (Product)ois.readObject();
//        bis.close();
//        fis.close();

//        Tìm kiếm thông tin sp:
        List<Product> productList = new ArrayList<Product>();
        FileInputStream fis = new FileInputStream("D:/Bai_tap/Module_2/Week_4/Day_2/src/bt_qlsanpham/Watch.csv");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        for (int i = 0; bis.available() > 0; i++) {
            Product p = (Product)ois.readObject();
            productList.add(p);
            System.out.println("Hãng sản xuất: "+ productList.get(i).getBrand()
                    + " _ " + " Dòng: " + productList.get(i).getProductName()
            + " _ " + " Giá đề xuất:  " + productList.get(i).getPrice() + "$");
        }
        bis.close();
        fis.close();

//        Tạo 1 list product chứa các sp trong tệp
    }


}
