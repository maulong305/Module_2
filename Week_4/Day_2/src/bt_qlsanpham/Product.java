package bt_qlsanpham;

import java.io.Serializable;

public class Product implements Serializable {
    //    khai báo thuộc tính
    private String brand;
    private String productName;
    private int price;
    private String orther;

    //    phương thức khởi tạo
    public Product(
                   String brand,
                   String productName,
                   int price) {
        this.brand = brand;
        this.productName = productName;
        this.price = price;

    }

//    getter, setter


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}